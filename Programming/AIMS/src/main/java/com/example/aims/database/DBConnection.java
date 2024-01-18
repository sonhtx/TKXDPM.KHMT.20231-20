package com.example.aims.database;

import com.example.aims.entity.productmangement.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:/C:/sonesto/TKXDPM.KHMT.20231-20/productmanagementdb/productmanagement.db/");
            System.out.println("Database Connected!!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed, class not found.");
        }
        return conn;
    }

    public static void insertToProduct(String id, String title, String category, String value, String price, String quantity, String imageUrl) {
        Connection conn = connect();
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO Product(id, title, category, value, price, quantity, imageUrl) VALUES(?,?,?,?,?,?,?) ";
            assert conn != null;
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, title);
            ps.setString(3, category);
            ps.setString(4, value);
            ps.setString(5, price);
            ps.setString(6, quantity);
            ps.setString(7, imageUrl);
            ps.execute();
        } catch (SQLException e) {
            System.out.println("SQL Exception.");
        }
    }

    public static void addProduct(Product product) {
        String id = Integer.toString(product.getId());
        String title = product.getTitle();
        String category = product.getCategory().toString();
        String value = Integer.toString(product.getValue());
        String price = Integer.toString(product.getPrice());
        String quantity = Integer.toString(product.getQuantity());
        String imageUrl = product.getImageUrl();
        insertToProduct(id, title, category, value, price, quantity, imageUrl);
    }
}
