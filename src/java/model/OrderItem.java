/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class OrderItem {
    private int orderID;
    private CartItem cartitem;

    public OrderItem() {
    }

    public OrderItem(int orderID, CartItem cartitem) {
        this.orderID = orderID;
        this.cartitem = cartitem;
    }

    public int getOrderid() {
        return orderID;
    }

    public void setOrderid(int orderID) {
        this.orderID = orderID;
    }

    public CartItem getCartitem() {
        return cartitem;
    }

    public void setCartitem(CartItem cartitem) {
        this.cartitem = cartitem;
    }
}
