package Booking;

import io.restassured.RestAssured;

import java.util.Map;

public class ConvertJSONResponseToMap {
    public static void main( String[] args ) {
//        Map jsonResponseasMap=RestAssured
//                .get("https://run.mocky.io/v3/a75f08e8-ba8c-49cf-9a92-a857e9409f2c")
//                .as(Map.class);
//
//        Object first_name = jsonResponseasMap.get("first_name");
//        System.out.println(first_name);
        Map jsonResponseAsMap = RestAssured
                .get("https://run.mocky.io/v3/4c28d457-e687-46db-b33c-305de5953507")
                .as(Map.class);

        System.out.println(jsonResponseAsMap.toString());

//        String firstname = (String) jsonResponseAsMap.get("first_name");
//        System.out.println(firstname);

    }
}
