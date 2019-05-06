/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.ProductDao;
import entities.Products;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class ProductDaoImpl implements ProductDao
{

    @Override
    public void addProduct(Products products) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Products> searchProductsByName(String name) {
      ArrayList<Products> productses = new ArrayList<>();
    
        Connection conn = null;
        Statement st = null;
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
           
            String query = "SELECT Id,ManufactoryID,ProductStatID,Name,Price,Stock from products where Name like '%"+name+"%'";
            ResultSet resultSet = st.executeQuery(query);
            System.out.println(query);
            while(resultSet.next()){
                Products products = new Products();
                products.setId(resultSet.getInt("Id"));
                products.setProductStatID(resultSet.getInt("ProductStatID"));
                products.setManufactoryID(resultSet.getInt("ManufactoryID"));
//                products.setCartId(resultSet.getInt("CartId"));
                products.setName(resultSet.getString("Name"));
                products.setPrice(resultSet.getDouble("Price"));
                products.setStock(resultSet.getInt("Stock"));
                productses.add(products);
            }
        } catch (SQLException ex) {
        } 
      return productses;
    }

    @Override
    public ArrayList<Products> getProductsByType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        ProductDaoImpl productDaoImpl  = new ProductDaoImpl();
        ArrayList<Products> productses = productDaoImpl.searchProductsByName("a");
        for(Products products: productses){
            System.out.println(products.toString()+"-"+products.getProductStatID());
        }
                
    }

    @Override
    public Products getProductsById(int idProduct) {
//      ArrayList<Products> productses = new ArrayList<>();
    
        Connection conn = null;
        Statement st = null;
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
           
            String query = "SELECT Id,ManufactoryID,ProductStatID,Name,Price,Stock from products where Id like '%"+idProduct+"%'";
            ResultSet resultSet = st.executeQuery(query);
            System.out.println(query);
            while(resultSet.next()){
                Products products = new Products();
                products.setId(resultSet.getInt("Id"));
                products.setProductStatID(resultSet.getInt("ProductStatID"));
                products.setManufactoryID(resultSet.getInt("ManufactoryID"));
//                products.setCartId(resultSet.getInt("CartId"));
                products.setName(resultSet.getString("Name"));
                products.setPrice(resultSet.getDouble("Price"));
                products.setStock(resultSet.getInt("Stock"));
                return products;
            }
        } catch (SQLException ex) {
        } 
      return null;
    }
}
