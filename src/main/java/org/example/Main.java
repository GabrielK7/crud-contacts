package org.example;

import org.example.db.DBContactService;
import org.example.db.HikariCPDataSource;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        DBContactService service = new DBContactService();
        service.readAll().forEach(System.out ::println);
    }
}