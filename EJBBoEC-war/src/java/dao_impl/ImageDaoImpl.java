/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.ImageDao;
import entities.Image;
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
public class ImageDaoImpl implements ImageDao{

    @Override
    public ArrayList<Image> getImageByProductsId(int ProductsId) {
        Connection conn = null;
        Statement st = null;
        ResultSet resultSet = null;
        ArrayList<Image> al = new ArrayList<>();
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "SELECT Url1 FROM image WHERE ProductsId = '" + ProductsId + "' ";
            
            resultSet = st.executeQuery(query);
            while(resultSet.next()){
                Image image = new Image();
                image.setUrl1(resultSet.getString("Url1"));
                al.add(image);
            }
            return al;
        } catch (SQLException ex) {
            System.out.println("loi get image tu productid?");
        } 
        return al;
    }
    
}
