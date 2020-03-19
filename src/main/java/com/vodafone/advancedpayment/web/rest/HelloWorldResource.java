package com.vodafone.advancedpayment.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/greeting")
public class HelloWorldResource {

    @GetMapping
    public String greeting() {
        return "Hello world";
    }
}
