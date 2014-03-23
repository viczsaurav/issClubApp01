package sg.edu.nus.iss.club;

public class Member extends Person {
	
	private int memberNum;
	
	public Member(String fname, String sname, String surname, int num){
		super(fname, sname, surname);
		this.memberNum = num;
	}

	public int getMemberNumber(){
		return memberNum;
	}
	
	public String toString(){
		String details = super.toString();
		details += " - "+this.getMemberNumber();
		return details;
	}
	
	public void show(){
		System.out.println("* "+this.toString());
	}
}
