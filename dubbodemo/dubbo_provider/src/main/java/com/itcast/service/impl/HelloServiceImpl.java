package com.itcast.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itcast.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class)//因为事务后cglib产生的代理对象需要的接口不是helloService，需要指定interfaceClass
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
