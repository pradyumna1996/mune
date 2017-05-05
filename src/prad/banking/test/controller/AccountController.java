/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prad.banking.test.controller;

import java.util.Scanner;
import prad.banking.test.dao.CustomerDAO;
import prad.banking.test.entity.Customer;

/**
 *
 * @author conne
 */
public class AccountController {

    private Scanner input;
    private CustomerDAO customerDAO;

    public AccountController(Scanner input, CustomerDAO customerDAO) {
        this.input = input;
        this.customerDAO = customerDAO;
    }

    public void menu() {

        System.out.println("Welcome To Customer Section");

        System.out.println("1. Add Customers");
        System.out.println("2. List Customers");
        System.out.println("6. Exit");
        System.out.println("Enter Your Choice [1-6]:");
    }

    public void addView() {

        Customer cust = new Customer();
        while (true) {

            System.out.println("Enter Following Credentials:");
            
            System.out.println("Customer's Name:");
                    
            cust.setName(input.next());

            System.out.println("Customer's Address:");
            cust.setAddress(input.next()); 

            System.out.println("Customer's Age:");
            cust.setAge(input.nextInt());

            customerDAO.insert(cust);
            
            System.out.println("Do You Want To Add More Records :[Y/N]");
           
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }
               
        }
        
            
    }

    public void showView() {

        System.out.println("List Of Customers: ");

        for (Customer c : customerDAO.getall()) {
            System.out.println(" Customer's ID: " + c.getId());
            System.out.println("Customer's Name: " + c.getName());
            System.out.println("Customer's Address: " + c.getAddress());
            System.out.println("Customer's Age: " + c.getAge());
        }
    }

}
