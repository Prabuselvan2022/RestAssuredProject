package Booking;

import io.restassured.RestAssured;

public class GetBooking {
    public static void main( String[] args ) {
        RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com").basePath("booking/{id}").pathParam("id",1).log().all().when().get().then().log().all().statusCode(200);

    }
}
