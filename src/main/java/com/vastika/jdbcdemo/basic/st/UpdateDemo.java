package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL = "update user_tbl set user_name='krishna', password='tt@123' where id = 3";

    public static void main(String[] args) {
        try (
                //these above two lines can be also written as:
                Statement st = DbUtil.getConnection().createStatement();
        ){
            st.executeUpdate(SQL);
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
