package org.example;

import org.example.db.DBContactService;
import org.example.db.HikariCPDataSource;
import org.example.service.CRUDManager;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        DBContactService service = new DBContactService();
        CRUDManager manager = new CRUDManager();
        manager.printOptions();
    }
}