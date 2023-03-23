@all
Feature: User Registration

Background:
Given Navigate to Register Account page

@register @mandatoryfields @smoke @regression
Scenario: Register with mandatory fields
When firstname entered in First Name field "Caleb"
And lastname entered in Last Name field "Mortensen"
And email entered in Email field "caleb.mortensen@live.com"
And enters telephone in Telephone field "123-456-7890"
And password entered in Password field "mypassword"
And password entered in Confirm Password field "mypassword"
And selects Privacy Policy field
And clicks on Continue button
Then Account is successfully created

@register @allfields @smoke @regression
Scenario: Register with All fields
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

@register @nodetails @regression
Scenario: Register without providing any fields
When no details entered
And clicks Continue button
Then Warning message displayed

@register @duplicatemail @regression
Scenario: with duplicate email address
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





