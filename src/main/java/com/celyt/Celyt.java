package com.celyt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Celyt {
	public static void main(String[] args){
		SpringApplication.run(Celyt.class, args);
	}
}
