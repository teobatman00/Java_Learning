package aggregation;

class Calculation {
    public int callArea(int width, int height){
        return width * height;
    }

    public void showInfo(){
        System.out.println("calc");
    }
}

class Rectangle {

    Calculation cal; // sử dụng aggregation, khai báo thành field
    public int area(int width, int height){
        cal = new Calculation();
        return cal.callArea(width, height);
    }

    public void showInfo(){
        System.out.println("rectangle");
    }
}

public class DemoCalculationRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int result = rectangle.area(10, 20);
        System.out.println(result);

        Calculation calculation = new Calculation();
        System.out.println(calculation.callArea(10, 20));
    }
}
