Feature: Ecommerce
Scenario: To add country
Given User Launches Chrome browser
When User open an URL "https://xlogist.pisystindia.com/admin/login"
And User enter Username as "username" and Password as "password"
Then User clicks on Login button
Then User clicks on Locations button
Then User clicks on Country button
Then User clicks on Add Country button 
And Enter Country name as "Country"
And User clicks on Add button 
Then User clicks on Logout button