package com.vilauweb.PlatformSh.config;

import com.vilauweb.PlatformSh.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    public Test test;

    @Autowired
    public void MyController(Test test) {
        this.test = test;
    }

    @GetMapping("/")
    public void doNothing() {
        System.out.println("Called!");
        test.toString();
    }



}
