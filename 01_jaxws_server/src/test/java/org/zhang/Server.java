package org.zhang;


import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.zhang.service.impl.HelloServiceImpl;

public class Server {

    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //设置服务地址
        factoryBean.setAddress("http://localhost:8080/ws/hello");
        //设置服务类
        factoryBean.setServiceBean(new HelloServiceImpl());
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        //发布服务
        factoryBean.create();
        System.out.println("发布服务成功，端口8080");
    }
}
