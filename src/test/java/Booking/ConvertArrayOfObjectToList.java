package Booking;

import io.restassured.RestAssured;

import java.util.List;
import java.util.Map;

public class ConvertArrayOfObjectToList {
    public static void main( String[] args ) {
        List<Object> list = RestAssured.given()
                .log().all()
                .get("https://run.mocky.io/v3/9db67926-25d2-43ed-ab7a-8124ee16b6e8")
                .as(List.class);

        System.out.println("size is "+ list.size());

        list.forEach(l1-> System.out.println(l1));

        Map<String, Object> hmap = (Map<String, Object>) list.get(0);

        for(int i=0; i<list.size();i++) {
            Map<String, Object> obj = (Map<String, Object>)list.get(i);
            System.out.println(obj.get("first_name"));
        }
     }
}
