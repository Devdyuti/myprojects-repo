package org.tutorial.jpa.tuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="org.tutorial.jpa.tuto.repository")
@SpringBootApplication
// @ImportResource("classpath:config/applicationContext.xml")
@ComponentScan("org.tutorial.jpa.tuto")
public class SpringBootJpaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
}
