Feature: User Registration

Scenario: Register with mandatory fields
Given Navigate to Register Account page
When firstname entered in First Name field "Caleb"
And lastname entered in Last Name field "Mortensen"
And email entered in Email field "caleb.mortensen@live.com"
And enters telephone in Telephone field "123-456-7890"
And password entered in Password field "mypassword"
And password entered in Confirm Password field "mypassword"
And selects Privacy Policy field
And clicks on Continue button
Then Account is successfully created

Scenario: Register with All fields
Given Navigate to Register Account page
When firstname entered in First Name field "Caleb"
And lastname entered in Last Name field "Mortensen"
And email entered in Email field "caleb.mortensen@live.com"
And enters telephone in Telephone field "123-456-7890"
And password entered in Password field "mypassword"
And password entered in Confirm Password field "mypassword"
And selects Yes Radio for Subscribe to Newsletter
And selects Privacy Policy field
And clicks on Continue button
Then Account is successfully created

Scenario: Register without providing any fields
Given Navigate to Register Account page
When no details entered
And clicks Continue button
Then Warning message displayed

Scenario: with duplicate email address
Given Navigate to Register Account page
When firstname entered in First Name field "Caleb"
And lastname entered in Last Name field "Mortensen"
And email entered in Email field "caleb.mortensen@live.com"
And enters telephone in Telephone field "123-456-7890"
And password entered in Password field "mypassword"
And password entered in Confirm Password field "mypassword"
And selects Yes Radio for Subscribe to Newsletter
And selects Privacy Policy field
And clicks on Continue button
Then Warning message about duplicate email address is displayed 





