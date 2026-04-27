package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${APP_NAME:Default App}")
    private String appName;

    @Value("${ENVIRONMENT:local}")
    private String env;

    @Value("${WELCOME_MESSAGE:Hello}")
    private String msg;

    @GetMapping("/info")
    public String info() {
        return appName + " | " + env + " | " + msg;
    }
}
