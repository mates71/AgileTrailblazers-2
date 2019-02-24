@demosite
Feature: The Demo Site future

Scenario:

		Given Goto http://thedemosite.co.uk/index.php
		And Click on Add a User link on the top
		When Enter some username and password then click on save
		And Click on Login link
		When Enter Username and password that you created on previous page then click test login
		Then Verify **Successful Login** message is displayed
		And Close the browser