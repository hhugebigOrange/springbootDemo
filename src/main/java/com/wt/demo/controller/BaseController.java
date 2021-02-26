package com.wt.demo.controller;

import com.wt.demo.entity.Test;
import com.wt.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Api("BaseController相关的api")
public class BaseController {

    @Autowired
    private TestService testService;

    @PostMapping("/getTest")
    @ApiOperation(value = "测试", notes = "测试用")
    public List<Test> getTest() {
        return testService.getTest();
    }
}
