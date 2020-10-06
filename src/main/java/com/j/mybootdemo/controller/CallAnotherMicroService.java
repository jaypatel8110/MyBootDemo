package com.j.mybootdemo.controller;

import com.j.mybootdemo.models.StudentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/micro")
public class CallAnotherMicroService {

    @Value("${Microservicetwo.port:Default 8086}")
    private String port;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/",produces = "application/json")
    public StudentList callMicroServiceTwo() {
        return restTemplate.getForObject("http://localhost:"+port+"/studentinfo/", StudentList.class);
    }
}
