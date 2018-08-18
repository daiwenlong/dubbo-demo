package com.dwl;

/**
 * @program: dubbo-demo
 * @description: 测试
 * @author: daiwenlong
 * @create: 2018-08-18 19:31
 **/
public class DubboServiceImpl implements DubboService {
    public String getMessage(String msg) {
        return "receive your call:"+msg;
    }
}


