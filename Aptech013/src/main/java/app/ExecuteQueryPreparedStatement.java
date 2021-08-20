package app;

import java.sql.*;

public class ExecuteQueryPreparedStatement {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(strCon);
            ps = conn.prepareStatement("select * from Student where id = ? or fullname = ?");
            ps.setInt(1,1);
            ps.setString(2,"Minh Duong");
            rs = ps.executeQuery();
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
                    ps.close();
                    rs.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
