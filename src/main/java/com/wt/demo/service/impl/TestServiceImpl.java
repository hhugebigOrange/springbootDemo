package com.wt.demo.service.impl;

import com.wt.demo.entity.Test;
import com.wt.demo.dao.TestMapper;
import com.wt.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> getTest() {
        return testMapper.getTest();
    }
}
