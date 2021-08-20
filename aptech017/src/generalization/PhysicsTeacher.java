package generalization;

class Teacher {
    String fullname = "Teacher";

    public void showName(){
        System.out.println(fullname);
    }
}

public class PhysicsTeacher extends Teacher {
    String job = "Physic";

    public static void main(String[] args) {
        var phyTea = new PhysicsTeacher();
        System.out.println(phyTea.fullname);
        System.out.println(phyTea.job);
    }
}
