package sg.edu.nus.iss.club;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class ClubApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		
		Person p1, p2, p3; 
		Facility f1, f2;
		Member m1, m2, m3;
		Club c1 = new Club();
		int idx = 2;
	/*	String s1, s2,s3;
		String f1,f2;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// Adding Persons
		System.out.print("Enter first Name: ");		s1 = in.readLine();
		System.out.print("Enter second Name: ");	s2 = in.readLine();
		System.out.print("Enter surame: ");			s3 = in.readLine();
		p = new Person(s1,s2,s3); 
		
		//Adding Facilities
		System.out.print("Enter Facility: ");		f1 = in.readLine();
		System.out.print("Enter Description: ");	f2 = in.readLine();
		f = new Facility(f1,f2);
		
		//Adding Members
		m = new Member(s1,s2,s3);
	*/
		p1 = new Person("Bill","Thomas","Gates");
		p2 = new Person("Steve",null,"Jobs");
		p3 = new Person("Mark","Zuckerberg",null);
		System.out.println("Full Name of Members: ");
		p1.show();
																																																									p2.show();
																																																									p3.show();
		
		f1 = new Facility("Conference Hall","Your can conduct meetings here");
		f2 = new Facility("Swimming Pool","");
		System.out.println("Facilities :");
		f1.show();
		f2.show();
		
		//m1 = new Member("Bill","Thomas","Gates",0);	m1.show();
		//m2 = new Member("Steve","","Jobs",0);		m2.show();
		//m3 = new Member("Mark","Zuckerberg","",0);	m3.show();
		
		m1 = c1.addMember("Bill", "Thomas", "Gates");
		m2 = c1.addMember("Steve",null,"Jobs");	
		m3 = c1.addMember("Mark","Zuckerberg",null);
		
		m1.show();
		m2.show();
		m3.show();
		
		Member[] members = new Member[c1.getMembers().length];
		members = c1.getMembers();
		for(Member m : members){
			System.out.println("* "+m);
		}
		System.out.println("Current Members :");
		c1.showMembers();
		System.out.println("Member at position "+idx+" is "+c1.getMember(idx));
		c1.removeMember(2);
		c1.showMembers();
	}

}
