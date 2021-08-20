package aggregation;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Person {
    private String name;


}

public class DemoPersonAddress {

    public static void main(String[] args) {

        Address add1 = new Address("HCM");
        Address add2 = new Address("HN");

    }


}
