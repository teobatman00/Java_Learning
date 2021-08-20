package employee;

import java.util.Scanner;

public class Employee {

	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int id, String firstname, String lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	
	public int getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstname;
	}

	public String getLastName() {
		return this.lastname;
	}
	
	public String getName() {
		return this.firstname +" "+ this.lastname;
	}

	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	public int raiseSalary(int percentage) {
		return this.salary + this.salary * percentage/100;
	}
	
		
	@Override
	public String toString() {
		return "Employee [id= "+this.id+", name= "+this.firstname+" "+this.lastname+", salary= "+this.salary+"]";
	}


	public static void main(String[] args) {
		int id, percentage;
		String firstname, lastname;
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to employee management service, please ");
		System.out.println("Set employee id: ");
		id = sc.nextInt();
		System.out.println("Set employee firstname: ");
		firstname = sc.next();
		System.out.println("Set employee lastname");
		lastname = sc.next();
		System.out.println("Set employee salary");
		salary = sc.nextInt();
		
		Employee emp1 = new Employee(id, firstname, lastname, salary);
		System.out.println("Employee id: "+emp1.getId());
		System.out.println("Employee firstname: "+emp1.getFirstName());
		System.out.println("Employee lastname: "+emp1.getLastName());
		System.out.println("Employee name: "+emp1.getName());
		System.out.println("Employee salary: "+emp1.getSalary());
		System.out.println("Employee annual salary: "+emp1.getAnnualSalary());
		System.out.println(emp1.toString());
		
		System.out.println("Set new salary: ");
		salary = sc.nextInt();
		emp1.setSalary(salary);
		System.out.println("New employee salary after setting is: "+emp1.getSalary());
		
		System.out.println("Raise employee salary: ");
		percentage = sc.nextInt();
		System.out.println("New employee salary: "+ emp1.raiseSalary(percentage));
		System.out.println(emp1.toString());
	}

}
