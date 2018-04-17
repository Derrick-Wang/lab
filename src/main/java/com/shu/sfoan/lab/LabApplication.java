package com.shu.sfoan.lab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication(scanBasePackages = {"com.shu.sfoan"})
@MapperScan(basePackages = {"com.shu.sfoan.dao.mapper"})
@ImportResource({"classpath*:spring-jdbc.xml"})
public class LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}

}
