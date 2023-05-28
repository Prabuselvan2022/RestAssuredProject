package Booking;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class PathParameter {
    public static void main( String[] args ) {

        Map<String, Object> pathParamters = new HashMap<>();
        pathParamters.put("basePath", "booking");
        pathParamters.put("bookingid", 1);
        RestAssured.given()
                .log().all()
                .baseUri("https://restful-booker.herokuapp.com")

                .basePath("{basePath}/{bookingid}")
                .pathParam("basePath", "booking")
                .pathParams(pathParamters)
//                            .pathParam("bookingid","1")
                .when()
                .get()
                .then()
                .log().all();


    }
}
