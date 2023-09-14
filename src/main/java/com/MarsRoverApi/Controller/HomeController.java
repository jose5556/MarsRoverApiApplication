package com.MarsRoverApi.Controller;

import com.MarsRoverApi.Response.MarsRoverApiResponse;
import com.MarsRoverApi.Service.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@Autowired
private MarsRoverApiService roverApiService;

    @GetMapping("/")
    public String InitialHome(Model model) {
        MarsRoverApiResponse roverData = roverApiService.getRoverData();
        model.addAttribute("roverData", roverData);
        return "index";
    }

}
