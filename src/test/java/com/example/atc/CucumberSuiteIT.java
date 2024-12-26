package com.example.atc;


import static io.cucumber.core.options.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestContext;
import io.cucumber.java.Before;
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")

@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.atc")

@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,  value="pretty, json:target/cucumber-2.json")//"${plugin_property_name}"): tried this not working
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "not @Skip")


public class CucumberSuiteIT {

  @Before
  public void after() {
    //System.out.println("testContext:"+testContext);
    //testContext.
    System.out.println("Before ");
  }
}
