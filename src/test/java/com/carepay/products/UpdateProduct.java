package com.carepay.products;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateProduct {

    @Test
    public void UpdateProduct() throws JsonProcessingException {

        ProductRatingClass rating = new ProductRatingClass(2.1, 430);
        ProductInfoClass info = new ProductInfoClass(
                7, "White Gold Plated Princess",
                16.99,
                "Classic Created Wedding Engagement Solitaire Diamond Promise Ring for Her. Gifts to spoil your love more for Engagement, Wedding, Anniversary, Valentine's Day...",
                 "jewelery",
                "https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg",
                rating

        );
        ProductRootClass root = new ProductRootClass(info);
        ObjectMapper mapper = new ObjectMapper();
        String product = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);


        String endpoint = "https://fakestoreapi.com/products";
        given().
                body(product).
                put(endpoint).
                then().log().body();



    }
}
