package com.example.controller;

import com.example.entity.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@GetMapping("/demo")
public Demo getDemo(){
    Demo demo=new Demo();
    demo.setId(1);
    demo.setName("rahul");
    demo.setCompany("wipro");
    return demo;
}
}
