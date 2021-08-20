package app;

import java.util.Scanner;

import model.Person;

public class Program {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var per = new Person();
		per.inputPerson(sc);
		System.out.println(per);
		sc.close();
	}

}
