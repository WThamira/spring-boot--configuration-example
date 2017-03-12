package com.myconf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Greeter {
    @Value("${message.greeting}")
    String greeting;

    @RequestMapping(value = "/",produces = "application/json")
    public List<String> index(){
        List<String> env = Arrays.asList("message.greeting: " + greeting);
        return env;
    }

}