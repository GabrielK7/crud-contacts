package org.example.service;

import org.example.db.Contact;
import org.example.db.DBContactService;
import org.example.utility.InputUtils;

import java.util.List;

public class CRUDManager {
    public final DBContactService contactService;

    public CRUDManager(){
        this.contactService = new DBContactService();
    }

    public void printOptions(){
        System.out.println("Hello, welcome to contacts manager\n");
        while(true){
            System.out.println("0. Get all contacts");
            System.out.println("1. Edit  contact");
            System.out.println("2. Edit all contacts");
            System.out.println("3. Add contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit");

            final  int choice = InputUtils.readInt();
            switch (choice){

                case 0 -> printAllContacts();

            }

        }
    }

    public void printAllContacts(){

        final List<Contact> contacts = contactService.readAll();
        contacts.forEach(System.out :: println);

    }

}
