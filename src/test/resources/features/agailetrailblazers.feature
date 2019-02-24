@Smoke 
Feature: Agaile trailblazer 

Background: 
	Given user on the home page 
	
	
	

Scenario: Agaile trailblazer possitive login test 
	When user enter name and email 
	And user choose a subject 
	And user enter a message 
	When user click submit button 
	Then user should able to see "Your message was sent successfully. Thanks."
	And close the driver
	
	
	
Scenario: Agaile trailblazer negative login test 
	When user enter name and email 
	And user choose a subject 
	And user does not enter a message 
	When user click submit button 
	Then user should able to see error message "Validation errors occurred. Please confirm the fields and submit it again."
	And close the driver
	
