@Smoke 
Feature: GCRShop login feature testing 
	Description: pass must be more than 8 characters

#Background:Given open browser/login

@TC001_to_TC007 
Scenario: As a GCR user, i can successfully login with valid credetials 
	Given User need to open a browser 
	And Put GCR shop URL 
	When Click my account 
	And put email 
	And put password 
	And click sign in button 
	Then login will be successful 
