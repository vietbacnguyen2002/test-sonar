package bac.dev.se.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    int count = 1;
    @GetMapping
    public String test(){
        System.out.println("Hello world " + count);
        return  "Hello world " + count++;
    }
}
