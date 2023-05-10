Feature: user
  As an User
  I want to list of post
  so that I can get a post
  Scenario: GET As admin I have be able to get all product
    Given I set GET all product api endpoints
    When I send GET all product HTTP request
    Then I receive valid HTTP response code 200 1
    And I receive valid get data for all product

  Scenario: POST As admin I have be able to create new product
    Given I set POST new product api endpoints
    When I send POST new product HTTP request
    Then I receive valid HTTP response code 200 2
    And I receive valid post data for new product

  Scenario: GET As admin I have be able to get product by id
    Given I set GET product by id api endpoints
    When I send GET product by id HTTP request
    Then I receive valid HTTP response code 200 3
    And I receive valid get data for single product

  Scenario: DELETE As admin i want to delete product
    Given I set DELETE product api endpoint
    When I send DELETE product HTTP request
    Then I receive valid HTTP response code 200 4

  Scenario: POST As admin I have be able to assign product rating
    Given I set POST product rating api endpoints
    When I send POST product rating HTTP request
    Then I receive valid HTTP response code 200 5
    And I receive valid post data for product rating

  Scenario: GET As admin I have be able to get product rating
    Given I set GET product rating api endpoints
    When I send GET product rating HTTP request
    Then I receive valid HTTP response code 200 6
    And I receive valid get rating data for product

  Scenario: POST As admin I have be able to post comment product
    Given I set POST comment api endpoints
    When I send POST comment HTTP request
    Then I receive valid HTTP response code 200 7
    And I receive valid post data for product comment

  Scenario: GET As admin I have be able to get product comment
    Given I set GET comment api endpoints
    When I send GET comment HTTP request
    Then I receive valid HTTP response code 200 8
    And I receive valid get data for product comment

  Scenario: POST As admin I have be able to make product category
    Given I set POST category api endpoints
    When I send POST category HTTP request
    Then I receive valid HTTP response code 200 9
    And I receive valid post data for new product category

  Scenario: GET As admin I have be able to get product category
    Given I set GET category api endpoints
    When I send GET category HTTP request
    Then I receive valid HTTP response code 200 10
    And I receive valid get data for product category

  Scenario: DELETE As admin i have be able to delete product category
    Given I set DELETE category api endpoint
    When I send DELETE category HTTP request
    Then I receive valid HTTP response code 200 11

  Scenario: POST As admin I have be able to register
    Given I set POST register api endpoints
    When I send POST register HTTP request
    Then I receive valid HTTP response code 200 12
    And I receive valid post data for new user

  Scenario: POST As admin I have be able to login
    Given I set POST login api endpoints
    When I send POST login HTTP request
    Then I receive valid HTTP response code 200 13
    And I receive valid post data for login user

  Scenario: GET As admin I have be able to get user information
    Given I set GET user info api endpoints
    When I send GET user info HTTP request
    Then I receive valid HTTP response code 200 14
    And I receive valid get data for user information

  Scenario: GET As admin I have be able to get orders
    Given I set GET order api endpoints
    When I send GET order HTTP request
    Then I receive valid HTTP response code 200 16
    And I receive valid get data for order