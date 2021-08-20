package connguoi;

import java.util.Date;

public abstract class GiangVien extends ConNguoi {

	private String maGV;
	private String tenKhoa;
	protected int soTietDay;
	protected double moneyMoiTiet;
	
	public GiangVien(String maGV, String tenKhoa, int soTietDay, double moneyMoiTiet, String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String phone) {
		super(hoTen, diaChi, ngaySinh, gioiTinh, email, phone);
		this.maGV = maGV;
		this.tenKhoa = tenKhoa;
		this.soTietDay = soTietDay;
		this.moneyMoiTiet = moneyMoiTiet;		
	}
	
	public abstract double tinhLuong();
	
	public abstract double tinhPhuCap();

	@Override
	public String toString() {
		return "GiangVien [maGV=" + maGV + ", tenKhoa=" + tenKhoa + ", soTietDay=" + soTietDay + ", moneyMoiTiet="
				+ moneyMoiTiet + ", "+ super.toString() + "]";
	}

}
