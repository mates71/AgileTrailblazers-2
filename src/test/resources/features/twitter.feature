@twitter
Feature: As a user want to creat twitter account

Scenario: Positive Login Test
		Given User on the twitter home page
		When user enter valid credentianal
		And press the login button
		Then user should able to see "The phone number and password you entered did not match our records. Please double-check and try again." messages

