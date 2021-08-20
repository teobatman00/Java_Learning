package hinhhoc;

public abstract class HinhHoc {
	private String tenHinh;
	
	public void nhapHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}
	
	public String xuatHinh() {
		return this.tenHinh;
	}
	
	public abstract int tinhChuVi();
	
	public abstract int tinhDienTich();
}
