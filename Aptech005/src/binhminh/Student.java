package binhminh;

/**
 * Student class
 * 
 * Trong class => field, method, getter, setter
 */
public class Student {
	private int idStu; //1 field bao gom ca set va get
	private String fullname;
	private boolean gender;

	/**
	 * ===================================
	 * Properties
	 */
	
	public int getIdStu() {
		return idStu;
	}
	
	public void setIdStu(int idStu) {
		this.idStu = idStu;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student();
		stu.idStu = 1; //Set value for idStu
		stu.fullname = "Binh Minh";
		stu.gender = true;
		System.out.println(stu.idStu);

	}

}
