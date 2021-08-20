package entity;

import common.database.DBConnection;
import common.rules.Regex;
import common.rules.Validator;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int stuID;
    private String stuName;
    private boolean stuGender;
    private LocalDate stuBirthday;
    private String stuPhone;
    private String table = "student";
    private String sql;

    public Student() {
    }

    public Student(int stuID, String stuName, boolean stuGender, LocalDate stuBirthday, String stuPhone) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuBirthday = stuBirthday;
        this.stuPhone = stuPhone;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public boolean isStuGender() {
        return stuGender;
    }

    public void setStuGender(boolean stuGender) {
        this.stuGender = stuGender;
    }

    public LocalDate getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(LocalDate stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", stuGender=" + stuGender +
                ", stuBirthday=" + stuBirthday +
                ", stuPhone='" + stuPhone + '\'' +
                '}';
    }

    public void insertStudent(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Nhap id sinh vien (kieu so nguyen lon hon 0): ");
                stuID = scanner.nextInt();
                while (stuID < 1) {
                    System.out.println("id sinh vien phai la so nguyen lon hon 0, moi nhap lai");
                    stuID = scanner.nextInt();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Id sinh vien phai la kieu so nguyen lon hon 0");
                scanner.nextLine();
            }
        }

        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Nhap ten sinh vien");
                stuName = scanner.nextLine();
                while (!Validator.checkCapitalEachWord(stuName) || Validator.checkContainNumber(stuName)) {
                    System.out.println("Ten sinh vien phai viet hoa moi chu cai dau tien va khong co so, moi nhap lai");
                    stuName = scanner.nextLine();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ten sinh vien phai la kieu chuoi");
            }
        }
        System.out.println("Nhap gioi tinh sinh vien (y-male, n-female): ");
        String genderTemp = scanner.next();
        while (!Validator.checkRegex(genderTemp, Regex.GENDER)) {
            System.out.println("Gioi tinh chi lua chon y (yes - male) hoac n (no - female), moi nhap lai");
            genderTemp = scanner.next();
        }
        stuGender = genderTemp.toLowerCase().compareToIgnoreCase("y") == 0;
        scanner.nextLine();
        System.out.println("Nhap ngay thang nam sinh (yyyy-MM-dd)");
        while (true) {
            try {
                stuBirthday = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Ngay thang nam sinh phai dung dinh dang yyyy-MM-dd, moi nhap lai");
            }
        }
        System.out.println("Nhap so dien thoai (toi da 10 chu so, bat dau la 0): ");
        stuPhone = scanner.next();
        while (!Validator.checkRegex(stuPhone, Regex.PHONE)) {
            System.out.println("So dien thoai phai day du 10 chu so, bat dau la 0, moi nhap lai");
            stuPhone = scanner.next();
        }
        if (hasInsertStudent()) System.out.println("Ket qua Student da nhap: \n" + toString());
        else System.out.println("Khong the them Student");
    }

    private boolean hasInsertStudent() {
        this.sql = "INSERT INTO " + table + "(id, fullname, gender, birthday, phone) values(?,?,?,?,?)";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = createPreparedStatement(connection, sql, stuID, stuName, stuGender, stuBirthday,
                        stuPhone);
        ) {
            if (ps.executeUpdate() > 0) return true;
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    private PreparedStatement createPreparedStatement(Connection connection, String sql, int stuID, String stuName,
                                                      boolean stuGender, LocalDate stuBirthday, String stuPhone) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, stuID);
        ps.setString(2, stuName);
        ps.setBoolean(3, stuGender);
        ps.setDate(4, Date.valueOf(stuBirthday));
        ps.setString(5, stuPhone);
        return ps;
    }

    public boolean hasDeleteAll() {
        this.sql = "DELETE * FROM " + table;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            return ps.execute();
        } catch (SQLException e) {
            return false;
        }
    }

}
