package com.nc.rnd.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

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

        PayloadEntityNoJsonProperty payloadEntity = new PayloadEntityNoJsonProperty();
        payloadEntity.setAccountId("123");
        payloadEntity.setResourceType("resource_type");
        payloadEntity.setEntities(Arrays.asList(entity1, entity2));


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);


        String x = objectMapper.writeValueAsString(payloadEntity);
        System.out.println("Payload: " + x);

        Map<String, Object> map = new HashMap<>();
        map.put("account_id", "123");
        map.put("resource_type", "rt");
        map.put("list_object", Arrays.asList(entity1, entity2));


        try {
            String a = objectMapper.writeValueAsString(map);
            System.out.println("map_json\n" + a);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        String id = "/subscriptions/6bcc4190-5f36-4d8f-ae67-91edd41ad9d2/resourceGroups/DefaultResourceGroup-SEA/providers/Microsoft.Network/virtualNetworks/cwa-test-vnet-2";

        String subscriptionId = StringUtils.substringBetween(id, "/subscriptions/", "/");
        System.out.println("Subscription ID : " + subscriptionId);


//        System.out.println(s);
/*

        try {
            String a = x;
            System.out.println("znirav" + a);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/


    }
}
