package com.MarsRoverApi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarsPhotos {

    private Long id;
    private Integer sol;
    private MarsCamara camara;
    private String imgSrc;
    private String earthDate;

}
