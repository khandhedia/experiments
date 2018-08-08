package com.nc.rnd.regex;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public class MDRUtils {

    private static final String N_A = "N/A";
    private static final String NO_INFORMATION = "no_information";
    private static List<String> invalidDateValues = asList(N_A, NO_INFORMATION);

    public static final String REGEX_INT = "\\d+";
    public static final String GLOBAL_REGION = "global";

    private static final String TRUE = "true";
    private static final String FALSE = "false";
    private static List<String> validBooleans = asList(TRUE, FALSE);

    public static boolean isDateValid(String dateValue)
    {
        return invalidDateValues.parallelStream().noneMatch(invalidDateValue -> equalsIgnoreCase(dateValue, invalidDateValue));
    }

    public static boolean isBooleanValid(String booleanValue)
    {
        return validBooleans.parallelStream().anyMatch(value -> equalsIgnoreCase(booleanValue, value));
    }

    public static boolean isIntegerValid(String intValue)
    {
        return intValue.matches(REGEX_INT);
    }

    public static void putInJsonObject(Map jsonObject, String key, Object value, Class valueClazz) {
        if (null != value && null != key && null != valueClazz && null != jsonObject) {
            if (valueClazz == Date.class) {
                if (isDateValid(value.toString()))
                    jsonObject.put(key, value);
            } else if (valueClazz == Boolean.class) {
                if (isBooleanValid(value.toString()))
                    jsonObject.put(key, parseBoolean(value.toString()));
            } else if (valueClazz == Integer.class) {
                if (isIntegerValid(value.toString()))
                    jsonObject.put(key, parseInt(value.toString()));
            } else {
                jsonObject.put(key, value);
            }
        }
    }

    public static void main(String[] args) {

        Map<String, Object> map  = new TreeMap<>();
        putInJsonObject(map, "one", "1", Integer.class);
        putInJsonObject(map,  "two", "12/22/2024", Date.class);
        putInJsonObject(map, "three", "true", Boolean.class);
        putInJsonObject(map, "four", "four value", String.class);
        putInJsonObject(map, "five", true, Boolean.class);
        putInJsonObject(map, "six", Boolean.FALSE, Boolean.class);
        putInJsonObject(map, "seven", new Integer(5), Integer.class);
        putInJsonObject(map, "eight", null, Integer.class);
        putInJsonObject(map, "nine", null, String.class);

        map.keySet().stream().forEach(s -> System.out.println(s + " " + map.get(s)));
    }


}


