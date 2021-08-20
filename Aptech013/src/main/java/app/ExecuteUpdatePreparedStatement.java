package app;

import java.sql.*;

public class ExecuteUpdatePreparedStatement {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V; "
                + "databaseName=javac2007l; user=sa; password=1234567";
        Connection conn = null;
        PreparedStatement preStmt = null;
        try {
            conn = DriverManager.getConnection(strCon);
            System.out.println("Thanh cong");
            String sql = "insert into Student (fullname) values(?)";
            preStmt = conn.prepareStatement(sql);
            //So 1 la vi tri ? thu nhat
            preStmt.setString(1, "Khac nguyen");
            int number = preStmt.executeUpdate();
            System.out.println("Gia tri cau lenh: "+number);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn!=null && preStmt!=null){
                    preStmt.close();
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
