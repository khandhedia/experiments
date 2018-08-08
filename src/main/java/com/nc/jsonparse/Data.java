package com.nc.jsonparse;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Data
{
    @JsonProperty("message")
    private String message;

    @JsonProperty("resource_id")
    private String resourceId;

    @JsonProperty("status")
    private Status status;

}