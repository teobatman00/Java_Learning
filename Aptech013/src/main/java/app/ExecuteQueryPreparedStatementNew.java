package app;

import java.sql.*;

public class ExecuteQueryPreparedStatementNew {

    public static PreparedStatement createPS(Connection conn, String sql) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,2);
        ps.setString(2,"vu anh");
        return ps;
    }

    public static PreparedStatement createPS(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from Student where id = ? or fullname = ?");
        ps.setInt(1,2);
        ps.setString(2,"vu anh");
        return ps;
    }

    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V:1433; "
                + "databaseName=javac2007l; user=sa; password=1234567";

        try (
            Connection conn = DriverManager.getConnection(strCon);
            PreparedStatement ps = createPS(conn);
            ResultSet rs = ps.executeQuery();
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
