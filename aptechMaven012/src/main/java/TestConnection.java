import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        //Dung cho quyen sa
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V;"
                + "databaseName=javac2007l; user=sa; password=1234567";
        //Dung cho quyen window
//        String strConn = "jdbc:sqlserver://DESKTOP-TB2906V:1433;"
//                + "databaseName=javac2007l; integratedSecurity=true";
        Connection conn = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(strCon);
            System.out.println("Thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
