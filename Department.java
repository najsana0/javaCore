package aggregationtask;

public class Department {
	String departmentName;
	Professor professor1;
	Professor professor2;
	
	Department(String departmentName,Professor professor1,Professor professor2 ){
		this.departmentName= departmentName;
		this.professor1= professor1;
		this.professor2= professor2;
	}
	
	void display() {
		System.out.println("Department Name:" + departmentName);
		System.out.println("Professor list");
		System.out.println( professor1.professorName);
		System.out.println( professor2.professorName);
	}
	public static void main(String[] args) {
		Professor p1= new Professor("Shamim Ahmad");
		Professor p2= new Professor("Arbaj Ahmad");
		Department d= new Department("Computer Science",p1,p2);
		
		d.display();
		
	}
}
