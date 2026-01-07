/**
 * 
 * @author Advanced dancer class extending from Dancers
 *
 */
public class Advanced extends Dancer {
	
	private String regstatus = "incomplete";
	private String natstatus = "incomplete";
	private String intlstatus = "incomplete";
	
	//default constructor
	//calls on parent class constructor
	
	public Advanced() {
		super();
	}
	
	/**
	 * 
	 * @param name sets name for the dancer
	 * @param age sets age for the dancer
	 * @param specialty specified dance style
	 */
	
	public Advanced(String name, Integer age, String specialty) {
		super(name, age, specialty);
	}
	
	/**
	 * point allocator for advanced sets points for skills
	 * advanced sets lower points than beginner and intermediate, so it's harder
	 * @param b
	 */
	public void advpointalloc(String b) {
		if(b == "cartwheel") {
			points = points + 2000;
		} else if (b == "handstand") {
			points = points + 3000;
		} else if (b == "walkover") {
			points = points + 5000;
		} else if (b == "handspring") {
			points = points + 7000;
		} else if (b == "Aerial") {
			points = points + 10000;
		} else if (b == "flip") {
			points = points + 15000;
		} else if (b == "kicks") {
			points = points + 2000;
		} else if (b == "tilt") {
			points = points + 3000;
		} else if (b == "turns") {
			points = points + 5000;
		} else if (b == "needle") {
			points = points + 7000;
		} else if (b == "illusion") {
			points = points + 10000;
		} else if (b == "switch leap") {
			points = points + 15000;
		} else if (b == "popping") {
			points = points + 2000;
		} else if (b == "isolations") {
			points = points + 3000;
		} else if (b == "windmill") {
			points = points + 5000;
		} else if (b == "headspring") {
			points = points + 7000;
		} else if (b == "headspin") {
			points = points + 10000;
		} else if (b == "btwist") {
			points = points + 15000;
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
			natstatus = "incomplete";
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

	@Override
	public void updatereg(String b) {
		if (b == "t") {
			regstatus = "complete";
			} else {
				regstatus = "incomplete";
			}
		
	}

	@Override
	protected void intpointalloc(String skill) {
		// TODO Auto-generated method stub
		
	}

}
