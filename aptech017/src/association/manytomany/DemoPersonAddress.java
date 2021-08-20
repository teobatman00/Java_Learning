package association.manytomany;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

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

public class DemoPersonAddress {
    public static void main(String[] args) {
        Person per1 = new Person("nguyen");
        Person per2 = new Person("tan");

        Address add1 = new Address("HCM");
        Address add2 = new Address("HN");

        System.out.println(per1.getName()+" lives in address "+add1.getCity()+" and "+add2.getCity());
        System.out.println(per2.getName()+" lives in address "+add1.getCity()+" and "+add2.getCity());
    }
}
