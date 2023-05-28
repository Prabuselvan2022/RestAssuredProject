package Booking;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ArrayOfObjects {
    public static void main( String[] args ) {

        Map<String, Object> hmap1= new LinkedHashMap<>();
        hmap1.put("id","1");
        hmap1.put("first_name","Natty");
        hmap1.put("last_name","Bodega");
        hmap1.put("email","nbodega0@photobucket.com");
        hmap1.put("gender","Female");

        Map<String, Object> hmap2= new LinkedHashMap<>();
        hmap2.put("id","2");
        hmap2.put("first_name","Caddric");
        hmap2.put("last_name","Greenough");
        hmap2.put("email","cgreenough1@hud.gov");
        hmap1.put("gender","Male");

        List<Object> alist = new LinkedList<>();
        alist.add(hmap1);
        alist.add(hmap2);

    }
}
