@Login
Feature: validate the login feature

@validLogin
Scenario: validate the login feature with valid credential

Given check Browser as "chrome"
When enter the url as "http://djangovinoth.com"
And click the login button
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "KAAli@77"
And Click the login button
And validate the homepage loaded successfully

Scenario:

Scenario:

Scenario:

#Note: Under 1 Feature  we can able to add multiple Sceanrio 1, 2, 3...