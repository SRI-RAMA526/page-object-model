Feature: To Login to the Flipkart Homepage

Scenario: Flipkart Login & Search Item

Given flipkart is already opened
When title of the page is flipkart
Then click on login button
Then enter the user login details
Then search the required item
Then click on search button
Then close on Browser

