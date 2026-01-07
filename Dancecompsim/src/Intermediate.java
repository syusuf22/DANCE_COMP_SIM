/**
 * 
 * @author Intermediate dancer class extending from Dancer
 * @see Dancer
 *
 */
public class Intermediate extends Dancer {
	
	private String regstatus = "incomplete";
	private String natstatus = "incomplete";
	private String intlstatus = "incomplete";
	
	//default constructor
	//calls on parent class constructor
	public Intermediate() {
		super();
	}
	
	/**
	 * 
	 * @param name sets name for the dancer
	 * @param age sets age for the dancer
	 * @param specialty specified dance style
	 */
	public Intermediate(String name, Integer age, String specialty) {
		super(name, age, specialty);
	}
	
	/**
	 * point allocator for beginner sets points for skills
	 * easier than advanced but harder than beginner 
	 * @param b
	 */
	
	public void intpointalloc(String b) {
		if(b == "cartwheel") {
			points = points + 3000;
		} else if (b == "handstand") {
			points = points + 6000;
		} else if (b == "walkover") {
			points = points + 8000;
		} else if (b == "handspring") {
			points = points + 10000;
		} else if (b == "Aerial") {
			points = points + 12000;
		} else if (b == "flip") {
			points = points + 17000;
		} else if (b == "kicks") {
			points = points + 3000;
		} else if (b == "tilt") {
			points = points + 6000;
		} else if (b == "turns") {
			points = points + 8000;
		} else if (b == "needle") {
			points = points + 10000;
		} else if (b == "illusion") {
			points = points + 12000;
		} else if (b == "switch leap") {
			points = points + 17000;
		} else if (b == "popping") {
			points = points + 3000;
		} else if (b == "isolations") {
			points = points + 6000;
		} else if (b == "windmill") {
			points = points + 8000;
		} else if (b == "headspring") {
			points = points + 10000;
		} else if (b == "headspin") {
			points = points + 12000;
		} else if (b == "btwist") {
			points = points + 17000;
		} 
		

		
	}
	/**
	 * returns eligibility status for nationals
	 */
	
	public String getnat() {
		
		return natstatus;
		
	}
	
	/**
	 * updates status of nationals to either complete or incomplete
	 */
	
	public void updatenat(String b) {
		if (b == "t") {
		natstatus = "complete";
		} else {
			natstatus = "incomplete";
		}
	}
	/**
	 * returns eligibility status for internationals
	 */
	
	public String getintl() {
		return intlstatus;
	}
	

	/**
	 * updates status of internationals to either complete or incomplete
	 */
	
	public void updateintl(String b) {
		if (b == "t") {
		intlstatus = "complete";
		} else {
			intlstatus = "incomplete";
		}
	}
	/**
	 * returns eligibility status for regionals
	 */
	
	public String getreg() {
		return regstatus;
	}

	/**
	 * updates status of regionals to either complete or incomplete
	 */
	public void updatereg(String b) {
		
		
	}
	

}
