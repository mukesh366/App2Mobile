Feature: Login by the valid cridentials



Scenario Outline:

Given Launch the browser and Enter "<URL>"
When click on the three line to goto the user profile page
Then click on sign in button
Then Enter "<username>" and "<password>"
And Click on Login Button
When click on the Anytime Brunch Options
Then click on the add button
Then Click on the delivery options
Then click on the save and proceed options
Then Click on checkout option
Then varify the selected store and click on the continue option
Then choose payment option as a Pay Cash On Delivery
Then Click on Pay Option button


Examples:

|URL                                        |username                 |password          |
|https://stg.app2food.com/oloweb301/11002/#/|mukeshmaurya365@gmail.com|geetangali        |