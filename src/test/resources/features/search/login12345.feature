Feature: Login demo test

	Scenario: Login with valid credentials
	Given user is on login page
	When user enter admin as username
	And click on arrow buttton
	Then user should be able to login