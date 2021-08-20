package employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
	private String id;
	private String fullname;
	private int age;
	private LocalDate dob;
	private String phone;
	private boolean gender;
	
	public Employee() {}

	public Employee(String id, String fullname, int age, LocalDate dob, String phone, boolean gender) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", age=" + age + ", dob=" + dob.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")) + ", phone=" + phone
				+ ", gender=" + gender + "]";
	}

	public void inputEmployee(Scanner sc) {
		System.out.println("Please enter employee id (String type): ");
		while (!sc.hasNext("^[A-Za-z](.*)|(.*)[A-Za-z]$")) {
			System.out.println("Please enter again");
			sc.nextLine();
		}
		id = sc.nextLine();
		System.out.println("Please enter employee fullname (String type):");
		while (!sc.hasNext("[A-Za-z|\s]*")) {
			System.out.println("Please enter again");
			sc.nextLine();
		}
		fullname = sc.nextLine();
		System.out.println("Please enter employee age (int type):");
		while (!sc.hasNextInt()) {
			System.out.println("Please enter again");
			sc.nextLine();
		}
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter employee date of birth (yyyy-MM-dd): ");
		boolean done = false;
		while(!done) {
			try {
				dob = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				done = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Please enter phone number (max 10, include first 0):");
		while(!sc.hasNext("[0-9]{10}")) {
			System.out.println("Please enter again");
			sc.nextLine();
		}
		phone = sc.next();
		System.out.println("Please enter employee gender (y-male, n-female)");
		while(!sc.hasNext("[y|n]{1}")) {
			System.out.println("Please enter again");
			sc.next();
		}
		String sex = sc.next();
		
		gender = sex.compareToIgnoreCase("y")==0? true: false;
		
	}

	
	
	

}
