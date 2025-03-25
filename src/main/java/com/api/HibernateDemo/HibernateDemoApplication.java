package com.api.HibernateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);

		/*
		* NOTE:
		* In the application.properties file we added new props that allow us to connect to the
		* database required on our mySql server, and the username details and password.
		*
		* reference resources/application.properties to check it out
		*/
	}

}
