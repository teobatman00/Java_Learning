package app;

import java.sql.*;

public class ExecuteBatchCallableStatement {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";

        try (
                Connection conn = DriverManager.getConnection(strCon);
                CallableStatement csStmt = conn.prepareCall("{call insertStudent(?)}");
        ) {
            conn.setAutoCommit(false);
            csStmt.setString(1, "bao nguyen");
            csStmt.addBatch();
            csStmt.setString(1, "vu anh");
            csStmt.addBatch();

            csStmt.executeBatch();
            conn.commit();
            System.out.println("success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
