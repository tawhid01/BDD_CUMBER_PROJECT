Feature: Ups Tracking Feature
  This feature will test UPS tracking functionality
	
	Background: 
		Given UPS tracking page launched
	
	
		@Sanity @Sprint1
  Scenario: Verify Customer Tracking Using Wrong Tracking Number
   	When User inpute wrong TrackingNumber "N13N412NG009A"
   	And User click on track button
   	Then User should reciver an error text
   	
		@Regression @Sprint1
  Scenario Outline: Verify Customer Tracking Using Correct Tracking Number
   	When User inpute Correct TrackingNumber <TrackingNumber>
   	And User click on track button
   	Then User should be able to view tracking information 

    Examples: 
      | TrackingNumber  |  
      | W13N412NG009A 	|     
      | D46G614NY281B		|
      | T73H11XNG809P		|
