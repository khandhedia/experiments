package com.nc.jsonparse;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Data1
{

    @JsonProperty("resource_id")
    private String resourceId;

}