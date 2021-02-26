package com.wt.demo.controller;

import com.wt.demo.entity.Test;
import com.wt.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BaseController {

    @Autowired
    private TestService testService;

    @RequestMapping("/getTest")
    public List<Test> getTest() {
        return testService.getTest();
    }
}
