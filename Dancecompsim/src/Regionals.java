import java.util.ArrayList;

/**
 * 
 * @author samirayusuf
 * Regional competition class
 * extends from competition
 *
 */
public class Regionals extends Competition{
private ArrayList<Dancer> compdancers = new ArrayList<Dancer>();

int move_counter = 0;

	
	public Regionals (String name) {
		super( name);
	}
	/**
	 *  checks eligibilty then informs user to start
	 */
	public String Start(Dancer x) {
		
		x.nullpoints();
		
		return "Begin Dancing for Regionals";
		
		
		
		
	}
	/**
	 * function to go through levels of the competition
	 */
	
	public String levelup( Regionals w, Dancer x, String skill ){
		
		String hold = ""; 
		
		move_counter++;
		compdancers.add(x);
		
		if(x instanceof Intermediate) {
			((Intermediate)x).intpointalloc(skill);
		} else if(x instanceof Advanced) {
			((Advanced) x).advpointalloc(skill);
		} else if(x instanceof Beginner) {
			((Beginner) x).begpointalloc(skill);
		}
		
	
		if(x.getpoints() >= 15000 && x.getpoints() < 30000 && x.getskill().contains(skill)) {
			hold = "You have gotten through the first level";
			
		} else if (x.getpoints()>=30000 && x.getpoints() < 50000 && x.getskill().contains(skill)) {
			hold = "you have gotten through the second round";
			
		} else if (x.getpoints()>= 50 && x.getpoints() < 50000 && x.getskill().contains(skill)) {
			hold = "you have gotten through the third round, you can now move to nationals";
			x.updatereg("t");
		} else if (x.getpoints() < 50000 && move_counter == 10) {
			hold = "Unfortunately, you didn't earn enough points. You will have to restart regionals";
		} else if(!x.getskill().contains(skill)) {
			disqualify(w, x);
			hold = "You have been disqualified";
			move_counter = 0;
			
			
			
		} else {
			
			hold = "You are not yet eligible";
			
			
			
		}
			
			
			return hold;
		
	}
	//changes status of dancer
	public void disqualify(Regionals w, Dancer x) {
		
		w.Start(x);
		x.updatereg("g");
		
		x.nullpoints();
		
	}
	

	//restart current competition level
	public void restart(Dancer x) {
		x.nullpoints();
		x.updatereg("g");
		
		Start(x);
		
		
	}
	


}
