package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
	private int id;
	private LocalDate dob;
	private boolean gender;
	
	public Person() {}
	
	public Person(int id, LocalDate dob, boolean gender) {
		super();
		this.id = id;
		this.dob = dob;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", dob=" + dob.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")) + ", gender=" + gender + "]";
	}
	
	//Không có bất kỳ phương thức nào xử lý class này => package =>entity
	
	//Không gọi thằng này nằm trong package entity => package tên là model
	
	/* Model view
	 * bên dưới database có cột address
	 * tách thành 2 cột trong class stress, district
	 * đôi khi có thêm một cột khác mà trong database không có
	 */
	
	public void inputPerson(Scanner sc) {
		System.out.println("Please enter id: ");
		while (!sc.hasNextInt()) {
			System.out.println("Please enter again");
			sc.nextLine();
		}
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter dob (dd/MM/yyyy)");
		//String birthday = sc.nextLine();
		dob = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println("Please enter gender (y-male, n-female)");
		
		String sex = sc.nextLine();
		
		gender = sex.toLowerCase().equals("y")? true: false;
		gender = sex.compareToIgnoreCase("y")==0? true:false;
	}
	
	
}
