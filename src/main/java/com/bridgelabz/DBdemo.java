package com.bridgelabz;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DBdemo {

    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://localhost:3306/payroll_service";
        String userName = "root";
        String password = "Ardent@1";
        Connection con;
        // driver loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           // System.out.println("Driver loadded");

        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("cannot find the Driver", e);

        }
        listDrivers();
        // create a connection
        try {
            System.out.println("Connecting to database:" + jdbcurl);
            con = DriverManager.getConnection(jdbcurl, userName, password);
           // System.out.println("Connection is successful" + con);
        } catch (Exception e) {
           // e.printStackTrace();
        }
    }
    private static void listDrivers(){
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()){
            Driver driverClass = (Driver) driverList.nextElement();
        //    System.out.println(" "+driverClass.getClass().getName());
        }

    }
}