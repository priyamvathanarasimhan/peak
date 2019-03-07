Feature: Talk with us

Scenario: Contact details to talk
Given User is in homepage
And Tap on Talk With us 
When user enters "name" , "email" , "company" , "message" , "phonenumber" 
Then Success message should be displayed


