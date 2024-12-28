Feature: SpringBoot Request
@Registration
 # @ReceiveCorrectResponse
  Scenario Outline: Send a valid Request to get correct response

    Given I send a request to the URL "<url>"
   