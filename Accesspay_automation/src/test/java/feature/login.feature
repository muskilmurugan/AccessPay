Feature: Login into Web Application automationpractice.com-sucessfully

@UserStory-1
Scenario: As an user, I whould able to login into automationpractice application
Given Initialize the browser
Given Navigate to "http://automationpractice.com" Site
When Click on Sign link in home page to land on Secure sign in Page
When User enters "muskilmurugan@gmail.com" and "London123" and login
Then User should sucessfully login into the system