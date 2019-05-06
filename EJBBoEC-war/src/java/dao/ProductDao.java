/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Products;
import java.util.ArrayList;

/**
 *
 * @author taint
 */
public interface ProductDao {
    public void addProduct(Products products);
    public ArrayList<Products> searchProductsByName(String name);
    public ArrayList<Products> getProductsByType(String type); 
    public Products getProductsById(int idProduct);
    
}
