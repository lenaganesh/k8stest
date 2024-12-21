package com.example.atc.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.example")
//@SelectDirectories("src/test/java/com/example") : Not working invalid char <:> at index 4
//@CucumberOptions(features="src/test/java/com/example/definitions") : Not Working
@SelectClasspathResource("/features")
//@SelectClasspathResource("src/test/java/com/example/definitions")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.atc.definitions")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")

public class SpringRunnerTest {
}
