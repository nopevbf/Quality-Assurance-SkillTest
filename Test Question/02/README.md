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

|    ID     |         Title         |                            Short Description                            | Severity | Type of test |                                          Steps                                          |                   Test Data                   |                        Expected Results                         | Note |
| :-------: | :-------------------: | :---------------------------------------------------------------------: | :------: | :----------: | :-------------------------------------------------------------------------------------: | :-------------------------------------------: | :-------------------------------------------------------------: | :--: |
| TS_LG_001 | Invalid Email Address | Verify error message displayed when an invalid email address is entered |   High   |  Functional  | 1. Enter an invalid email address in the email field <br> 2. Click on "Join now" button | Email address: abc@xyz <br> Password: test123 | Error message "Please enter a valid email address" is displayed |  -   |
