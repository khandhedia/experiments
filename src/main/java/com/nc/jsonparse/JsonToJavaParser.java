package com.nc.jsonparse;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

public class JsonToJavaParser {

    public static void main(String[] args) throws IOException {

        String payload = "{\n" +
//                " \"account_id\":\"56D1D801-5208-11CB-9D22-B08FB7D17C78\",\n" +
//                " \"resource_type_id\":\"cwa_iam_users\",\n" +
                " \"success_count\":1,\n" +
                " \"fail_count\":1,\n" +
                " \"data\":[\n" +
                " {\n" +
                " \"resource_id\":\"arn:aws:iam::189795607571-2016-03-22T16:59:24+00:00\",\n" +
                " \"status\":\"FAIL\",\n" +
                " \"message\":\"400 Bad Request: ....\"\n" +
                " },\n" +
                "{\n" +
                " \"resource_id\":\"arn:aws:iam::189795607571-2016-03-22T16:59:24+00:00\",\n" +
                " \"status\":\"SUCCESS\",\n" +
                " \"message\":\"Successful\"\n" +
                " }\n" +
                "\n" +
                " ]\n" +
                "\n" +
                "}\n";

        String payload1="[  \n" +
                "   {  \n" +
                "      \"resource_id\":\"arn:aws:iam::189795607571-2016-03-22T16:59:24+00:00\"\n" +
                "   },\n" +
                "   {  \n" +
                "      \"resource_id\":\"arn:aws:iam::189795607571-2016-03-22T16:59:24+00:00\"\n" +
                "   }\n" +
                "]";

        ObjectMapper objectMapper = new ObjectMapper();
        //Response response = objectMapper.readValue(payload1, Response.class);
        List<Data1> response = objectMapper.readValue(payload1, objectMapper.getTypeFactory().constructCollectionType(
                List.class, Data1.class));


        Data1 data1 = objectMapper.readValue(payload1, Data1.class);

        response.stream().forEachOrdered(System.out::println);
        System.out.println(response);

        objectMapper.enable(INDENT_OUTPUT);
        System.out.println(objectMapper.writeValueAsString(response));


        Map<String, Object> map2 = new LinkedHashMap<>();
        map2.put("A", "A");
        map2.put("B", Arrays.asList("1", Boolean.TRUE, new String("chaman")));

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("A", "A");
        map.put("B", Arrays.asList("1", Boolean.TRUE, new String("chaman"), map2, response));


        String s = objectMapper.writeValueAsString(map);

        System.out.println(s);

    }
}
