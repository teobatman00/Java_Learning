package bal;

import dao.DaoStudent;
import entity.Student;

import java.util.List;

public class BalStudent {

    public List<Student> getStu(){
        DaoStudent dao = new DaoStudent();
        return dao.getListStudent();
    }

}
