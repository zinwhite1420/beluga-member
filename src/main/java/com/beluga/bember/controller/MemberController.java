package com.beluga.bember.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    private final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);

    @GetMapping("/test")
    public String memberTest(String value) {
        LOGGER.info("test의 value 값은 " + value);
        return value;
    }
}
