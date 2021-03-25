package com.vastika.jdbcdemo.basic.preparedstatement;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
    public static final String SQL = "insert into user_tbl(user_name, password)values(?, ?)";

    public static void main(String[] args) {
        try (

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setString(1, "raju");
            ps.setString(2, "hiihii");
            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
