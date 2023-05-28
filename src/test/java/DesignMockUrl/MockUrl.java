package DesignMockUrl;

import io.restassured.RestAssured;

public class MockUrl {

    public static void main( String[] args ) {

        RestAssured.given()
                .log().all()
                .get("https://run.mocky.io/v3/a75f08e8-ba8c-49cf-9a92-a857e9409f2c")
                .then().log().all();
    }
}
