package org.zhang.service.impl;

import org.zhang.service.HelloService;

public class HelloServiceImpl implements HelloService {

    /**
     * 对外发布服务的接口方法
     *
     * @param name
     */
    @Override
    public String sayHello(String name) {
        return name +":HelloService";
    }
}
