Feature: Ecommerce
Scenario: To add city
Given User Launch Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin"
And User enters Username as "email" and Password as "password"
Then User clicking on Login button
Then User clicking on Locations button
Then User clincking on City button
Then User clicking on Add City button 
And Enters City name as "City"
And User clicking on Add button 
Then User clicking on Logout button