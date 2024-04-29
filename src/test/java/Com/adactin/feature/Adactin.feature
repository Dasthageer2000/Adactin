Feature: Hotel Bokking In Adactin WebApllication 

@smookTesting
Scenario: User Login In Adactin Hotel Booking
Given lanch The Adactin Web Application 
When user Enter The Valid User Name In User Name Feild
And user Enter The Valid Password In PassWord Feild
Then user Click The Login Button Should Be Navigate To Search Hotel Page 

@sanetyTest
Scenario: User Search The Hotel In Adactin
When user Select The Location In Select Feild
And user Select The Hotel In Select Feild 
And user Select The Room Type In Select Feild 
And user Select The Number Of Rooms In Select Feild 
And user Enter Cheack In Date The Input Feild 
And user Enter Cheack Out Date The Input Feild
And user Select The Adults Per Room In Select Feild 
And user Select The Children Per Room In Select Feild 
Then user Click The Search Button It Shoud Be Navigate To Select Hotels Page

@sanetyTest
Scenario: User Select The Hotel In Adactin
When user Select The Hotel 
Then user Click The Continue Button It Navigate to Book A Hotel Page

@sanetyTest
Scenario: User Book A Hotel In Adactin 
When user Enter The First Name In InPut Feild
And user Enter The Last Name In Input Feild
And user Enter The Builldind Address In Input Feild
And user Enter The Credit Card No In Input Feild 
And user Select He credit Card Type In Select Feild
And user Select The Expiry Month In Expiry Date  Select Feild
And user Select The Expiry Year In Expiry Date Select Feild
And user Enter The CVV Number In InPut Feild
Then User Click The Book Now Button It Navigate To Booking Confirmation Page

@sanetyTest
Scenario: User Booking The Confirmation
Then user Click The Logout Button It Navigate To Logout SuccessFully LogOut Page 

@reggresionTest
Scenario: User Wants To Login Again
Then user Click The Login Again Link It Navigate To Login Page
