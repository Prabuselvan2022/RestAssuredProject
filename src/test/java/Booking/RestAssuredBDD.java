package Booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredBDD {
    public static void main( String[] args ) {

        RestAssured.given().baseUri("").basePath("booking").body("{\n" +
                "\"firstname\" : \"Prabu1\",\n" +
                "    \"lastname\" : \"Selvan1\",\n" +
                "    \"totalprice\" : 202,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "\"additionalneeds\" :    \"Breakfast1\"\n" +
                "}").contentType(ContentType.JSON).log().all().when().post().then().log().all().statusCode(200);
    }
}
