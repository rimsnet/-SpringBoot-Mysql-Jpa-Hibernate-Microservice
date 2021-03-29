package com.rimsnet.springboot.jpa.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.rimsnet.springboot.jpa.repo" })
@ComponentScan(value = "com.rimsnet.springboot.jpa.*")
@EntityScan(basePackages = { "com.rimsnet.springboot.jpa.entities" })
public class SpringBootMysqlJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlJpaHibernateApplication.class, args);
	}

	
	@Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.rimsnet.springboot.jpa.controller"))
                .build();
    }
}
