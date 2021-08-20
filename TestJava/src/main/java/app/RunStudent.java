package app;

import common.rules.Regex;
import common.rules.Validator;
import dao.DaoStudent;
import entity.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RunStudent {
    public static void main(String[] args) {
        int id;
        int selectNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chao mung ban da den voi phan mem quan ly sinh vien, moi lua chon muc ben duoi: ");
        System.out.println("1. Them sinh vien moi");
        System.out.println("2. Cap nhat thong tin sinh vien");
        System.out.println("3. Xoa sinh vien");
        System.out.println("4. Xuat toan bo danh sach sinh vien");
        System.out.println("5. Xuat danh sach sinh vien nam (male)");
        System.out.println("6. Xuat danh sach sinh vien nu (female)");
        System.out.println("7. Xoa toan bo danh sach sinh vien");
        System.out.println("8. Thoat chuong trinh");
        while (true) {
            try {
                selectNumber = scanner.nextInt();
                while (!Validator.checkNumberInRange(selectNumber, 1, 8)) {
                    System.out.println("Lua chon phai nam trong khoang tu 1 - 8, moi nhap lai");
                    selectNumber = scanner.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Gia nhap vao phai la so, moi nhap lai");
                scanner.nextLine();
            }
            switch (selectNumber) {
                case 1 -> {
                    var stu = new Student();
                    stu.insertStudent(scanner);
                    scanner.close();
                    return;
                }
                case 2 -> {
                    var stuList = new DaoStudent();
                    System.out.println("Danh sach sinh vien: ");
                    stuList.getAllListStudent().forEach(System.out::println);
                    System.out.println("Moi lua chon id sinh vien de cap nhat (kieu int): ");
                    while (true) {
                        try {
                            id = scanner.nextInt();
                            if (id > 0) break;
                            else {
                                System.out.println("id phai la kieu so va lon hon 0");
                                scanner.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("id phai la kieu int, moi nhap lai");
                            scanner.nextLine();
                        }
                    }
                    Student student = stuList.getStudentById(id);
                    String fullname = "", phone = "";
                    boolean gender;
                    LocalDate birthday;
                    while (true) {
                        try {
                            System.out.println("Nhap ten sinh vien (bam Enter de bo qua): ");
                            fullname = scanner.nextLine();
                            if (fullname.isEmpty()) fullname = student.getStuName();
                            else {
                                while (!Validator.checkCapitalEachWord(fullname) || Validator.checkContainNumber(fullname)) {
                                    System.out.println("Ten sinh vien phai viet hoa moi chu cai dau tien va khong co so, moi nhap lai");
                                    fullname = scanner.nextLine();
                                }
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Ten sinh vien phai la kieu chuoi");
                            scanner.nextLine();
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Nhap so dien thoai sinh vien (bam Enter de bo qua): ");
                            phone = scanner.next();
                            if (phone.isEmpty()) phone = student.getStuPhone();
                            else {
                                while (!Validator.checkRegex(phone, Regex.PHONE)) {
                                    System.out.println("So dien thoai phai day du 10 chu so, bat dau la 0, moi nhap lai");
                                    phone = scanner.next();
                                }
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("So dien thoai phai la kieu chuoi bat dau tu so 0");
                            scanner.nextLine();
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Nhap gioi tinh sinh vien (y-male, n-female) (bam Enter de bo qua):");
                            String genderTemp = scanner.next();
                            if (genderTemp.isEmpty()) {
                                gender = student.isStuGender();
                            } else {
                                while (!Validator.checkRegex(genderTemp, Regex.GENDER)) {
                                    System.out.println("Gioi tinh chi lua chon y (yes - male) hoac n (no - female), moi nhap lai");
                                    genderTemp = scanner.next();
                                }
                                gender = genderTemp.toLowerCase().compareToIgnoreCase("y") == 0;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Nhap sai dinh dang y (yes - male) hoac n (no - female), moi nhap lai");
                        }
                    }
                    scanner.nextLine();
                    while (true) {
                        try {
                            System.out.println("Nhap ngay thang nam sinh (yyyy-MM-dd) (bam Enter de bo qua): ");
                            String dateTime = scanner.nextLine();
                            birthday = dateTime.isEmpty() ? student.getStuBirthday() : LocalDate.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            break;
                        } catch (DateTimeParseException e) {
                            System.out.println("Ngay thang nam sinh phai dung dinh dang yyyy-MM-dd, moi nhap lai");
                        }
                    }
                    if (stuList.updateStudent(id, fullname, gender, birthday, phone)) {
                        System.out.println("Cap nhat student thu" + id + " thanh cong");
                        System.out.println(student.toString());
                    } else {
                        System.out.println("Khong the cap nhat student");
                    }
                    scanner.close();
                    return;
                }

                case 3 -> {
                    var stuList = new DaoStudent();
                    System.out.println("Danh sach sinh vien: ");
                    stuList.getAllListStudent().forEach(System.out::println);
                    System.out.println("Chon id sinh vien de xoa (kieu int): ");
                    while (true) {
                        try {
                            id = scanner.nextInt();
                            if (id > 0) break;
                            else {
                                System.out.println("id phai la kieu so va lon hon 0");
                                scanner.nextLine();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("id phai la kieu int, moi nhap lai");
                            scanner.nextLine();
                        }
                    }
                    System.out.println(stuList.deleteStudentById(id) ? "Xoa sinh vien thu " + id + "thanh cong" :
                            "Sinh vien thu " + id + "khong co trong danh sach de xoa");
                    scanner.close();
                    return;
                }

                case 4 -> {
                    var stuList = new DaoStudent();
                    System.out.println("Danh sach sinh vien da nhap: ");
                    stuList.getAllListStudent().forEach(System.out::println);
                    scanner.close();
                    return;
                }

                case 5 -> {
                    var stuList = new DaoStudent();
                    System.out.println("Danh sach sinh vien nam: ");
                    stuList.getStudentByGender(true).forEach(System.out::println);
                    scanner.close();
                    return;
                }

                case 6 -> {
                    var stuList = new DaoStudent();
                    System.out.println("Danh sach sinh vien nu: ");
                    stuList.getStudentByGender(false).forEach(System.out::println);
                    scanner.close();
                    return;
                }

                case 7 -> {
                    DaoStudent.deleteAll();
                    scanner.close();
                    return;
                }

                case 8 -> {
                    System.out.println("Ban da thoat chuong trinh");
                    scanner.close();
                    return;
                }
            }

        }

    }
}
