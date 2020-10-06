package com.j.mybootdemo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SplunkLogGenerator {
    private static final Log LOGGER = LogFactory.getLog(SplunkLogGenerator.class);

    @GetMapping("/log")
    public String getPutGreetings() {
        LOGGER.info(" log end point called");
        return "Good call " + HttpStatus.OK;
    }

}
