package com.nc.jsonparse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class Response1
{

    @JsonProperty("data")
    private List<Data> data;




}
			
			