package com.bridgelabz;
import java.sql.*;

public class Emp_Payroll_JDBC {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Ardent@1");
            Statement statement = connection.createStatement();
            statement.execute("insert into employee_payroll values('6','Ram','40000.00','2019-05-15');");
            statement.execute("insert into employee_payroll values('7','Sachin','40000.00','2019-05-15');");

       connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}