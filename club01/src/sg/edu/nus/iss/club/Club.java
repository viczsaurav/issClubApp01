package sg.edu.nus.iss.club;

public class Club {

	private static int arraySize = 2;
	private int numMembers = 0;
	private int count = 0;
	private Member[] members = new Member[arraySize];
	
	public Member[] getMembers(){
		Member[] arr = new Member[count];
		for (int i = 0; i < arr.length; i++) {
			if(members[i] != null)
				arr[i] = members[i];
		}
		return arr;
	}
	
	public Member getMember(int idx){
		 if ((idx < 0) || (idx > numMembers))
			 return null;
		 return members[idx -1];
	}
	
	public void showMembers(){
		//System.out.println("Current Members : "+ getMembers().length);
 		for (Member member:getMembers())
 			if(member != null)
 				System.out.println("* "+member);
	}
	
	public void removeMember(int id){
		if ((id == 0 ) || (id > numMembers))
			return;
		
/*		for (Member a : members)
			if (a.getMemberNumber() == id){
				System.out.println("Removing Member "+a);
				a = null;
			}
*/
		if (members[id-1] != null)
			System.out.println("Removing Member with id "+id);
				members[id -1] = null;
		}
	
	public Member addMember(String fname, String sname, String surname){
		chkArraySize(); 					// Accommodating bigger arrays
		numMembers++;
		Member m = new Member(fname,sname,surname,numMembers);
		members[numMembers-1] = m;
		count++;
		return m;
	}
	
	public void chkArraySize(){
		if (numMembers >= members.length) {
			int newSize = numMembers + arraySize;		// ???Why now numMembers+1 or members.length+numMembers
			Member[] newArray = new Member[newSize];	
			for (int i = 0; i < numMembers; i++) {
				newArray[i] = members[i];
			}
			this.members = newArray;
		}
	}
	
	
	
}
