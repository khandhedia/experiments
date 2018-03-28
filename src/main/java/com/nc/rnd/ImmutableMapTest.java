package com.nc.rnd;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

public class ImmutableMapTest {

  public static void main(String[] args) {
    Map<String, Object> filter = ImmutableMap.of(
        "operation", Arrays.asList("SCALE", "HEAL", "DEACTIVATE_VNFC_IN_GRAPH"),
        "operationState", Arrays.asList("PROCESSING", "COMPLETED", "FAILED", "ROLLED_BACK"));

  }
}
