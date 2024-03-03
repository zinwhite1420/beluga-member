package com.beluga.bember.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MainController {
    private final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/")
    public String mainP() {

        return "main Controller";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "health";
    }
}
