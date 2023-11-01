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
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        String sql = "INSERT INTO board (title,ctnts,writer)" +
                "VALUES" + "(?,?,?)";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate(); // insert, update, delete
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
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

    public static int updBoard(BoardEntity entity) {
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

    public static List<BoardEntity> selBoardList() {
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
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardById(int pk) {
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
                String title = rs.getString("title");
                String ctnts = rs.getString("ctnts");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                String updatedAt = rs.getString("updated_at");

                entity.setIboard(pk);
                entity.setTitle(title);
                entity.setCtnts(ctnts);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                entity.setUpdatedAt(updatedAt);
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
