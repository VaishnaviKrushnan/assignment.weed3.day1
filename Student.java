package week3.Day1;

public class Student extends Department {
	public void studentName( ) {
		System.out.println("Student name is Super Mario");
	}
	public void studentDept( ) {
		System.out.println("Student Dept is EEE");
	}
	public void studentId( ) {
		System.out.println("Student Id is 200105206");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	}

}
