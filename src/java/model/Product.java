/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Product implements Serializable{
    private int productID, categoryID;
    private String name, description;
    private float price;
    private List<String> img,size;
    private String displayimg;

    public Product() {
    }

    public Product(int productID, int categoryID, String name, String description, float price, List<String> img, List<String> size, String displayimg) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.img = img;
        this.size = size;
        this.displayimg = displayimg;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<String> getImg() {
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }

    public String getDisplayimg() {
        return displayimg;
    }

    public void setDisplayimg(String displayimg) {
        this.displayimg = displayimg;
    }
    
}
