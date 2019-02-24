@newtours
Feature: NewTour Login Test

Scenario: NewTour Login Functionality

		Given Goto http://newtours.demoaut.com/ (Links to an external site.)Links to an external site. and verify title(use variable store url)
		And Verify that displayed date is correct
		And Click on register link
		And Create an account by filling out each field then click on submit
		And On confirmation page verify label “Note: Your user name is ” ends with username that you entered on registration page
		And Click on sign-in link
		And Verify that username, password input fields and submit button are displayed
		When Enter username and password that you entered on registration page
		Then Verify successful login by checking the title
		And Logout then close browser