package com.wpy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@SpringBootApplication
@ImportResource({ "classpath:application-context.xml" })
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
