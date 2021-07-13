Feature: Order woman cloth and complete checkout sucessfully

Scenario: As an user, I should able to Order items from Women category & make the payment
Given Initialize the browser
Given Navigate to "http://automationpractice.com" Site
When Click on Sign link in home page to land on Secure sign in Page
When User enters "muskilmurugan@gmail.com" and "London123" and login
And Click on the woman category menu
Then All products should be displayed
Then Select anyone of the product
And Add the product into cart for check 
And Proceed further action to checkout the item
Then Product should be checked out and ordered 
Then sign out and close the browser