package com.wt.demo.resp;

import lombok.Data;

import java.util.List;

@Data
public class BaseResp {

    int count;

    int code;

    List<?> list;

}
