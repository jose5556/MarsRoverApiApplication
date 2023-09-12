package com.MarsRoverApi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String InitialHome(Model model) {
        model.addAttribute("name", "josePage");
        return "index";
    }

}
