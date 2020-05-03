package org.example;

import com.zhang.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class SpringClient {
    @Test
    public void test1(){
        User user = new User();
        user.setId(12);
        user.setCity("郑州");
        Response post = WebClient.create("http://localhost:8080/ws/service/userService/user")
                .accept(MediaType.APPLICATION_JSON)
                .post(user);
        System.out.println(post);

    }
}
