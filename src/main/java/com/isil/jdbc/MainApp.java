package com.isil.jdbc;

import com.sun.corba.se.pept.transport.ConnectionCache;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {

    public static void main(String[] args) throws Exception {

        String jdcbUrl= "jdbc:mysql://localhost:3306/DESA";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(jdcbUrl,"root", "root");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from users");

        while(rs.next()){
            System.out.println(rs.getString("idUser") +
                    " " + rs.getString("name") +
                    " " + rs.getString("phone") +
                    " " + rs.getString("city"));
        }

    }
}
