Feature: Login into Guru99 Bank Application

Scenario Outline: Positive test validating login
Given Initialize the browser with Firefox
And Navigate to "http://demo.guru99.com/V4/" Site
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
And close browser

Examples:
|username			        |password	|
|mngr241660               	|hesypam	|

