@Regression 
Feature: Login validation 

	Description :requirement 

#Background: 
	 
@TC_001_to_TC_07
Scenario: Successfully login with valid credential 
	Given User need to open a browser
	And Pass the URL 
	When Click my account 
	And put email 
	And put password 
	And click sign in button 
	Then login will be successful 
	
