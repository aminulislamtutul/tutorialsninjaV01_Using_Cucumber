Feature: AccountRegistrationPage Feature
Description: This feature will test a account registration page functionality.

Scenario: User creates an account only with mandatory fields
Given User navigates to register account page
When User enters the details into below fields
|firstName			|Aminul 				|
|lastName			|Islam					|
|telephone			|12345678				|
|password			|test$					|
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an account with all fields
Given User navigates to register account page
When User enters the details into below fields
|firstName			|Aminul 				|
|lastName			|Islam					|
|telephone			|12345678				|
|password			|test$					|
And User selects Yes for newsletter
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully

Scenario: User creates an duplicate account
Given User navigates to register account page
When User enters the details into below fields with duplicate email
|firstName			|Aminul 				|
|lastName			|Islam					|
|email				|aminul1@gmail.com		|
|telephone			|12345678				|
|password			|test$					|
And User selects Yes for newsletter
And User selects privacy policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User navigates to register account page
When User dont enters any details into fields
And User clicks on Continue button
Then User should get proper warning message for every mandatory fields