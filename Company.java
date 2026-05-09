package aggregationtask;

public class Company {
	String companyName;
	String companyAddress;
	Employee1 employee1;
	Employee1 employee2;
	
	Company(String companyName,String companyAddress,Employee1 employee1 ,Employee1 employee2){
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.employee1 = employee1;
		this.employee2 = employee2;
	}
	void display() {
		System.out.println("Company name:" + companyName);
		System.out.println("Company address:" + companyAddress);
		System.out.println("Employee Name:");
		System.out.println( employee1.employeeName);
		System.out.println( employee2.employeeName);
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Sameer Ahmad");
		Employee1 e2 = new Employee1("Aebaj Ahmad");
		Company c= new Company("TCS","Mumbai", e1, e2);
		c.display();
	}

}
