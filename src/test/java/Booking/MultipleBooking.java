package Booking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleBooking {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;

    @BeforeClass
    public void beforeClass( ) {
        requestSpecification = RestAssured.given();
        requestSpecification
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON);

        responseSpecification = RestAssured.expect();
        responseSpecification.log().all()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .time(Matchers.lessThan(5000L));


    }

    @Test
    public void createBooking( ) {
        RestAssured.given().spec(requestSpecification)
                .basePath("booking")
                .body("{\n" +
                        "\"firstname\" : \"Soumya\",\n" +
                        "    \"lastname\" : \"Ranjam\",\n" +
                        "    \"totalprice\" : 201,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "\"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .when()
                .post()
                .then()
                .spec(responseSpecification);

    }

    @Test
    public void updateBooking( ) {
        RestAssured.given().spec(requestSpecification)

                .basePath("booking/1")
                .body("{\n" +
                        "\"firstname\" : \"Prabu\",\n" +
                        "    \"lastname\" : \"Selvan\",\n" +
                        "    \"totalprice\" : 1000\n" +
                        "\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .patch()
                .then()
                .spec(responseSpecification);
    }
}
