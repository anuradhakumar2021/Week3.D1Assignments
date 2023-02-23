package Week3.d1assignment;

public class Students {
	public void getStudentsInfo(int id) {
		System.out.println("Student id : " + id);
		System.out.println();
	}
	public void getStudentsInfo(int id,String name) {
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);

		System.out.println();
	}
	public void getStudentsInfo(String email,long phone) {
		System.out.println("Student email : " + email);
		System.out.println("Student phone number: " + phone);

		System.out.println();
	}
	public static void main(String[] args) {
 Students objstdnt =new Students();
 objstdnt.getStudentsInfo(21);
 objstdnt.getStudentsInfo(21, "Jaya");
 objstdnt.getStudentsInfo("jaya.kumar@gmail.com",8143621);
	}

}
