package com.green.day24;

import org.checkerframework.checker.units.qual.A;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { // insert
        int result = 0;
        String sql = "INSERT INTO board (title,ctnts,writer)" +
                "VALUES (?, ?, ?)";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null; // PreparedStatement가 생기면서 ? 사용가능
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate(); // insert, update, delete
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 무조건 실행 -> 리소스를 너무 많이 잡아먹어서 닫아줘야함
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) { // delete
        int result = 0;
        String sql = "DELETE FROM board " +
                "WHERE iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate(); // insert, update, delete
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int updBoard(BoardEntity entity) { // update
        int result = 0;
        String sql = "UPDATE board " +
                "SET title = ?, ctnts = ?, writer = ?, updated_at = now() " +
                "WHERE iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate(); // insert, update, delete
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    // 검색, 페이징
    public static List<BoardEntity> selBoardList() { // select 모든 데이터
        List<BoardEntity> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT iboard, title, writer, created_at FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // select만

            while (rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(rs.getInt("iboard"));
                entity.setTitle(rs.getString("title"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardById(int pk) { // select 1개만
        BoardEntity entity = new BoardEntity();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, ctnts, writer, created_at, updated_at FROM board WHERE iboard = ?";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pk);
            rs = ps.executeQuery(); // select만
            if (rs.next()) {
                entity.setIboard(pk);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return null;
    }
}
