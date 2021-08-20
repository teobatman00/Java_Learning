package app;

import java.sql.*;

public class ExecuteQueryStatementNew {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";

        try (
            Connection conn = DriverManager.getConnection(strCon);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Student");
        ) {
            while (rs.next()){
                System.out.println("id: "+ rs.getInt("Id"));
                System.out.println("fullname: " + rs.getString("fullname"));
                System.out.println("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
