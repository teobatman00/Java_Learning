package connguoi;

import java.util.Date;

public class GVThinhGiang extends GiangVien {
	
	private double thangCongTac;
	
	public GVThinhGiang(String maGV, String tenKhoa, int soTietDay, double moneyMoiTiet, String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String phone, double thangCongTac) {
		super(maGV, tenKhoa, soTietDay, moneyMoiTiet, hoTen, diaChi, ngaySinh, gioiTinh, email, phone);
		this.thangCongTac = thangCongTac;
	}

	@Override
	public double tinhLuong() {
		return super.soTietDay * super.moneyMoiTiet;
	}

	@Override
	public double tinhPhuCap() {
		return tinhLuong() + this.thangCongTac * 5000;
	}

	@Override
	public String toString() {
		return "GVThinhGiang [thangCongTac=" + thangCongTac + ", tinhLuong()=" + tinhLuong() + ", tinhPhuCap()="
				+ tinhPhuCap() + ", " + super.toString() + "]";
	}
	
	

}
