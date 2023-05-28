package Booking;

import io.restassured.RestAssured;

import java.util.List;
import java.util.Map;

public class Deserialization {
    public static void main( String[] args ) {

//        Map as = RestAssured.get("https://run.mocky.io/v3/9db67926-25d2-43ed-ab7a-8124ee16b6e8")
//                .as(Map.class);
        List<Object> as = RestAssured.get("https://run.mocky.io/v3/9db67926-25d2-43ed-ab7a-8124ee16b6e8")
                .as(List.class);
        System.out.println(as);
    }
}
