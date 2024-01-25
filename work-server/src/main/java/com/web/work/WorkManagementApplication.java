package com.web.work;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WorkManagementApplication {
    private static String port;

    @Value("${server.port}")
    public void setPort(String port) {
        WorkManagementApplication.port = port;
    }

    public static void main(String[] args) {
        SpringApplication.run(WorkManagementApplication.class, args);
        System.out.println("http://localhost:"+port+"/doc.html#/home");
    }

}
