package com.j.mybootdemo.controller;


import com.j.mybootdemo.models.Dbsettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Annotations {

    @Value("${my.test:Default hello world}")
    private String getHelloWorld;

    @Autowired
    private Dbsettings dbsettings;

    @RequestMapping("/hello")
    public String getGetHelloWorld() {
        return getHelloWorld;
    }

    @RequestMapping("/greet")
    public String getGreetings() {
        return dbsettings.getConnection();
    }


}
