import java.util.ArrayList;
/**
 * 
 * @author samirayusuf
 * Precomp competition class
 * extends from competition
 *
 */
public class Precomp  extends Competition{
ArrayList<Dancer> compdancers = new ArrayList<Dancer>();
	
	public Precomp (String name) {
		super( name);
		
	}
	//starts comp practice
	public String start() {
		
		return "Begin competition practice";
	}
	
	//informs user of practice progress
	public String levelup(Dancer x, String skill){
		String hold = ""; 
		((Beginner)x).begpointalloc(skill);
		
		if(x.getpoints() >= 150000) {
			hold = "You have gotten enough skills. You can begin regionals";
			
		} else {
			hold = "Practice a little more, Almost there";
		}
		
		return hold;
		
	}

	@Override
	public String Start(Dancer x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String levelup(Regionals w, Dancer x, String skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disqualify(Regionals w, Dancer x) {
		// TODO Auto-generated method stub
		
	}
	
	


}
