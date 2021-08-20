package Aptech002.src.minhduong;

//Hiện tại tất cả các code đều phải viết trong App
public class App {
    
    // member của class => field là number 3, phương thức là main(), hi(), hello()

    static int number3 = 100; //global variable <=> field =>number3
    public static void main(String[] args) throws Exception {
        int number1 = 10;
        double number2 = 15.5;
        boolean check = false;
        String str = "khacnguyen";

        System.out.println("Hi C2007L");
        System.out.println(str);
        System.out.println("Xin Chao: " + str);
        System.out.println("So thu 1 la: " + number1);
        
        hello();

    /* 
     * 1 phương thức là static chúng ta có 2 cách để đem 1 cái gì đó vào bên trong nó 
     * ----------------------------------------------------------------
     * c1 - những cái bên ngoài mà đem vào phương thức static thì phải gọi là static
     * c2 - chuyển hướng đối tượng khai báo đối tượng của cái class này ra sử dụng
    */

        App object = new App();
        number3 = 40;
        // App obj = new App();
        System.out.println(object.hi());
    }

    public static void hello(){
        App object = new App();
        System.out.println(object.number3);
    }

    public String hi(){
        return "ahihi";
    }
}
