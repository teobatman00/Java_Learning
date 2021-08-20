package app;

import java.sql.*;

public class ExecuteUpdateCallableStatement {

    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";
        Connection conn = null;
        CallableStatement csStmt = null;
        try {
            conn = DriverManager.getConnection(strCon);
            System.out.println("Thanh cong");
            csStmt = conn.prepareCall("{call insertStudent(?)}");
            //So 1 la vi tri ? thu nhat
            csStmt.setString(1, "Khac nguyen");
            int number = csStmt.executeUpdate();
            System.out.println("Gia tri cau lenh: "+number);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn!=null && csStmt!=null){
                    csStmt.close();
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
