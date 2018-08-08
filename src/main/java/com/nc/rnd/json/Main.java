package com.nc.rnd.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s = "arn:aws:cloudtrail:us-east-2:589945833670:trail/CloudtrailStack-cloudtrailpass-K7BFQXQ00A9Y";
        int one = StringUtils.ordinalIndexOf(s, ":", 3);
        int two = StringUtils.ordinalIndexOf(s, ":", 4);

        String s1 = StringUtils.substring(s, 0, one) + ":nirav" + StringUtils.substring(s, two, s.length());
        System.out.println("jalaram: " + s1);

        String[] strings = s.split(":");
        if(strings.length > 3)
            strings[4] = "nirav";

        Arrays.asList(strings).forEach(System.out::println);
//        int one = StringUtils.indexOf(s, ":", );
//        int two = StringUtils.indexOf(s, ":", 4);
//        String s1 = StringUtils.substring(s, 0, one) + ":nirav:" + StringUtils.substring(s, two, s.length());
//        System.out.println(s1);

/*        Gson gson = new GsonBuilder().create();
        String s = gson.toJson(new EntityOne("abc", "def"));*/

        BaseEntity entity1 = new EntityOne("1", "2");
        BaseEntity entity2 = null;

        PayloadEntity payloadEntity = new PayloadEntity();
        payloadEntity.setAccountId("123");
        payloadEntity.setResourceType("resource_type");
        payloadEntity.setEntities(Arrays.asList(entity1, entity2));

//        System.out.println(s);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            String a = objectMapper.writeValueAsString(payloadEntity);
            System.out.println(a);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
