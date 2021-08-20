package app;

import java.sql.*;

public class ExecuteUpdateStatement {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433;"
                + "databaseName=javac2007l; user=sa; password=1234567";

        Connection conn = null;
//        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(strCon);
            System.out.println("Thanh cong");
            String sql = "drop table if exists Student " +
                    "create table Student (" +
                    "id int primary key identity," +
                    "fullname nvarchar(50)" +
                    ")";
//            stmt = conn.createStatement();
            int number = conn.createStatement().executeUpdate(sql);
            System.out.println("Gia tri cua cau lenh: "+number);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
