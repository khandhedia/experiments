package com.nc.rnd;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToCommaSeparatedString
{
    private static String getAttributesListCommaSeparated(List<BigInteger> attributesList)
    {
        List<String> stringList = attributesList.stream().map(bigInteger -> bigInteger.toString()).collect(Collectors.toList());
        return String.join(",", stringList);

    }

    public static void main(String[] args)
    {
        System.out.println(getAttributesListCommaSeparated(Arrays.asList(BigInteger.valueOf(1234), BigInteger.valueOf(5678))));
    }
}
