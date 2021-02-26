package com.wt.demo.service;

import com.wt.demo.req.extend.TestReq;
import com.wt.demo.resp.extend.TestResp;
import org.springframework.stereotype.Service;

@Service
public interface TestService {

    TestResp getTest(TestReq testReq);

}
