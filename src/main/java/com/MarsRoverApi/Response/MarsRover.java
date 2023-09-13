package com.MarsRoverApi.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarsRover {

    private Long id;
    private String name;
    @JsonProperty("landing_date")
    private String landingDate;
    @JsonProperty("launch_date")
    private String launchDate;
    private String status;
    private Long max_sol;
    @JsonProperty("max_date")
    private String maxDate;
    @JsonProperty("total_photos")
    private Long totalPhotos;
}
