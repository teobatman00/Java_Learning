package abstractClass;

/**
 * Class {@code Oto}
 * con kế thừa cha, mà cha là trừu tượng (abstract) thì con
 * <p> 1/ Viết lại những phương thức mà cha chưa viết được
 * <p> 2/ Con cũng abstract luôn
 */
public class Oto extends Car {

  /**
   * Ghi đè, viết lại phương thức của cha (class cha là Car)
   */
  @Override
  void numberWheelsCars() {
    System.out.println("Car: 4 wheels");
  }

  public static void main(String[] args){
    Oto oto1 = new Oto();
    oto1.information();
    oto1.numberWheelsCars();

    oto1.color = "red";
    oto1.information();
  }
  
}
