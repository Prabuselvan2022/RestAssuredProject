package Booking;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedJSONObject {
    public static void main( String[] args ) {

        Map<String,Object> hmap = new LinkedHashMap<>();
        hmap.put("id","1");
        hmap.put("first_name","Prabu");
        hmap.put("last_name","Selvan");
        hmap.put("married","True");
        hmap.put("salary","123.56");

        Map<String ,Object> addressMap = new LinkedHashMap<>();
        addressMap.put("no", "#212");
        addressMap.put("streetname", "Vivekandhar main road Dubai kurukku santhu");
        addressMap.put("city", "Dubai");


        addressMap.put("state", "Dubai");

        hmap.put("address", addressMap);

        System.out.println("hmap is "+hmap.toString());

    }
}
