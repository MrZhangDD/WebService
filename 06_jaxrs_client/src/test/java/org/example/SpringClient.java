package org.example;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import zhang.domain.User;

public class SpringClient {

    @Test
    public void test1(){
        User user = new User();
        user.setId(12);
        user.setCity("郑州");
        WebClient.create("http://localhost:8080/ws/hellors/userService/user").post(user);

    }
}
