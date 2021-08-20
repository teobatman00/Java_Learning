package app;

import java.sql.*;

public class ExecuteQueryStatement {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(strCon);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from Student");
            while (rs.next()){
                System.out.println("id: "+ rs.getInt("Id"));
                System.out.println("fullname: " + rs.getString("fullname"));
                System.out.println("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null){
                    conn.close();
                    stmt.close();
                    rs.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
