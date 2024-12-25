package com.example.atc.definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SpringBootDemoStepDefinitions{

  @Given("I send a request to the URL {string}")
  public void iSendARequest(String endpoint) throws Exception  {
      System.out.println("Cucumber Test");
  }

  @Then("the response will return {string}")
  public void extractResponse(String Expected ) {
    System.out.println("Cucumber Test");
  }
}