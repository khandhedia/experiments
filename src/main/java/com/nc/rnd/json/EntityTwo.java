package com.nc.rnd.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityTwo extends BaseEntity {

    @JsonProperty("name_2")
    private String name2;

    @JsonProperty("surname_2")
    private String surname2;

}
