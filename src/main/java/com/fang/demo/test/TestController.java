package com.fang.demo.test;

import com.fang.demo.strategy.WorkHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private WorkHelp workHelp;

    @GetMapping("/test/{str}")
    public String get(@PathVariable String str, @RequestParam("number") int number){
        return workHelp.work(str, number);
    }
}
