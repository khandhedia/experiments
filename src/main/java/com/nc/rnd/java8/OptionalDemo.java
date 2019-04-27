package com.nc.rnd.java8;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {

    public static void main(String[] args) {

        String str = null;
        String string = Optional.ofNullable(str).orElse("string is null");
        System.out.println("string : "+ string);

        List<String> list = Arrays.asList("nirav", "mitul", null, "mittal");
        String data = list.stream().filter(s -> "nirav".equals(s)).findFirst().map(StringUtils::upperCase).orElse("no data");
        System.out.println("data : "+ data);


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("nirav", "niravval");
        hashMap.put("chaman", "chamanval");

        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap.put("nirav", "niravval");
        hashMap.put("chaman1", "chamanval1");

        List<Map<String, String>> list1 = Arrays.asList(hashMap, hashMap1);

        Map<String, String> first = list1.stream().filter(
                l1 ->
                        l1.get("nirav").equals("niravval")

        ).findFirst().orElse(null);

        System.out.println("{\n" +
                "        \"Version\": \"2012-10-17\",\n" +
                "        \"Statement\": [\n" +
                "          {\n" +
                "            \"Action\": \"sts:AssumeRole\",\n" +
                "            \"Principal\": {\n" +
                "              \"Service\": \"elastictranscoder.amazonaws.com\"\n" +
                "            },\n" +
                "            \"Effect\": \"Allow\",\n" +
                "            \"Sid\": \"\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }");


    }

}


