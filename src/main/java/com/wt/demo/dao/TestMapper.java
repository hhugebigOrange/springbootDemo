package com.wt.demo.dao;

import com.wt.demo.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TestMapper {

    List<Test> getTest();

    int getTestCount();

}
