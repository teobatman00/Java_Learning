package common;

import java.sql.*;

public class DBConnection {
    private static Connection connection = null;
    private static String url = "jdbc:sqlserver://";
    private static String serverName = "DESKTOP-TB2906V";
    private static String portNumber = "1433";
    private static String databaseName = "javawindowc2007l";
    private static String userName = "sa";
    private static String password = "1234567";

    public static String getConnectionUrl(){
        return url + serverName + ":" + portNumber +";"
                + "databaseName="+ databaseName + ";"
                + "user=" + userName + ";password=" +password;
    }

    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection(getConnectionUrl());
        } catch (Exception e){
            e.printStackTrace();
            connection = null;
        }
        return connection;
    }

    public Connection getConnect(){
        try {
            connection = DriverManager.getConnection(getConnectionUrl());
        } catch (Exception e){
            e.printStackTrace();
            connection = null;
        }
        return connection;
    }


}
