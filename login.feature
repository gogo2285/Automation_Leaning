Feature: Flight booking on newdemo tours site

Scenario: Round trip Ticket booking

Given : browser is present 
When : user logs in with "tutorial" and "tutorial"
And : Flight ticket is booked successfully for both ways
Then : Confirmation no. is printed successfully
And : close the browser

Scenario Outline: oneway Ticket booking

Given : browser is present 
When : user logs in with "<username>" and "<password>"
When : Flight ticket is booked successfully for one way
Then : Confirmation no. is printed successfully
And : close the browser

Examples:

| username |  password |
| tutorial |  tutorial |
| admin    |  admin    |
