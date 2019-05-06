/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import builder.Member;
import entities.Customer;

/**
 *
 * @author taint
 */
public interface CustomerDao {
    
    public Customer getCustomerByName(String username);
    
}
