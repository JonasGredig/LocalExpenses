package ch.jonasgredig.localexpenses.db;

import ch.jonasgredig.localexpenses.model.Payment;

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
        return null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean set(Payment payment) {
        return false;
    }

    public ArrayList<Payment> getAll(int userId) {
        return null;
    }



}
