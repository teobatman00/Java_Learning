package polymorphism;

public class DemoOverloading {
	
	/*
	 * xét overloading
	 * cho phép trùng tên giữa các phương thức hay constructor
	 * chỉ khác tham số hay kiểu tham số truyền vào
	 * có tên trùng với tên class
	 * không phải là method vì nó không hiểu (không có void, string, method)
	 */
	public DemoOverloading() {
		System.out.println("Chao mung duoc sinh ra");
	}
	
	public DemoOverloading(String str) {
		System.out.println("Chao mung " + str + " duoc sinh ra");
	}
	
	//=================================================================
	// Overloading method
	
	public void hi() {
		System.out.println("hi");
	}
	
	public void hi(String name) {
		System.out.println("hi, " + name);
	}
	
	
	/*
	 * không được gọi là overloading 
	 * vì kiểu trả về của phương thức không được gọi là overloading
	 */
	
//	public String hi(String name) {
//		return name;
//	}
	
	public static void main(String[] args) {
		DemoOverloading overloading = new DemoOverloading();
		System.out.println(overloading);
		
		DemoOverloading overloading2 = new DemoOverloading("Minh");
		System.out.println(overloading2);

	}

}
