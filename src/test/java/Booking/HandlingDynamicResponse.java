package Booking;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class HandlingDynamicResponse {
    public static void main( String[] args ) {

        Response response = RestAssured.get("https://run.mocky.io/v3/10e6a56e-134e-498e-aa7f-81f5804335c3");
        Object responseAsObject = response.as(Object.class);

        if(responseAsObject instanceof List) {
            List list = (List) responseAsObject;
            System.out.println(list.size());
        } else if(responseAsObject instanceof Map) {
            Map respObj = (Map) responseAsObject;
            System.out.println(respObj.keySet());
        }

    }
}
