package com.laio;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class LocationControllerTest {

    @Test
    public void testGetAllLocationsEndpoint() {
        given()
          .when().get("/location")
          .then()
             .statusCode(200);
    }


    @Test
    public void testGetLocationEndpoint() {
        given()
                .when().get("/location/1")
                .then()
                .statusCode(200);
    }
}