package com.itmk.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //自动生成get和set方法 不然要用generater来生成
@AllArgsConstructor
public class ResultVo<T> {
    private String msg;
    private int code;
    private T data;
}
