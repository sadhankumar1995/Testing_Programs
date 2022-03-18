# SEE: Package Explorer (Left Side) Under src/test/resources ---> if we created package file also. that will take as a Folder file.

@Login
Feature: validate the login feature

#Note: Background should come in @Login (1st tag inside Feature:)

Background: To run before all the scenario

Given verify network
And check excel data

@validLogin @admin
Scenario: validate the login feature with valid credential

Given check Browser as "chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "KAAli@77"
And click the login button
And validate the homepage loaded successfully

@validLogin
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "KAAli@66"
And click the login button
And validate the homepage loaded successfully

@invalidusername
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "KAAli@77"
And click the login button
And validate the homepage loaded successfully

@invalidpassword
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "KAAli@77"
And click the login button
And validate the homepage loaded successfully

@invalidusernameandpassword
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "KAAli@77"
And click the login button
And validate the homepage loaded successfully