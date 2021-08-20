package app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExecuteUpdateCallableStatementNew {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";

        try (
            Connection conn = DriverManager.getConnection(strCon);
            CallableStatement csStmt = conn.prepareCall("{call insertStudent(?)}");
        ) {
            System.out.println("Thanh cong");
            //So 1 la vi tri ? thu nhat
            csStmt.setString(1, "Khac nguyen");
            int number = csStmt.executeUpdate();
            System.out.println("Gia tri cau lenh: "+number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
