package com.vastika.jdbcdemo.basic.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreateDemo {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root1234";
    public static final String SQL = "create database jdbc_demo_db";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            //1. register the driver
            Class.forName(DRIVER_NAME);
            //2.Obtain connection object
            con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            //3.Obtain statement object
            st= con.createStatement();
            //4.execute the query
            st.executeUpdate(SQL);
            System.out.println("db created");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //5.close the connection
                con.close();
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
}

