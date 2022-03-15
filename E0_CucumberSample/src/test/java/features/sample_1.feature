#Author: sadhan from vcentry kjbjbhvlhvl

#Keywords Summary : utouy[oi[ufvpyfvpiuv[pupvivbiuvi

@tag
Feature: validate the login page

  @tag1
  Scenario: we are going to validate the login page by using valid credential
    Given Frist check the url # precondition
    And   Click the login link
    When  Validate whether login page loaded successfully or not
    And   Enter username
    And   Enter  password
    Then  Clicklogin button
    And   Verify whether home page loaded successfully or not