package org.zhang;

import com.zhang.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringClient {

    @Resource
    private HelloService helloService;
    @Test
    public void test1(){
        System.out.println(helloService.getClass());
        System.out.println(helloService.sayHello("hello"));

    }

}
