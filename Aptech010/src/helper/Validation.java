package helper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	public static String CheckRegex(String regex ,String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(true) {
			String str = sc.nextLine();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()) {
				return str;
			} else {
				System.out.println("error, data invalid");
			}
			
			if(Pattern.compile(regex).matcher(str).matches()) {
				
			}
		}
		
	}
	
}
