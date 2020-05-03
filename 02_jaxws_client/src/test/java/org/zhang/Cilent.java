package org.zhang;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.zhang.service.HelloService;

public class Cilent {
    public static void main(String[] args) {
        //获取接口访问地址
        //创建cxf代理工厂
        JaxWsProxyFactoryBean proxyFactoryBean = new JaxWsProxyFactoryBean();
        //设置远程访问服务器地址
        proxyFactoryBean.setAddress("http://localhost:8080/ws/hello");

        //设置接口类型
        proxyFactoryBean.setServiceClass(HelloService.class);
        //对接口生成代理对象
        HelloService service = proxyFactoryBean.create(HelloService.class);
        System.out.println(service.getClass());

        //远程访问服务端方法
        String sayHello = service.sayHello("sayHello");
        System.out.println(sayHello);
    }

}
