package com.example.mavendemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hi pylife! THIS is project proof , thanks!!!!";
    }

}
