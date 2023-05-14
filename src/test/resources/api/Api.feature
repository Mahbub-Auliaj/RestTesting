Feature: user
  As an User
  I want to list of post
  so that I can get a post

  Scenario: POST As admin I have be able to login
    Given I set POST login api endpoints
    When I send POST login HTTP request
    Then I receive valid HTTP response code 200 13
    And I receive valid post data for login user
