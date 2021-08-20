package association.onetomany;

class Teacher {
    private String nameTeacher;

    public Teacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}

class Student {
    private String nameStudent;

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
}

public class DemoTeacherStudent {

    //ví dụ khác employee - account
    public static void main(String[] args) {
        Teacher teacher = new Teacher("nguyen");
        Student stu1 = new Student("phat");

        Student stu2 = new Student("yan");
        System.out.println(teacher.getNameTeacher() + " is teacher of "+stu1.getNameStudent());
        System.out.println(teacher.getNameTeacher() + " is teacher of "+stu2.getNameStudent());
    }
}
