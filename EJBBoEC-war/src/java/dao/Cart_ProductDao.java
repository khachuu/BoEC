/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Cart_Product;
import java.util.ArrayList;

/**
 *
 * @author taint
 */
public interface Cart_ProductDao {
    public void addProductToCart(int idCart, int idProduct, int amount);
    public void deleteProduct(int idCart, int idProduct);
    public boolean checkProductInCart(int idCart, int idProduct);
    public void update(int idCart, int idProduct, int amount);
    public ArrayList<Cart_Product> getListCartProductByIdCart(int idCart);
    public void deleteProductInCart(int idCart, int idProduct);
    public void deleteAllProductInCartThenPay(int idCart);
}
