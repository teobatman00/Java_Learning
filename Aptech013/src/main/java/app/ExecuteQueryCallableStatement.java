package app;

import java.sql.*;

public class ExecuteQueryCallableStatement {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(strCon);
            cs = conn.prepareCall("{call selectStudent(?)}");
            cs.setInt(1,2);
            rs = cs.executeQuery();
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
                    cs.close();
                    rs.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
