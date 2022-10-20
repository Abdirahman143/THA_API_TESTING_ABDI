package com.carepay.products;

import java.awt.*;

public class ProductInfoClass {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    ProductRatingClass rating;





    public ProductInfoClass(int id, String title, double price, String description, String category, String image, ProductRatingClass rating) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ProductRatingClass getRating() {
        return rating;
    }

    public void setRating(ProductRatingClass rating) {
        this.rating = rating;
    }
}
