package sg.edu.nus.iss.club;

public class Facility {

	private String facility;
	private String fDesc;
	
	public Facility (String facility, String fDesc){
		this.facility = facility;
		this.fDesc = fDesc;
	}
	
	public String getFacility() {
		if(facility.length() == 0) this.facility = null;
		return facility;
	}

	public String getfDesc() {
		if(fDesc.length() == 0) this.fDesc = null;
		return fDesc;
	}

	public void show(){
		System.out.print("* "+toString()+"\n");
	}
	
	public String toString(){
		String fullname = this.getFacility();
		if (getfDesc()!= null)   fullname += " (" + this.getfDesc() + ")";
		return fullname;
	}
}
