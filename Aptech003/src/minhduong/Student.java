package minhduong;

public class Student {
  int id;
  String fullName;
  public boolean gender;

  void hello() {
    System.out.println("ahihihi");
  }
  public static void main(String[] args) throws Exception {
    Student stu1 = new Student();
    stu1.id = 10;
    stu1.fullName = "Nguyen";
    System.out.println(stu1.id + "==" + stu1.fullName);

    Student stu2 = new Student();
    stu2.id = 10;
    stu2.fullName = "Nguyen";
    System.out.println(stu2.id + "==" + stu2.fullName);
  }
}

/**
 * Class là gì? Class là một nhóm đối tượng có thuộc tính chung
 * => Vậy thì ngôn ngữ Java theo trường phái OOP = object oriented programming
 * 
 * Vậy thì trường phái OOP có 4 tính chất:
 * Abstraction (trừu tượng)
 * Inheritance (kế thừa)
 * Encapsulation (bao đóng, che dấu)
 * Polymorphism (đa hình)
 * 
 * 100 chức năng, 50 chức năng finished, 50 chức năng failed
 * trong class có constructor => tên trùng với tên class và có dấu () 
 * constructor sẽ dựng sẵn giá trị cho các field chưa gán giá trị
 * 
 * kiểu số = 0 
 * kiểu chuỗi = null (phía console null => " ")
 * kiểu luận lý boolean => false
 * kiểu date => null
 * 
 * Một phương thức (method) mà có thân (body) => {} => phương thức này đã hoàn tất 
 * Một phương thức (method) mà không có thân (body) (không có dấu {}) thì phương thức đó phải là abstract tại
 * vì phương thức đó, không viết được, chưa hoàn tất
 * 
 * Một phương thức là abstract thì kéo theo class phải là abstract
 * 
 * Một class là Abstract thì không được phép tạo đối tượng để sử dụng
 */