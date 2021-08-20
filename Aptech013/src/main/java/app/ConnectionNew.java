package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionNew {
    public static void main(String[] args) {
        String strCon = "jdbc:sqlserver://DESKTOP-TB2906V;"
                + "databaseName=javac2007l; user=sa; password=1234567";
        try(Connection conn = DriverManager.getConnection(strCon)) {
            System.out.println("Thanh cong");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
