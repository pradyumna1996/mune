/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prad.banking.test.entity;

/**
 *
 * @author conne
 */
public class Customer {
    
   private int id;
   private String name;
   private String Address;
   private int age;   

    public Customer() {
    }
    
    public Customer(int id, String name, String Address, int age) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
