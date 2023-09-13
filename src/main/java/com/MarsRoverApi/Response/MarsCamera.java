package com.MarsRoverApi.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarsCamera {

    private Long id;
    private String name;
    @JsonProperty("rover_id")
    private Long roverId;
    @JsonProperty("full_name")
    private String fullName;

    @Override
    public String toString() {
        return "MarsCamara{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roverId=" + roverId +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
