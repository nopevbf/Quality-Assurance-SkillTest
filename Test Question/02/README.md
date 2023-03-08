## [Score : 20] Based on this Linkedin registration page design, please create possible Test Cases. Both Positive and Negative Test Cases that possible.

<img src="../../assets/01.png" width="250" height="250">

At least, the test cases must contain :

1. Title
2. Short description
3. Severity
4. Type of test
5. Steps
6. Test Data
7. Expected Results
8. Note

## Answer

|    ID     |         Title          |                                        Short Description                                        | Severity | Type of test |                                                                               Steps                                                                                |                        Test Data                        |                                                 Expected Results                                                  | Note |
| :-------: | :--------------------: | :---------------------------------------------------------------------------------------------: | :------: | :----------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------: | :--: |
| TS_LG_001 | Invalid Email Address  |             Verify error message displayed when an invalid email address is entered             |   High   |  Functional  |                                      1. Enter an invalid email address in the email field <br> 2. Click on "Join now" button                                       |      Email address: abc@xyz <br> Password: test123      |                          Error message "Please enter a valid email address" is displayed                          |  -   |
| TS_LG_002 |   Successful Sign-up   |                          Verify successful registration of a new user                           |   High   |  Functional  |                                       1. Enter valid data in all required fields<br>2. Click on the "Agree and Join" button                                        | Email: firajitio.test@gmail.com <br> Password: Test1234 |                 The user should be successfully registered and directed to the LinkedIn homepage.                 |  -   |
| TS_LG_003 |   Password Strength    |             Verify if an error message is displayed when a weak password is entered             |  Medium  |  Functional  |              1. Enter valid data in all required fields<br>2. Enter a weak password in the password field<br>3. Click on the "Agree and Join" button               |    Email: firajitio.test@gmail.com<br>Password: 123     | An error message should be displayed indicating that the password is weak. Password must be 6 characters or more. |  -   |
| TS_LG_004 | Existing Email Address | Verify if an error message is displayed when an email address that is already in use is entered |   High   |  Functional  | 1. Enter an email address that is already in use in the email field<br>2. Enter valid data in all other required fields<br>3. Click on the "Agree and Join" button | Email: firajitio.test@gmail.com<br>Password: 123456789  |                     An error message should be displayed. Someone’s already using that email.                     |  -   |
