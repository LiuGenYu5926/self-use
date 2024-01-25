package com.web.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class UserManagementApplication {
    private static String port;

    @Value("${server.port}")
    public void setPort(String port) {
        UserManagementApplication.port = port;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
        System.out.println("http://localhost:"+port+"/doc.html#/home");
    }

}
