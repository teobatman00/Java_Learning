package polymorphism;

class ParentChangeDollar {
	public void ChangeDollar(int dollar) {
		System.out.println(dollar * 10000);
	}
	
	public void report() {
		System.out.println("report");
	}
}

public class DemoOverriding extends ParentChangeDollar {

	//Ghi đè (Overriding) cho phép các lớp con khi kế thừa lớp cha, có quyền hạn
	//được phép định nghĩa lại hay sửa chữa các phương thức của cha theo ý nó.
	@Override
	public void ChangeDollar(int dollar) {
		System.out.println("in campodia");
		super.ChangeDollar(dollar);
		System.out.println("in vietnam");
		System.out.println(dollar * 25000);
	}
	
	public static void main(String[] args) {
		DemoOverriding overriding = new DemoOverriding();
		overriding.ChangeDollar(2);
		overriding.ChangeDollar(3);
	}

}
