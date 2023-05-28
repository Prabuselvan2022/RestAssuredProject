package Booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateBooking {
    public static void main( String[] args ) {
//        RequestSpecification requestSpecification = RestAssured.given().log().all();
//        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
//        requestSpecification.basePath("booking");
//        requestSpecification.body("{\n" +
//                "\"firstname\" : \"Prabu1\",\n" +
//                "    \"lastname\" : \"Selvan1\",\n" +
//                "    \"totalprice\" : 202,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "\"additionalneeds\" :    \"Breakfast1\"\n" +
//                "}");
//
//        requestSpecification.contentType(ContentType.JSON);
////Response is the interface
//        Response response = requestSpecification.post();
//        ValidatableResponse validatableResponse = response.then().log().all();
//        validatableResponse.statusCode(200);


//        RestAssured.given()
//                .baseUri("https://restful-booker.herokuapp.com")
//                .basePath("booking")
//                .body("{\n" +
//                        "\"firstname\" : \"Prabu1\",\n" +
//                        "    \"lastname\" : \"Selvan1\",\n" +
//                        "    \"totalprice\" : 202,\n" +
//                        "    \"depositpaid\" : true,\n" +
//                        "    \"bookingdates\" : {\n" +
//                        "        \"checkin\" : \"2018-01-01\",\n" +
//                        "        \"checkout\" : \"2019-01-01\"\n" +
//                        "    },\n" +
//                        "\"additionalneeds\" :    \"Breakfast1\"\n" +
//                        "}")
//                .contentType(ContentType.JSON)
//                .post()
//                .then()
//                .log()
//                .all()
//                .statusCode(200);





    }
}
