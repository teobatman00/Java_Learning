package app;

import helper.RegexConst;
import helper.Validation;

public class Test {

	public static void main(String[] args) {
		String chuoi = Validation.CheckRegex(RegexConst.NUM,"Vui long nhập số nguyên: ");
		int number = Integer.parseInt(chuoi);
		System.out.println(number);
		chuoi = Validation.CheckRegex(RegexConst.STATUS, "Vui long nhap trang thai 0 hay 1");
		boolean check = chuoi.equals("1")?true:false;
		System.out.println(check);
	}

}
