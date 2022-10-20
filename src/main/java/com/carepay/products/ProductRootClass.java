package com.carepay.products;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductRootClass {
    ProductInfoClass info;

    public ProductRootClass(ProductInfoClass info) {
        this.info = info;
    }

    public ProductInfoClass getInfo() {
        return info;
    }

    public void setInfo(ProductInfoClass info) {
        this.info = info;
    }
}
