# SEE: Package Explorer (Left Side) Under src/test/resources ---> if we created package file also. that will take as a Folder file.

Feature: verify the product purchase

@product
Scenario Outline: validating the list of product

#Note: This symbol required for "< >" values in Scenario outline
  
Given check Browser as "<Browser>"
When enter the url as "<URL>"
And click the login link
Then verify login page successfully opened
When enter the username as "<USERNAME>"
Then enter the password as "<PASSWORD>"
And click the login button
And click the Framework forms
And click the simple form
When add product list

# 		0         1        2           3      				4    		5						Index values
|productname|mobile|   email   |productcategory|quantity| purchaser |  
| product a |111111|1@gmail.com|  Electrical   |   5    | person a  |
| product b |222222|2@gmail.com|  Electrical   |  10    | person b  |
| product c |333333|3@gmail.com|  Electrical   |  15    | person c  |
| product d |444444|4@gmail.com|  Electrical   |  20    | person d  |
| product e |555555|5@gmail.com|  Electrical   |  25    | person e  |

Examples:

		| BROWSER |                      URL                       | USERNAME| PASSWORD |
		| chrome  | https://djangovinoth.pythonanywhere.com/login/ | sadhan  | KAAli@77 |
		| firefox | https://djangovinoth.pythonanywhere.com/login/ | sadhan  | KAAli@77 |
