package org.example;

import com.zhang.service.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.OutgoingChainInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class RsServer {
    public static void main(String[] args) {
        JAXRSServerFactoryBean serverFactoryBean = new JAXRSServerFactoryBean();
        serverFactoryBean.setAddress("http://localhost:8080/ws/hellors");
        serverFactoryBean.setServiceBean(new UserServiceImpl());

        serverFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        serverFactoryBean.getOutInterceptors().add(new OutgoingChainInterceptor());
        serverFactoryBean.create();
        System.out.println("rs发布成功");


    }

}
