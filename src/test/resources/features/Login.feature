Feature: Verify User Login with Valid/Invalid Credentials

@Login
Scenario: Verify User Login with Valid Credentials
Given User is on Login Page
When User gets the page title
Then Page title should be "Login"
When User enter username "user@phptravels.com" in username field
And User enter password "demouser" in password field
When User clicks on Login button
When Page title should be "Dashboard"


Scenario: Verify Wallet Balance, total bookings and Pending Invoices
Given User is on Login Page
When User gets the page title
Then Page title should be "Login"
When User enter username "user@phptravels.com" in username field
And User enter password "demouser" in password field
When User clicks on Login button
When Page title should be "Dashboard"
Then Verify Wallet Balance value is "0", Total Bookings "47" and Pending Invoices are "44"
