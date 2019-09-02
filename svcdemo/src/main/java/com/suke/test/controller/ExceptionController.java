package com.suke.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExceptionController {


    @Value("${spring.cloud.client.hostname:null}")
    private String hostname;

    @GetMapping("hostname")
    public String gethostname(){
        return hostname;
    }

}
