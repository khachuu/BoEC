/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Cart;

/**
 *
 * @author taint
 */
public interface CartDao {
    public Cart createCart();
    public boolean checkCartIsExist(int id);
    public int checkNumberOfProductInCart(int id);
}
