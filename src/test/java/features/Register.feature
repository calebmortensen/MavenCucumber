@all
Feature: User Registration

Background:
Given Navigate to Register Account page

@register @mandatoryfields @smoke @regression
Scenario: Register with mandatory fields
When user enters the details into below fields
|firstName   |Arun                       |
|lastName    |Moto                       |
|email       |amotorooricap245@gmail.com | 
|telephone   |1234567890                 |
|password    |12345                      |

And selects Privacy Policy field
And clicks on Continue button
And selects Yes Radio for Subscribe to Newsletter
Then Account is successfully created