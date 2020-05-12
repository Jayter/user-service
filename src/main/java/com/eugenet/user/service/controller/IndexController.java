package com.eugenet.user.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Value("${user-service.tenant}")
    private String tenant;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("tenant", tenant);
        return "index";
    }
}
