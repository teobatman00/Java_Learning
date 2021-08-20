package hinhhoc;

public class HinhTron extends HinhHoc {

	private int r;
	
	public HinhTron(int r) {
		super.nhapHinh("HinhTron");
		this.r = r;
	}

	@Override
	public int tinhChuVi() {
		double PI = Math.PI;
		return (int) (2 * PI * this.r);
	}

	@Override
	public int tinhDienTich() {
		double PI = Math.PI;
		return (int) (PI * this.r * this.r);
	}

}
