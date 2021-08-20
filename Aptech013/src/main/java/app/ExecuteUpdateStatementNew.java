package app;

import java.sql.*;

public class ExecuteUpdateStatementNew {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433;"
                + "databaseName=javac2007l; user=sa; password=1234567";

        try (
            Connection conn = DriverManager.getConnection(strCon);
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Thanh cong");
            String sql = "drop table if exists Student " +
                    "create table Student (" +
                    "id int primary key identity," +
                    "fullname nvarchar(50)" +
                    ")";
            int number = stmt.executeUpdate(sql);
            System.out.println("Gia tri cua cau lenh: "+number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
