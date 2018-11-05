package ch.jonasgredig.localexpenses.controller.dao;

import ch.jonasgredig.localexpenses.db.DBConnection;
import ch.jonasgredig.localexpenses.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao implements iUserDao {


    @Override
    public User getUser(int id) {
      return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public User getUser(String email) {
        return null;
    }

    @Override
    public boolean createUser(User user) {
        String sql = "INSERT INTO user(name, firstname, email, password, isDeleted) VALUES(?,?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getFirstname());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setBoolean(5, user.isDeleted());
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(int id) {
        return false;
    }
}
