package com.sevolutivo.demo.cucumber;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import io.cucumber.spring.CucumberContextConfiguration;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/sevolutivo/demo/cucumber/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.sevolutivo.demo.cucumber.stepDefs")
@CucumberContextConfiguration
@SpringBootTest
public class CucumberTest {
}
