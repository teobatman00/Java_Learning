package dao;

import common.database.DBConnection;
import entity.Student;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class DaoStudent {
    public List<Student> getAllListStudent() {
        List<Student> listStu = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                CallableStatement cs = connection.prepareCall("{call selectAll}");
                ResultSet resultSet = cs.executeQuery();
        ) {
            while (resultSet.next()) {
                Student student = new Student();
                student.setStuID(resultSet.getInt("id"));
                student.setStuName(resultSet.getString("fullname"));
                student.setStuGender(resultSet.getBoolean("gender"));
                student.setStuBirthday(LocalDate.parse(resultSet.getString("birthday")));
                student.setStuPhone(resultSet.getString("phone"));
                listStu.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listStu;
    }

    public List<Student> getStudentByGender(boolean gender) {
        List<Student> listStu = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = createPSGender(connection, "SELECT * FROM student where gender = ?", gender);
                ResultSet resultSet = ps.executeQuery();
        ) {
            while (resultSet.next()) {
                Student student = new Student();
                student.setStuID(resultSet.getInt("id"));
                student.setStuName(resultSet.getString("fullname"));
                student.setStuGender(resultSet.getBoolean("gender"));
                student.setStuBirthday(LocalDate.parse(resultSet.getString("birthay")));
                student.setStuPhone(resultSet.getString("phone"));
                listStu.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listStu;
    }

    public Student getStudentById(int id) {
        Student student = new Student();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = createPSId(connection, "SELECT * FROM student WHERE id = ?", id);
                ResultSet resultSet = ps.executeQuery();
        ) {
            while (resultSet.next()) {
                student.setStuID(resultSet.getInt("id"));
                student.setStuName(resultSet.getString("fullname"));
                student.setStuGender(resultSet.getBoolean("gender"));
                student.setStuBirthday(resultSet.getDate("birthday").toLocalDate());
                student.setStuPhone(resultSet.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public boolean updateStudent(int id, String fullname, boolean gender, LocalDate birthday, String phone) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = updatePSById(connection, id, fullname, gender, birthday, phone);
        ) {
            if (ps.executeUpdate() > 0) return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public static void deleteAll() {
        var stu = new Student();
        System.out.println(stu.hasDeleteAll() ? "Xoa toan bo danh sach sinh vien thanh cong" : "Khong the xoa toan bo danh sach sinh vien");
    }

    public boolean deleteStudentById(int id) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = createPSId(connection, "DELETE FROM student WHERE id = ?", id);
        ) {
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    private PreparedStatement updatePSById(Connection connection, int id, String fullname, boolean gender,
                                           LocalDate birthday, String phone) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE student SET fullname = ?, gender = ?, birthday = " +
                "?, phone = ? WHERE id = ?");
        ps.setString(1, fullname);
        ps.setBoolean(2, gender);
        ps.setDate(3, Date.valueOf(birthday));
        ps.setString(4, phone);
        ps.setInt(4, id);
        return ps;
    }

    private PreparedStatement createPSId(Connection connection, String sql, int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private PreparedStatement createPSGender(Connection connection, String sql, boolean gender) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setBoolean(1, gender);
        return ps;
    }

}
