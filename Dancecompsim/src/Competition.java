/**
 * Competition class
 * parent class to Regionals, Nationals, Internationals
 */

import java.util.ArrayList;

public abstract class Competition {
	
	private ArrayList<Dancer> compdancers = new ArrayList<Dancer>();
	private String name;

	
	//competition constructor
	public Competition(String _name) {
		name = _name;
	}
	
	//abstract start class to be overridden
	public abstract String Start(Dancer x);
	
	//abstract start class to be overridden
	public abstract String levelup(Regionals w, Dancer x, String skill);
	
	//abstract start class to be overridden
	public abstract void disqualify(Regionals w, Dancer x);
	

}
