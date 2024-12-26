package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties(){
	    PropertySourcesPlaceholderConfigurer pspc
	      = new PropertySourcesPlaceholderConfigurer();
	    Resource[] resources = new ClassPathResource[ ]
	      { new ClassPathResource( "foo.properties" ) };
	    pspc.setLocations( resources );
	    pspc.setIgnoreUnresolvablePlaceholders( true );
	    return pspc;
	}
}
