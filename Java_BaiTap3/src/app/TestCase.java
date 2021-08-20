package app;

import java.util.Scanner;

import employee.Employee;

public class TestCase {

	public static void main(String[] args) {
		var employee = new Employee();
		var sc  = new Scanner(System.in);
		employee.inputEmployee(sc);
		System.out.println(employee);
		sc.close();
		
	}

}
