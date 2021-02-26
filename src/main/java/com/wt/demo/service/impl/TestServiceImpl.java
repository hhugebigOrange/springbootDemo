package com.wt.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.wt.demo.entity.Test;
import com.wt.demo.dao.TestMapper;
import com.wt.demo.req.extend.TestReq;
import com.wt.demo.resp.extend.TestResp;
import com.wt.demo.service.TestService;
import com.wt.demo.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public TestResp getTest(TestReq testReq) {
        TestResp resp=new TestResp();
        PageHelper.startPage(testReq.getPageNo(),testReq.getPageSize());
        List<Test> lst = testMapper.getTest();
        int count = testMapper.getTestCount();
        resp.setList(lst);
        resp.setCount(count);
        resp.setCode(Constant.REQ_SUCCESS);
        return resp;
    }
}
