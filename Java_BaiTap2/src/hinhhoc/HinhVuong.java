package hinhhoc;

public class HinhVuong extends HinhHoc {

	private int a;
		
	public HinhVuong(int a) {
		super.nhapHinh("HinhVuong");
		this.a = a;
	}
	
	@Override
	public int tinhChuVi() {
		return this.a *4;
	}

	@Override
	public int tinhDienTich() {
		return this.a * this.a;
	}
		
}
