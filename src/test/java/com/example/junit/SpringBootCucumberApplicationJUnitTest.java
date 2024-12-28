package com.example.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("Junit")
public class SpringBootCucumberApplicationJUnitTest {

	@Test
	void contextLoads() {
	  System.out.println("JUnit Test");
	}

}