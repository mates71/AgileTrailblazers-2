@phpTravel
Feature: PHP Travel page

Scenario:

		Given Goto http://www.phptravels.net/ (Links to an external site.)Links to an external site.
		When Click on My Account then click on Login
		And Click on Login without entering username and password
		Then Verify that Invalid Email or Password  is displayed
		And Enter below credentials then click on Login "EMAIL" and "PASSWORD"
				|EMAIL                     |PASSWORD               |
				|Email user@phptravels.com |Password demouser     |
		        
		
		And Verify that Hi, John Smith message is displayed
		Then Click On John on top right corner of the page
		And Click on Logout then close the browser