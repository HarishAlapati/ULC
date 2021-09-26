Feature: Open the UrbanLadder Website  



Scenario: Check item in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When Enter "Chair" in searchbox and search
Then Check item is present or not

Scenario: Check Help Services in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When click on the help and navigate
And Enter your query  here "Warranty" and click enter
Then Check reponse questions are getting

Scenario: Check Deliver sites in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When Click on the more in footer page for delevering cities
Then Get Cities list that delivering

Scenario: Check Twitter Following in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When Click on the Twitter in footer page from contact us
Then Get Twitter following numbers

Scenario: Check Chat Support feature in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When Shit to Frames for chat
Then Click on chat logo and send "hi" in chat box

Scenario: Check Products count for item with and without stock in Urban Ladder website
Given Open Browser 
And navigate to given url and close popup
When search "cupboard" item 
Then Display number of products with and without Stock 

Scenario: Check No Expiry Date isdisplayed in under GiftCards in HomePage
Given Open Browser 
And navigate to given url and close popup
When Click on Gift Cards
Then Verify is No Expiry Date is displayed

Scenario Outline: Check Track order in HomePage
Given Open Browser 
And navigate to given url and close popup
When click on the Track order button in the HomePage 
Then Then Enter <ordi> and <phno>

Examples:
|ordi|phno|
|1235|8954236521|
|2987|9856236545|

Scenario: Search for item and set recommend to low to high
Given Open Browser 
And navigate to given url and close popup
When Search for some item "Coffee Table"
Then Set Recommeded to low to high

Scenario: Get Number of images  in stores page
Given Open Browser 
And navigate to given url and close popup
When Click on Stores
Then get number of images and print