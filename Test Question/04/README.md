## Create all possible Test Cases of a Login and Create User via POST Method using endpoint that is provided on this link https://reqres.in/ (only test case scenario, just like question #2).

## Additional Description for :

1. The Login url and body

```
url: https://reqres.in/api/login
body: {
        "email": "eve.holt@reqres.in",
        "password": "cityslicka"
      }
```

2. The Create User url and body

```
url: https://reqres.in/api/users
body: {
        "name": "morpheus",
        "job": "leader"
      }
```

## Answers:

|    ID     |                         Title                         |                                                        Short Description                                                        | Severity | Type of test |                                                                      Steps                                                                      |                       Test Data                       |                                                              Expected Results                                                               |                   Note                   |
| :-------: | :---------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------: | :------: | :----------: | :---------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------: |
| PT_LG_001 |             Login with valid credentials              |                                   Verify that a user can log in with valid email and password                                   |   High   |  Functional  |                  1. Send a POST request to https://reqres.in/api/login with email: eve.holt@reqres.in and password: cityslicka                  |    Email: eve.holt@reqres.in, Password: cityslicka    |                              1. Status code 200 is returned.<br> 2. A token is returned in the response body.                               |                    -                     |
| PT_LG_002 |               Login with invalid email                |                                     Verify that a user cannot log in with an invalid email                                      |  Medium  |  Functional  |                                  1. Send a POST request to https://reqres.in/api/login with an invalid email.                                   |         Email: abc@xyz, Password: cityslicka          |                          1. Status code 400 is returned.<br> 2. An error message is returned in the response body.                          | body message: "error": "user not found"  |
| PT_LG_003 |              Login with invalid password              |                                    Verify that a user cannot log in with an invalid password                                    |  Medium  |  Functional  |                  1. Send a POST request to https://reqres.in/api/login with email: eve.holt@reqres.in and an invalid password.                  | Email: eve.holt@reqres.in, Password: invalid password |                          1. Status code 400 is returned.<br> 2. An error message is returned in the response body.                          | body message: "error": "user not found"  |
| PT_CU_001 |              Create user with valid data              |                                 Verify that a user can be created with valid name and job data                                  |   High   |  Functional  |                 1. Send a POST request to https://reqres.in/api/users with name: morpheus and job: leader in the request body.                  |              Name: morpheus, Job: leader              |                             1. Status code 201 is returned. <br>2. User data is returned in the response body.                              |                    -                     |
| PT_CU_002 |              Create user with valid data              | Create user with missing name parameter Verify that a user cannot be created if the name parameter is missing using POST method |   High   |  Functional  |                       1. Send a POST request to https://reqres.in/api/users endpoint with job parameter set to "leader".                        |                     job: "leader"                     |    1. A 400 Bad Request response code is returned. <br>2. An error message "name parameter is missing" is returned in the response body.    | A 201 Created response code is returned. |
| PT_CU_003 |        Create user with missing job parameter         |                     Verify that a user cannot be created if the job parameter is missing using POST method                      |   High   |  Functional  |                      1. Send a POST request to https://reqres.in/api/users endpoint with name parameter set to "morpheus".                      |                   name: "morpheus"                    |    1. A 400 Bad Request response code is returned. <br>2. An error message "job parameter is missing" is returned in the response body.     | A 201 Created response code is returned. |
| PT_CU_004 | Create user with invalid data type for name parameter |              Verify that a user cannot be created if the name parameter has an invalid data type using POST method              |   High   |  Functional  |  1. Send a POST request to https://reqres.in/api/users endpoint with name parameter set to an integer value and job parameter set to "leader".  |               name: 123, job: "leader"                | 1. A 400 Bad Request response code is returned. <br>2. An error message "name parameter must be a string" is returned in the response body. | A 201 Created response code is returned. |
| PT_CU_005 | Create user with invalid data type for job parameter  |              Verify that a user cannot be created if the job parameter has an invalid data type using POST method               |   High   |  Functional  | 1. Send a POST request to https://reqres.in/api/users endpoint with name parameter set to "morpheus" and job parameter set to an integer value. |              name: "morpheus", job: 123               | 1. A 400 Bad Request response code is returned.<br> 2. An error message "job parameter must be a string" is returned in the response body.  | A 201 Created response code is returned. |
