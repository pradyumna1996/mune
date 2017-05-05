/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prad.banking.test;

import java.util.Scanner;
import prad.banking.test.controller.AccountController;
import prad.banking.test.impl.CustomerDAOImpl;

/**
 *
 * @author conne
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //For Bank Use
        //For Customer Entry
        Scanner input = new Scanner(System.in);

        AccountController ac = new AccountController(input, new CustomerDAOImpl());

        ac.menu();
        switch (input.nextInt()) {
            case 1:
                ac.addView();
                break;

            case 2:
                ac.showView();
                break;
        }

    }
}
