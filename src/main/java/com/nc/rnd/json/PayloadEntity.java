package com.nc.rnd.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PayloadEntity {

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("resource_type")
    private String resourceType;

    @JsonProperty("data")
    private List<BaseEntity> entities;
}
