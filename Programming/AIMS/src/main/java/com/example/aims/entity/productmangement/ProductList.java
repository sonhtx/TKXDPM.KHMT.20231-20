package com.example.aims.entity.productmangement;

import com.example.aims.database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Singleton Design Pattern with lazy initialization

public class ProductList {
    private static ProductList instance;
    private static List<Product> productList;

    private ProductList() {
        productList = new ArrayList<Product>();

        try {
            Connection conn = DBConnection.connect();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "SELECT * FROM Product";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                ProductCategory category = ProductCategory.Book;
                String cat = rs.getString("category");
                if (cat.equals("CD")) category = ProductCategory.CD;
                if (cat.equals("LP")) category = ProductCategory.LP;
                if (cat.equals("DVD")) category = ProductCategory.DVD;
                int value = rs.getInt("value");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String imageUrl = rs.getString("imageUrl");
                Product currentProduct = new Product(id, title, category, value, price, quantity, imageUrl);
                productList.add(currentProduct);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception");
        }
    }

    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
        }
        return instance;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        System.out.println("Adding product here");
        productList.add(product);
    }

    void updateProduct(Product product) {

    }

    void deleteProduct(Product product) {

    }

    void viewProduct(Product product) {

    }
}
