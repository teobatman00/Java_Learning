package dao;

import common.DBConnection;
import entity.Student;

import java.util.*;

public class DaoStudent {
    public List<Student> getListStudent(){
        List<Student> list = new ArrayList<>();

        try (
            var connection = DBConnection.getConnection();
            var  cs = connection.prepareCall("{call selAllStu}");
            var resultSet = cs.executeQuery();
        ) {
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFullname(resultSet.getString("fullname"));
                list.add(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
