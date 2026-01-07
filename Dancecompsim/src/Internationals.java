import java.util.ArrayList;
/**
 * 
 * @author samirayusuf
 * International competition class
 * extends from competition
 *
 */
public class Internationals extends Competition{
private ArrayList<Dancer> compdancers = new ArrayList<Dancer>();
private int moves;
	

//constructor
	public Internationals (String nm) {
		super(nm );
		
	}
	
	/**
	 *  checks eligibilty then informs user to start
	 */
	
public String Start(Dancer x) {
	
	x.nullpoints();
		
		if (x.getnat() == "complete") {
		
		return "Begin Dancing for Internationls";
		} else {
			return "You aren't eligible yet";
		}
		
		
		
		
	}
/**
 * function to go through levels of the competition
 */
	
	public String levelup( Regionals w, Dancer x, String skill ){
		//holds info
		String hold = ""; 
		
		if (x.getnat() == "complete") {
		moves++;
		compdancers.add(x);
		if(x instanceof Intermediate) {
			((Intermediate)x).intpointalloc(skill);
		} else if(x instanceof Advanced) {
			((Advanced) x).advpointalloc(skill);
		} else if(x instanceof Beginner) {
			((Beginner) x).begpointalloc(skill);
		}
		
		if(x.getpoints() >= 25000 && x.getpoints() < 45000 && x.getskill().contains(skill)) {
			hold = "You have gotten through the first level";
			
		} else if (x.getpoints()>=45000 && x.getpoints() < 70000 && x.getskill().contains(skill)) {
			hold = "you have gotten through the second round";
			
		} else if (x.getpoints()>= 70000 && x.getpoints() < 100000 && x.getskill().contains(skill)) {
			hold = "you have gotten through the third round, you won the competition";
			x.updateintl("t");
		} else if (x.getpoints() < 100000 && moves == 10) {
			hold = "Unfortunately, you didn't earn enough points. You will have to restart internationals";
			
			restart(x);
		} else if(!x.getskill().contains(skill)) {
			disqualify(w,x);
			hold = "You have been disqualified";
			moves = 0;
			
			
			
		}} else {
			
			hold = "You are not yet eligible";
			
			
			
		}
			
			
			return hold;
		
	}
	
	//changes status of dancer
	
public void disqualify(Regionals w, Dancer x) {
		
		w.Start(x);
		
		x.nullpoints();
		x.updatenat("g");
		x.updateintl("g");
		x.updatereg("g");
		
	}
	
//restart current competition level
	
	public void restart(Dancer x) {
		x.nullpoints();
		x.updateintl("g");
		
		
		Start(x);
		
		
	}

	
	
	  
	

}
