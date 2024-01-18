package com.example.aims;

import com.example.aims.database.DBConnection;

public class DBTest {
    public static void main(String[] args) {
        DBConnection.connect();
        DBConnection.insertToProduct("2", "Clean Code", "Book", "100000", "100000", "2", "file:/C:/sonesto/TKXDPM.KHMT.20231-20/Programming/AIMS/src/main/java/com/example/aims/assets/images/clean_code.jpg");
    }
}
