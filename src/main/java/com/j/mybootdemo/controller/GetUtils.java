package com.j.mybootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class GetUtils {

    Logger logger= LoggerFactory.getLogger(GetUtils.class);

    @GetMapping("/greeting")
    public String getPutGreetings(@RequestHeader("accept-language") String msg){
        logger.info(" /greetings called --> returned " + msg);
        return msg+ HttpStatus.OK;
    }

    @GetMapping("/test")
    public String getTestGreetings(){
        return "Good"+ HttpStatus.OK;
    }

     /*  ResponseEntity represents an HTTP response, including headers, body, and status. While @ResponseBody puts
        the return value into the body of the response,
    ResponseEntity also allows us to add headers and status code.*/
/*
    @GetMapping(value = "/getCountry")
    public ResponseEntity<Student> getStudentWithResponseEntity() {
        var c = new Student();
        c.setName("France");

        var headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        return ResponseEntity.accepted().headers(headers).body(c);
    }

    @GetMapping(value = "/getCountry2")
    @ResponseBody
    public Student getStudentWithResponseEntity2() {
        var c = new Student();
        c.setName("France");
        return c;
    }*/

}
