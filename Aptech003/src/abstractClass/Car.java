package abstractClass;
/**
 * Không được phép khởi tạo đối tượng abstract
 */
public abstract class Car {
  int wheels = 0;
  String color = "no color";

  void information(){
    System.out.println(color);
  }

  abstract void numberWheelsCars();

  // public static void main(String[] args) {
  //   Car xe1 = new Car(); => không được phép khởi tạo đối tượng
  // }
}
