# SEE: Package Explorer (Left Side) Under src/test/resources ---> if we created package file also. that will take as a Folder file.

@Login
Feature: validate the login feature

@validLogin @admin
Scenario: validate the login feature with valid credential

Given check Browser as "chrome1"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login button
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "12345"
And click the login button
And validate the homepage loaded successfully

@validLogin
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome2"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login button
Then verify login page successfully opened
When enter the username as "sadhan1"
Then enter the password as "123456"
And click the login button
And validate the homepage loaded successfully

@invalidusername
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome3"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login button
Then verify login page successfully opened
When enter the username as "sadhan2"
Then enter the password as "123457"
And click the login button
And validate the homepage loaded successfully

@invalidpassword
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome4"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login button
Then verify login page successfully opened
When enter the username as "sadhan3"
Then enter the password as "123458"
And click the login button
And validate the homepage loaded successfully

@invalidusernameandpassword
Scenario: validate the login feature with invalid credential

Given check Browser as "chrome5"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login button
Then verify login page successfully opened
When enter the username as "sadhan4"
Then enter the password as "123459"
And click the login button
And validate the homepage loaded successfully