package ch.jonasgredig.localexpenses.controller.dao;

import ch.jonasgredig.localexpenses.db.DBConnection;
import ch.jonasgredig.localexpenses.model.Payment;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PaymentDAO {

    public Payment get(int id) {

        Connection conn = DBConnection.getConnection();

        // create a Statement from the connection
        Statement statement = null;
        try {
            statement = conn.createStatement();
            statement.executeQuery("");
            throw new NotImplementedException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean set(Payment payment) {
        return false;
    }

    public ArrayList<Payment> getAll(int userId) {
        return null;
    }



}
