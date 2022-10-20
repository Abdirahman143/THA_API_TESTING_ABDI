package com.carepay.products;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class AddNewProduct {

    @Test
    public void CreateProduct() throws JsonProcessingException {

        ProductRatingClass rating = new ProductRatingClass(3.1, 430);
        ProductInfoClass info = new ProductInfoClass(
                21, "Mens Casual Slim Fit",
                16.99,
                "The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description.",
                "men's clothing",
                "https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_.jpg",
                rating

        );
        ProductRootClass root = new ProductRootClass(info);
        ObjectMapper mapper = new ObjectMapper();
        String product = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);


        String endpoint = "https://fakestoreapi.com/products";    var response =  given().
                body(product).
                post(endpoint).
            then();
    response.log().body();


    }
}
