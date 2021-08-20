package testCase;

import java.util.Date;

import connguoi.GVChinh;
import connguoi.GVThinhGiang;
import hinhhoc.HinhChuNhat;

public class testCase {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat(10, 12);
		System.out.println(hcn.xuatHinh());
		System.out.println(hcn.tinhChuVi());
		System.out.println(hcn.tinhDienTich());
		System.out.println(hcn.toString());
		
		Date gvc01_dob = new Date(28/11/1997);
		GVChinh gvc = new GVChinh("gv01", "toan", 10, 1000, "minh", "HaNoi", gvc01_dob ,true, "minhduong@gmail.com", "0916310208", 200.3);
		System.out.println(gvc.tinhLuong());
		System.out.println(gvc.tinhPhuCap());
		System.out.println(gvc.toString());
		
		Date gvtg01_dob = new Date(12/11/1965);
		GVThinhGiang gvtg  = new GVThinhGiang("gv11", "anhvan", 1, 2000, "NgocMinh", "HCM", gvtg01_dob, false, "ngocminh@gmail.com", "0916310206", 2);
		System.out.println(gvtg.tinhLuong());
		System.out.println(gvtg.tinhPhuCap());
		System.out.println(gvtg.toString());
	}

}
