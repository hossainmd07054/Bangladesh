Feature: Home page

@BD1
Scenario: Verify search result display
Given Open Application '<URL>'
Then user verifies label bank of america is displayed in homepage
Then user Enter '<userName>' and '<password>' in filed
Then user Click on SignIn button
Then Verify search result display