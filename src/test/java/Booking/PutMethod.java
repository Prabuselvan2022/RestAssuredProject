package Booking;

import io.restassured.RestAssured;

public class PutMethod {
    public static void main( String[] args ) {
        RestAssured.given()
                .log().all()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("booking/1")
                .header("Content-type","application/json")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .body("{\n" +
                        "\"firstname\" : \"Prabu1\",\n" +
                        "    \"lastname\" : \"Selvan1\",\n" +
                        "    \"totalprice\" : 202,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "\"additionalneeds\" :    \"Breakfast1\"\n" +
                        "}")
                .when()
                    .put()
                .then()
                    .log().all()
                    .assertThat()
                    .statusCode(200);




    }
}
