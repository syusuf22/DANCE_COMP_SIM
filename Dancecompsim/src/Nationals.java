import java.util.ArrayList;
/**
 * 
 * @author samirayusuf
 * Nationals competition class
 * extends from competition
 *
 */
public class Nationals extends Competition{
ArrayList<Dancer> compdancers = new ArrayList<Dancer>();
private int movement;

//constructor
	public Nationals (String nam) {
		super( nam);
		
	}
	
	/**
	 *  checks eligibilty then informs user to start
	 */
	public String Start( Dancer x) {
		x.nullpoints();
		
		if (x.getreg() == "complete") {
			
			return "Begin Dancing for Nationals";
			} else {
				return "You aren't eligible yet";
			}
		
		
		
	}
	/**
	 * function to go through levels of the competition
	 */
	public String levelup( Regionals w, Dancer x, String skill){
		
		String hold = "";
		
		if (x.getreg() =="complete") {
		movement++;
		
		compdancers.add(x);
		if(x instanceof Intermediate) {
			((Intermediate)x).intpointalloc(skill);
		} else if(x instanceof Advanced) {
			((Advanced) x).advpointalloc(skill);
		} else if(x instanceof Beginner) {
			((Beginner) x).begpointalloc(skill);
		}
		
		
		if(x.getpoints() >= 20000 && x.getpoints() < 35000 && x.getskill().contains(skill)) {
			hold = "You have gotten through the first level";
			
		} else if (x.getpoints()>=35000 && x.getpoints() < 60000 && x.getskill().contains(skill)) {
			hold = "you have gotten through the second round";
			
		} else if (x.getpoints()>= 60000 && x.getpoints() < 75000 && x.getskill().contains(skill)) {
			hold = "you have gotten through the third round, you can now move to nationals";
			
		} else if (x.getpoints() < 750000 && movement == 10) {
			hold = "Unfortunately, you didn't earn enough points. You will have to restart regionals";
		} else if(!x.getskill().contains(skill)) {
			
			hold = "You have been disqualified. You are starting from Regionals";
			disqualify(w,x);
			movement = 0;
			
			
		} 
		} else {
			hold = "You are not yet eligible";
		}
			
			
			return hold;
		
	}
	//changes status of dancer
	public void disqualify(Regionals w, Dancer x) {
		
		w.Start(x);
		
		x.nullpoints();
		x.updatereg("b");
		x.updatenat("b");
		
	}
	//restart current competition level
	public void restart(Dancer x) {
		x.nullpoints();
		x.updatenat("g");
		
		Start(x);
		
		
	}


}
