package aggregationtask;

public class Student {
	String studentName;
	int studentId;
	Course course1;
	Course course2;
	Course course3;
	
	Student(String studentName,int studentId,Course course1,Course course2,Course course3 ){
		this.studentName = studentName;
		this.studentId = studentId;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		
	}
	
	void display() {
		System.out.println("Student Name:" + studentName);
		System.out.println("Student Id:" + studentId);
		System.out.println("Enrolled by Student");
		System.out.println(course1.courseName);
		System.out.println(course2.courseName);
		System.out.println(course3.courseName);
	}
	public static void main(String[] args) {
		Course c1= new Course("B.Tech(Computer Science)");
		Course c2= new Course("B.SC");
		Course c3= new Course("B.COM");
		Student s= new Student("Sana Naj", 101, c1,c2,c3);
		s.display();
	}

}
