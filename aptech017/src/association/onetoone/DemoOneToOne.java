package association.onetoone;

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

class Passport {
    private int passportNo;

    public Passport(int passportNo) {
        this.passportNo = passportNo;
    }

    public int getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(int passportNo) {
        this.passportNo = passportNo;
    }
}

public class DemoOneToOne {
    public static void main(String[] args) {
        Person per1 = new Person("nguyen");
        Person per2 = new Person("tan");

        Passport passNo1 = new Passport(1111);
        Passport passNo2 = new Passport(2222);

        //moi quan he one to one
        System.out.println(per1.getName() + " has passport no: "+passNo1);
        System.out.println(per2.getName() + " has passport no: "+passNo2);

        //sai nguyen tac
        System.out.println(per1.getName() + " has passport no: "+passNo2);


    }
}
