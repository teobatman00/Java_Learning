package abstractClass;

public class Bicycle extends Anycar {

  @Override
  void numberWheelsCars() {
    System.out.println("2 wheels");
    
  }
  
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    bicycle.color = "xanh";
    bicycle.dongco = "manh me";
  }
}
