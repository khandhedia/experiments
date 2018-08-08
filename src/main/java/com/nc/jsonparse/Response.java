package com.nc.jsonparse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class Response
{

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("resource_type_id")
    private String resourceTypeId;

    @JsonProperty("fail_count")
    private Integer failCount;

    @JsonProperty("success_count")
    private Integer successCount;

    @JsonProperty("data")
    private List<Data> data;




}
			
			