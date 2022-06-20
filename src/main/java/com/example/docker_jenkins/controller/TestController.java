package com.example.docker_jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hfl
 * @date 2022-06-20
 */
@RestController
@RequestMapping("/dj")
public class TestController {
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
}
