package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        // MyConn에 있는 getConn메소드 호출하시고 메소드가 리턴해주는 값 담아보세요
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country_id,country) VALUES (111,'경현나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnTest2 {
    public static void main(String[] args) {
        // title : 처음 작성
        // ctnts : 처음 작성하는 내용입니다.
        // writer : 홍길동
        BoardEntity be = new BoardEntity();
        be.setTitle("오늘 insert배움");
        be.setCtnts("java를 통해 board테이블에 값 넣어봄");
        be.setWriter("어려워");
        int row = BoardDao.insBoard(be);

    }
}