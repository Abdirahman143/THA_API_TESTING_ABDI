package com.carepay.products;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetProduct {


    @Test(priority = 0)
    public void getAllProducts() {

        String endpoint = "https://fakestoreapi.com/products";

        given().
                when().
                get(endpoint).
                then().
                statusCode(200).
                log().
                body();

    }


    @Test
    public void getSingleProduct() throws JsonProcessingException {

        List<Map<String, Object>> productRoot = new LinkedList<Map<String, Object>>();
        Map<String, Object> productInfo = new LinkedHashMap<String, Object>();
        Map<String, Object> ratingObject = new LinkedHashMap<String, Object>();
        productInfo.put("id", 4);
        productInfo.put("title", "Mens Casual Slim Fit");
        productInfo.put("price", 15.99);
        productInfo.put("description", "The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description.");
        productInfo.put("category", "men's clothing");
        productInfo.put("image", "https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_.jpg");
        ratingObject.put("rate", 2.1);
        ratingObject.put("count", 430);
        productInfo.put("rating", ratingObject);
        productRoot.add(productInfo);
         ObjectMapper objectMapper =new ObjectMapper();
         objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(productRoot);

        String endpoint = "https://fakestoreapi.com/products";
                      given().
                        body(objectMapper).
                               get(endpoint).
                                    then().statusCode(200).log().body();




    }


@Test(priority = 1)
    public void GetSingleProduct() throws JsonProcessingException {

        ProductRatingClass rating = new ProductRatingClass(2.1, 430);
        ProductInfoClass info = new ProductInfoClass(
                4, "Mens Casual Slim Fit",
                15.99,
                "The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description.",
                "men's clothing",
                "https://fakestoreapi.com/img/71YXzeOuslL._AC_UY879_.jpg",
                rating

        );
    ProductRootClass root = new ProductRootClass(info);
    ObjectMapper mapper = new ObjectMapper();
    String product = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);


    String endpoint = "https://fakestoreapi.com/products";
        var response=   given().
               log().all().
                   body(product).
                       get(endpoint).
                          then().statusCode(200);
          response.log().body();

    }
}