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
public class CartItem {
    private int cartID; 
    private int quantity;
    private Product product;

    public CartItem( int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getCartid() {
        return cartID;
    }

    public void setCartid(int cartID) {
        this.cartID = cartID;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
