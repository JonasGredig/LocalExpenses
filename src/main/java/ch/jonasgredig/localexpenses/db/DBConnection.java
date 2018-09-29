package ch.jonasgredig.localexpenses.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection() {

        Properties prop = new Properties();
        InputStream input = null;


        try {
            input = new FileInputStream("config.properties");
            prop.load(input);

            Connection conn = null;

            Properties connectionProps = new Properties();
            connectionProps.put("user", prop.getProperty("dbuser"));
            connectionProps.put("password", prop.getProperty("dbpassword"));

            conn = DriverManager.getConnection("jdbc:" + prop.getProperty("db") + "://" + prop.getProperty("host") + ":" + prop.getProperty("dbport") + "/", connectionProps);
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
