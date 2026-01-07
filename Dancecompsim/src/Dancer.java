import java.util.ArrayList;
/**
 * 
 * @author Dancer base class
 * Intermediate, Advanced and Beginner class inherit from this
 *
 */

public abstract class Dancer {
	
	private String name;
	private Integer age;
	private String specialty;
	protected Integer points = 0;;
	private ArrayList<String> acroskills = new ArrayList<String>();
	private ArrayList<String> contskills = new ArrayList<String>() ;
	private ArrayList<String> hopskills = new ArrayList<String>();
	
	/**
	 * Dancer default class
	 */
	
	public Dancer() {
		name = "Teeny tot";
		age = 1;
		specialty= "none";
	}
	/**
	 * 
	 * @param _name sets dancer name
	 * @param _age sets dancer age
	 * @param _specialty sets dancer specialty
	 */
	
	public Dancer(String _name, Integer  _age, String _specialty) {
		name = _name;
		age = _age;
		specialty = _specialty;
		
		
	}
	//returns dancer name
	public String getname() {
		return name;
	}
	//returns dancer age
	
	public Integer getage() {
		return age;
	}
	
	//returns specialty
	public String getspeciality() {
	
		return specialty;
	}
	
	// returns dancer points
	public Integer getpoints() {
		return points;
	}
	
	//returns dancer info
	public String tostring() {
		return String.format("Name: %s, Age: %d, Specialty: %s", name, age, specialty);
	}
	
	/**
	 * loads skills into their respective containers
	 */
	public void loadskills() {
		
		acroskills.add("handstand");
		acroskills.add("cartwheel");
		acroskills.add("walkover");
		acroskills.add("aerial");
		acroskills.add("handspring");
		acroskills.add("flip");
		contskills.add("tilt");
		contskills.add("kicks");
		contskills.add("illusion");
		contskills.add("switch leap");
		contskills.add("turns");
		contskills.add("needle");
		hopskills.add("isolation");
		hopskills.add("popping");
		hopskills.add("flare");
		hopskills.add("headspin");
		hopskills.add("windmill");
		hopskills.add("headspring");
		
		
	}
	/**
	 * 
	 * @returns arraylist contain skills for a particular specialty
	 */
	public ArrayList<String> getskill(){
		loadskills();
		ArrayList<String> holder = new ArrayList<String>();
		
		if( specialty == "acro") {
			holder = acroskills;
		} else if (specialty =="contemporary") {
			holder = contskills;
		} else if (specialty == "hip hop") {
			holder = hopskills;
		}
		return holder;
	}
	
	public void nullpoints() {
		points = 0;
	}
	
	//abstract classes to override
	
	public abstract String getnat();
	
	public abstract void updatenat(String b);
	
	public abstract String getintl();
	
	public abstract void updateintl(String b);
	
	public abstract String getreg();
	
	public abstract void updatereg(String b);

	protected abstract void intpointalloc(String skill);

	
	
}
