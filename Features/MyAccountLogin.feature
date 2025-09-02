Feature: MyAccountLogin Feature
Description: This feature will test a login functionality.

Scenario: Login with valid credentials
Given User navigated to login page
When User enters valid email address "aminulislam.mywork@gmail.com" into email fields
And User has enters valid password "admin123" into password fields
And User clicks on Login button
Then User should get successfully logged in

Scenario: Login with invalid credentials
Given User navigated to login page
When User enters invalid email address "test1234@gmail.com" into email fields
And User enters invalid password "demo1234" into passsword fields
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password 
Given User navigated to login page
When User enters valid email address "aminulislam.mywork@gmail.com" into email fields 
And User enters invalid password "demo1234" into password fields
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password
Given User navigated to login page
When User enters invalid email address "test1234@gmail.com" into email fields 
And User enters valid password "admin123" into password fields
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login without providing any credentails
Given User navigated to login page
When User dont enter email address into email fields
And User dont enter password into password fields
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch
