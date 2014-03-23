package sg.edu.nus.iss.club;

public class Person {
	
	private String fname;
	private String sname;
	private String surname;

	public Person(String fname, String sname, String surname){
	
		this.fname = fname;
		this.sname = sname;
		this.surname = surname;
	}

	public String getFname() {
		return fname;
	}

	public String getSname() {
		return sname;
	}

	public String getSurname() {
		return surname;
	}
	
	public void show() {
		System.out.println("* "+toString());
		
	}
	
	public String toString(){
		String fullname = this.getFname();
		if (getSname()!= null)   fullname += " " + this.getSname();
		if (getSurname()!= null) fullname += " " + this.getSurname(); 
		return fullname;
	}

}
