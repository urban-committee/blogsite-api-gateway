package com.blogs.blogsiteapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BlogsiteApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogsiteApiGatewayApplication.class, args);
    }

}
