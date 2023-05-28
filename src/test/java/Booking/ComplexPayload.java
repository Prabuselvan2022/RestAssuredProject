package Booking;

import java.util.*;

public class ComplexPayload {
    public static void main( String[] args ) {

        List<Map<String, Object>> finalPayload = new ArrayList<Map<String, Object>>();

        Map<String, Object> firstJsonObj = new LinkedHashMap<>();
        firstJsonObj.put("id", 1);
        firstJsonObj.put("first_name", "Prabu");
        firstJsonObj.put("last_name", "Selvan");
        firstJsonObj.put("email", "prabu.selvan@gmail.com");
        firstJsonObj.put("gender", "Male");

//        List<String> mobilenum= new LinkedList<>();
//        mobilenum.add("23423435353");
//        mobilenum.add("23423435353");

        List<String> mobileNo1 = Arrays.asList("23423435353", "23423435353");

        firstJsonObj.put("mobile", mobileNo1);

        Map<String, Object> skillSet1 = new LinkedHashMap<>();
        skillSet1.put("name", "Testing");
        skillSet1.put("proficiency", "Medium");
        firstJsonObj.put("skills", skillSet1);
        finalPayload.add(firstJsonObj);
//        System.out.println(finalPayload.toString());

//        List<Map<String, Object>> finalPayload = new ArrayList<Map<String, Object>>();

        Map<String, Object> secondJsonObj = new LinkedHashMap<>();
        secondJsonObj.put("id", 2);
        secondJsonObj.put("first_name", "Linga");
        secondJsonObj.put("last_name", "Prabu");
        secondJsonObj.put("email", "prabu.selvan@gmail.com");
        secondJsonObj.put("gender", "Male");
        List<Map<String, Object>> skillList = new LinkedList<Map<String, Object>>();

        Map<String, Object> skillMap = new HashMap<String, Object>();
        skillMap.put("name", "Testing");
        skillMap.put("proficiency", "Medium");
        List<String> allcert = Arrays.asList("OCJP 11", "OCJP 12");
        skillMap.put("certifications", allcert);
        skillList.add(skillMap);
        secondJsonObj.put("skills",skillList);

        finalPayload.add(secondJsonObj);

        System.out.println(finalPayload.toString());

    }
}
