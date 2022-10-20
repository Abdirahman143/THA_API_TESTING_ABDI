package com.carepay.products;



public class ProductRatingClass {

    public ProductRatingClass() {
    }

    public ProductRatingClass(double rate, int count) {
        this.rate = rate;
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private double rate;
    private int count;
}