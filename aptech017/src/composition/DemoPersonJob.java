package composition;

class Job {
    private String nameJob;

    public Job(){}

    public Job(String nameJob) {
        this.nameJob = nameJob;
    }

    public String getNameJob() {
        return nameJob;
    }

    public void setNameJob(String nameJob) {
        this.nameJob = nameJob;
    }
}

class Person {
    private Job job; //composition

    public Person() {
        this.job = new Job(); //ép buộc phải tạo Job
    }
}

public class DemoPersonJob {
    public static void main(String[] args) {

    }
}
