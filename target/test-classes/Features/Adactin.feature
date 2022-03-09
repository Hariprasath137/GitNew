Feature: Verifing the Adactin login page 
Background:
Given User Launch the Adactin Web browser

Scenario Outline: Validation of Adactin login page

When User Enter the Valid "<username>" and "<password>" And Click login button
Then User verify the Login page Displayed

Examples:
|username|password|
|digitalindia|987654321|
