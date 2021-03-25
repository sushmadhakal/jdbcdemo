package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

    public static final String SQL = "create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(45), primary key(id))";

    public static void main(String[] args) {

        try (
                Connection con = DbUtil.getConnection();
                Statement st = con.createStatement();
                ){

            //4.execute the query
            st.executeUpdate(SQL);
            System.out.println("table created");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
