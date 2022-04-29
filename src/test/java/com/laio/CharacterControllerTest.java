package com.laio;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CharacterControllerTest {

    @Test
    public void testGetAllCharactersEndpoint() {
        given()
          .when().get("/character")
          .then()
             .statusCode(200);
    }


    @Test
    public void testGetCharactersEndpoint() {
        given()
                .when().get("/character/1")
                .then()
                .statusCode(200);
    }
}