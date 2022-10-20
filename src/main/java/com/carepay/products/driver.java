package com.carepay.products;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class driver {
    public static void main(String args[]) throws JsonProcessingException {


        ProductRatingClass rating = new ProductRatingClass(3.5, 400);
        ProductInfoClass info = new ProductInfoClass(4, "mens Casual slim Fit", 15.99, "Yellow",
                "Mens Cloth", "https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_.jpg", rating

        );
        ProductRootClass root = new ProductRootClass(info);

        ObjectMapper mapper = new ObjectMapper();
        String product = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
// to see how the body looks like
        System.out.println(product);
    }
}