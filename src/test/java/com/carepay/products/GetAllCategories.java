package com.carepay.products;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllCategories {

    @Test()
        public void getAllCategories(){
        String Url = "https://fakestoreapi.com/products";
        String baseUrl ="/categories";

        given().
                when().
                get(Url+baseUrl).
                then().
                statusCode(200).
                log().
                body();
    }
}
