@Login
Feature: validate the login feature

@validLogin
Scenario: validate the login feature with valid credential

Given check Browser is opened
When enter the url
Then click the login
And verify the login page successfully opened
When enter the username
Then enter the password
And click the login button
And validate the home page loaded successfully