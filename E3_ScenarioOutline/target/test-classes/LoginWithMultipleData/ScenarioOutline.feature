@Login
Feature: validate the login feature

@validLogin
Scenario Outline: validate the login feature with valid credential

#Note: for scenario outline we should use this symbol "< >"

Given check Browser as "<Browser>"
When enter the url as "<URL>"
And click the login button
Then verify login page successfully opened
When enter the username as "<USERNAME>"
Then enter the password as "<PASSWORD>"
And click the login button
And validate the homepage loaded successfully

#Note: Don't forget this " Examples: " when we use Scenario Outline.

Examples:
			|Browser|     URL      |USERNAME|PASSWORD|
			|chrome |www.django.com| sadhan | 12345  |
			|firefox|www.django.com| sadhan1| 54321  |