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

import java.io.IOException;

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

    public static void main(String[] args) {
        String batName = "E:\\xEDM\\Apache_ETL_01\\ETL_01.bat"; //该bat文件保存在项目目录下，所以无需写出完整路径，如果文件不在项目目录下则需要直接写出文件路径
        run_bat(batName);
    }


    public static void run_bat(String batName) {
        Process ps;
        try {
            ps = Runtime.getRuntime().exec(batName);
            ps.waitFor();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("finish");
    }

}
