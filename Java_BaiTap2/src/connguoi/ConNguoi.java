package connguoi;

import java.util.Date;

public class ConNguoi {

	private String hoTen, diaChi;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String email, phone;
	
	public ConNguoi() {}
	
	public ConNguoi(String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String phone) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.phone = phone;
	}

	public void Nhap(String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String phone) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ConNguoi [hoTen=" + hoTen + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
