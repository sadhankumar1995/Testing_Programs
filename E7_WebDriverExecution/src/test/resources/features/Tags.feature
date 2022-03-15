# SEE: Package Explorer (Left Side) Under src/test/resources ---> if we created package file also. that will take as a Folder file.

@Login
Feature: validate the login feature

@validLogin
Scenario: validate the login feature with valid credential

Given check Browser as "chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "sadhan"
Then enter the password as "sadhan@12345"
And click the login button
And validate the homepage loaded successfully