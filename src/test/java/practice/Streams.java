package practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main( String[] args ) {

//        List<String> arrayList =  new ArrayList<>();


        List<String> al= Arrays.asList("banana", "apple","orange");
        List<String> al1 =  new ArrayList<>();
        for (String str: al) {
            al1.add(str+"-> fruit");
        }
    System.out.println("al is "+ al);
        System.out.println("al1 is "+al1);
    }
}
