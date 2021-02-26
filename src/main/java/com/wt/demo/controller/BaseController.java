package com.wt.demo.controller;

import com.wt.demo.req.extend.TestReq;
import com.wt.demo.resp.extend.TestResp;
import com.wt.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("BaseController相关的api")
public class BaseController {

    @Autowired
    private TestService testService;

    @PostMapping("/getTest")
    @ApiOperation(value = "测试", notes = "测试用")
    public TestResp getTest(@RequestBody TestReq testReq) {
        return testService.getTest(testReq);
    }
}
