package com.wt.demo.service;

import com.wt.demo.entity.Test;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface TestService {

    List<Test> getTest();

}
