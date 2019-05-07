package com.cj.springbootbootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cj.springbootbootstrap.dao")
public class SpringbootBootstrapApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootBootstrapApplication.class, args);
  }
}
