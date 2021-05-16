package com.springboot_course.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeApp(Model model) {
        model.addAttribute("message", "this is the message injected with the model");
        return "index";
    }
}