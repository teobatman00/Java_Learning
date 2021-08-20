package connguoi;

import java.util.Date;

public class GVChinh extends GiangVien {
	private double tienPhuCap;
	
	public GVChinh(String maGV, String tenKhoa, int soTietDay, double moneyMoiTiet, String hoTen, String diaChi, Date ngaySinh, boolean gioiTinh, String email, String phone, double tienPhuCap) {
		super(maGV, tenKhoa, soTietDay, moneyMoiTiet, hoTen, diaChi, ngaySinh, gioiTinh, email, phone);
		this.tienPhuCap = tienPhuCap;
	}

	@Override
	public double tinhLuong() {
		return super.soTietDay * super.moneyMoiTiet;
	}
	
	@Override
	public double tinhPhuCap() {
		return tinhLuong() + tienPhuCap * 0.5;
	}

	@Override
	public String toString() {
		return "GVChinh [tienPhuCap=" + tienPhuCap + ", LuongChinh=" + tinhLuong() + ", luongCoPhuCap=" + tinhPhuCap()
				+ ", " + super.toString() + "]";
	}
	
	

}
