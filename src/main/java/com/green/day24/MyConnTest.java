package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
        be.setTitle("간");
        be.setCtnts("프링글스");
        be.setWriter("과자");
        int row = BoardDao.insBoard(be);

    }
}

class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(1);

        int row = BoardDao.delBoard(entity);

    }
}

class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(4);
        entity.setTitle("수정 제목");
        entity.setCtnts("수정 내용");
        entity.setWriter("수정자");
        int row = BoardDao.updBoard(entity);

    }
}

class MyConnTest5 {
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        for (BoardEntity entity : list) {
            System.out.println(entity);
        }
    }
}

class MyConnTest6 {
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardById(3);
        System.out.println(result);
    }
}