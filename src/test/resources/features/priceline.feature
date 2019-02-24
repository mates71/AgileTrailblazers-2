@priceline
Feature: Find cheap ticket to Ohio from Wisconsin

Scenario: find ticket
	Given User Priceline home page
	When user click to FLIGHT button
	And user able to see flight details
	And user should be fill out whole options
	When user click find your flight button
	Then user should able to see flight results
	

