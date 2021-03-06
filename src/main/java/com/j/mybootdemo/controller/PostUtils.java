package com.j.mybootdemo.controller;

import com.j.mybootdemo.models.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostUtils {

    @PostMapping("/putgreet")
    @ResponseBody
    public String getPutGreetings(@RequestBody String msg){
        return msg+" Put is called";
    }

    @PostMapping("/student")
    @ResponseBody
    public String getPutGreetings(@RequestBody Student msg){
        return msg + " Student is called ";
    }

}
