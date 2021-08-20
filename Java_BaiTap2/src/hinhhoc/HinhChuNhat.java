package hinhhoc;

public class HinhChuNhat extends HinhHoc {

	private int a;
	private int b;
	
	public HinhChuNhat(int a, int b) {
		super.nhapHinh("HinhChuNhat");;
		this.a = a;
		this.b = b;
	}

	@Override
	public int tinhChuVi() {
		return (this.a + this.b)*2;
	}

	@Override
	public int tinhDienTich() {
		return this.a * this.b;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [a=" + a + ", b=" + b + ", ChuVi=" + tinhChuVi() + ", DienTich= "+ tinhDienTich() + "]";
	}
	
	
}
