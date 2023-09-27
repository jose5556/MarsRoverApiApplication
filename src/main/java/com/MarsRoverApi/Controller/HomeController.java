package com.MarsRoverApi.Controller;

import com.MarsRoverApi.DTO.HomeDto;
import com.MarsRoverApi.Response.MarsRoverApiResponse;
import com.MarsRoverApi.Service.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
@Autowired
private MarsRoverApiService roverApiService;

    @GetMapping("/")
    public String getHomeView(Model model, HomeDto homeDto) {    //@RequestParam(required = false) String marsRoverApi, @RequestParam(required = false) Integer marsSol, @RequestParam(required = false
        if (homeDto.getMarsRoverApi() == null || homeDto.getMarsRoverApi().isEmpty())
            homeDto.setMarsRoverApi("opportunity");  // defines the opportunity for when the page is reloaded for the first time;
        if (homeDto.getMarsSol() == null) {
            homeDto.setMarsSol(1);
        }
        MarsRoverApiResponse roverData = roverApiService.getRoverData(homeDto.getMarsRoverApi(), homeDto.getMarsSol());
        model.addAttribute("roverData", roverData);
        model.addAttribute("homeDto", homeDto);
        return "index";
    }

}
