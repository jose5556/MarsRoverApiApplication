package com.MarsRoverApi.Controller;

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
    public String getHomeView(Model model, @RequestParam(required = false) String marsRoverApi,
                              @RequestParam(required = false) Integer marsSol) {
        if (marsRoverApi == null || marsRoverApi.isEmpty()) {
            marsRoverApi = "opportunity"; // defines the opportunity for when the page is reloaded for the first time;
        }
        if (marsSol == null) {
            marsSol = 1;
        }
        MarsRoverApiResponse roverData = roverApiService.getRoverData(marsRoverApi, marsSol);
        model.addAttribute("roverData", roverData);
        return "index";
    }


}
