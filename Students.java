package week3.Day1;

public class Students {
	public void getStudentsInfo(long id) {
		System.out.println("******************************************");
		System.out.println("THe Id of the student is : " + id);
		
	}
	public void getStudentsInfo(long id, String name) {
		System.out.println("******************************************");
		System.out.println("The id of the student is : " + id + "\n" + "The name of the student is : " + name);
	}
	public void getStudentsInfo(String email, long phNo) {
		System.out.println("******************************************");
		System.out.println("The email of the student is : " + email + "\n" + "The Phone number of the student is : " + phNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student = new Students();
		student.getStudentsInfo(2001051067);
		student.getStudentsInfo(2001051067, "aaa");
		student.getStudentsInfo("aaa@gmail.com", 98405126105l);
		System.out.println("******************************************");
		

	}

}
