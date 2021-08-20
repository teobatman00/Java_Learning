package composition;

class Calculation {
    public int callArea(int width, int height){
        return width * height;
    }

    public void showInfo(){
        System.out.println("calc");
    }
}

class Rectangle {

    Calculation cal = new Calculation(); //composition vì cưỡng ép tạo ra là có luôn đối tượng cal
    public int area(int width, int height){
//        cal = new Calculation();
        return cal.callArea(width, height);
    }

    public void showInfo(){
        System.out.println("rectangle");
    }
}

public class DemoCalculationRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
    }
}
