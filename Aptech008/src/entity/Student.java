package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Student {
	private int id;
	private Date dob; //Java 1.7 trở về trước, giờ vẫn dùng bình thường
	private LocalDate birthday; //Java 1.8 trở về sau

	public static void main(String[] args) {
		//Java 1.8
		var scanner = new Scanner(System.in);
		
		var stu = new Student();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Please enter dob (yyyy-MM-dd): ");
		String str = scanner.nextLine();
		
		try {
			stu.dob = dateFormat.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(dateFormat.format(stu.dob));

		//1.8 cho Date
		var stu2 = new Student();
		System.out.println("Please enter dob (yyyy-MM-dd)");
		var str1 = scanner.nextLine();
		stu2.birthday = LocalDate.parse(str1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(stu2.birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		
	}

}
