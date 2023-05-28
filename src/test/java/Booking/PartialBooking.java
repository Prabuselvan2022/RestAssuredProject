package Booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialBooking {
    public static void main( String[] args ) {
        RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com")
                .header("ContentType", "application/json")
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .basePath("booking/1")
                .body("{\n" +
                        "    \"firstname\": \"James\",\n" +
                        "    \"lastname\": \"Prabu\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .patch()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);


    }
}
