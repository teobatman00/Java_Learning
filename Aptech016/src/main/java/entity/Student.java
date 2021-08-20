package entity;

public class Student {
    private int id;
    private String fullname;

    public Student(){}

    public Student(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + fullname + '\'' +
                '}';
    }
}
