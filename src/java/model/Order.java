/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Order {
    private int orderID;
    private String username;
    private Date adddate;
    private String status;

    public Order() {
    }

    public Order(String username, Date adddate, String status) {
        this.username = username;
        this.adddate = adddate;
        this.status = status;
    }

    public Order(int orderID, String username, Date adddate) {
        this.orderID = orderID;
        this.username = username;
        this.adddate = adddate;
        this.status = "Đặt hàng thành công";
    }

    public int getOrderid() {
        return orderID;
    }

    public void setOrderid(int orderID) {
        this.orderID = orderID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}

