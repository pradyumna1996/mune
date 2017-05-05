/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prad.banking.test.dao;

import java.util.List;
import prad.banking.test.entity.Customer;

/**
 *
 * @author conne
 */
public interface CustomerDAO {
    boolean insert(Customer customers);
    List<Customer> getall();
    
    
    
    
}
