package com.example.awsdeploytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AWSController_test {
    @GetMapping("hello")
    public String hello() {return "hello AWS - GET !!";}
    @PostMapping ("/hello/post")
    public String helloPost() {return "hello AWS - POST0 !!";}

}
