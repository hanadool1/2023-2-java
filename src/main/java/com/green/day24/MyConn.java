package com.green.day24;

import java.sql.*;

public class MyConn { // 자바와 sql 통신
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";


    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("문제발생");
            e.printStackTrace();
        }
        System.out.println("접속 성공");
        return conn;
    }
    public static void close(Connection con, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(con,ps);
    }
}
