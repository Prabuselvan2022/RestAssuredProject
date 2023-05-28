package Booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ExtractResponseAsString {

    public static void main( String[] args ) {

        String booking = RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("booking")
                .body("{\n" +
                        "\"firstname\" : \"Hari1\",\n" +
                        "    \"lastname\" : \"Haran1\",\n" +
                        "    \"totalprice\" : 201,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "\"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .extract().body().asString();


        System.out.println("booking as response is "+ booking);



    }
}
