package com.MarsRoverApi.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarsPhotos {

    private Long id;
    private Integer sol;
    private MarsCamera camera;
    @JsonProperty("img_src")
    private String imgSrc;
    @JsonProperty("earth_date")
    private String earthDate;
    private MarsRover rover;

    @Override
    public String toString() {
        return "MarsPhotos{" +
                "id=" + id +
                ", sol=" + sol +
                ", camera=" + camera +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }


}
