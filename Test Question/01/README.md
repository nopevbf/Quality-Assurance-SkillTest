## [Score : 20] Given this design of Linkedin registration page, please create the Requirement Ticket

<img src="../../assets/01.png" width="250" height="250">

1. Please describe the requirement as detail as you can
2. Please describe all possible acceptance criteria based on design above
3. Describe with BDD format, will be counted as an additional point.

## Answer:

## 1. Requirement

The information required includes the email or phone number and password. Additionally, the user should be given an option to sign up with their Google account, which will require the platform to prompt for authorization to access the user's Google account information.

## 2. Acceptance criteria

    1. All required fields must be filled before a user can     submit the form.

    2. The email address must be in a valid format, and the password must meet the platform's password requirements (i.e., at least 8 characters long, with at least one uppercase letter, lowercase letter, and number).

    3. If the user chooses to sign up with their Google account, the platform must prompt for authorization to access the user's Google account information.

    4. Upon submission of the registration form, the user's information should be saved in the database, and the user should be redirected to a confirmation page where they can review their registration details before the final submission.

    5. The confirmation page should display the user's first and last name, job title, and company name.

## 3. Describe with BDD format

### **Feature: Join Now page**

As a potential user of LinkedIn
I want to sign up for a new LinkedIn account
So that I can access the LinkedIn.

**Scenario: User signs up for a LinkedIn account** <br>
Given the user navigates to the LinkedIn join now page
When the user enters their first name, last name, email address, password, and country
And they agree to the LinkedIn terms of service and privacy policy
And click on the sign-up button

Then the user should receive a confirmation message
And be redirected to their LinkedIn homepage.

**Scenario: User signs up with Google** <br>
Given the user navigates to the LinkedIn join now page

When the user clicks on the sign-up with Google button

Then the user should be redirected to the respective account login page
And upon successful authentication, the user should be redirected to their LinkedIn homepage.

**Scenario: User fills out form incorrectly** <br>
Given the user navigates to the LinkedIn join now page

When the user enters incorrect or invalid input in the form fields

Then the user should receive appropriate feedback messages to correct the input
And they should not be able to proceed until all form inputs are valid.
