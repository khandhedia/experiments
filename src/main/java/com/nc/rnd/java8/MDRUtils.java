package com.nc.rnd.java8;

import java.util.List;

import static java.util.Arrays.asList;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public class MDRUtils {

    public static final String N_A = "N/A";
    public static final String NO_INFORMATION = "no_information";
    
    private static List<String> invalidDateValues = asList(N_A, NO_INFORMATION);
    public static boolean isDateValid(String awsDate)
    {
        return invalidDateValues.parallelStream().noneMatch(s -> equalsIgnoreCase(awsDate, s));
    }

    public static void main(String[] args)
    {
        System.out.println(isDateValid("N/A"));
        System.out.println(isDateValid("no_Information"));
        System.out.println(isDateValid("1234"));
    }
    
}
