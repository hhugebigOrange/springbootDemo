package com.wt.demo.dao;

import com.wt.demo.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {

    List<Test> getTest();

    int getTestCount();

}
