package com.MarsRoverApi.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeDto {

    private String marsRoverApi;
    private Integer marsSol;
    private Boolean cameraFhaz;
    private Boolean cameraRhaz;
    private Boolean cameraMast;
    private Boolean cameraChemcam;
    private Boolean cameraMahli;
    private Boolean cameraMardi;
    private Boolean cameraNavcam;
    private Boolean cameraPancam;
    private Boolean cameraMinites;

}
