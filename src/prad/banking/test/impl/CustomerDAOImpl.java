/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prad.banking.test.impl;

import java.util.ArrayList;
import java.util.List;
import prad.banking.test.dao.CustomerDAO;
import prad.banking.test.entity.Customer;

/**
 *
 * @author conne
 */
public class CustomerDAOImpl implements CustomerDAO {

   List<Customer> customers= new ArrayList<>();
    
    @Override
    public boolean insert(Customer customer) {
        
       return customers.add(customer);
    }

    @Override
    public List<Customer> getall() {
    return customers;
    }
    
}
