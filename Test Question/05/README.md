## [**Score : 20]\*\* Please go to [https://www.demoblaze.com/index.html](https://www.demoblaze.com/index.html)

After that, please create an Automation Test to check the functionality of links on Header and Sidebar on the [https://www.demoblaze.com/index.html](https://www.demoblaze.com/index.html)

- Please create short description and video record during Automation Test
- Scripting with Robot Framework or any automation tools you prefered
  **\*Except selenium IDE or Katalon (Record Only)**
- Please attach the code of automation test, or the log / report after automation test finished
- Push the code to github (**set the repository as private, invite training@refactory.id as collaborator and put the link on the spreadsheet**)

## Answer:

## Tool: **Selenium IDE**

## 1. homepage- verify that the homepage is displayed. - This test case checks if the homepage link on the header is functioning properly.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExN2FlZGViOTJhNmYyNGM1ZTk4MWNiNDZjMTM0OWUyNmIzM2Q5ZTg0YSZjdD1n/Lul7UGI9AOWRzsItfn/giphy.gif">

### Log:

```
Running 'homepage'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1280x800 OK
3.click on css=#nava > img OK
4.close OK
'homepage' completed successfully
```

## 2. contact- verify that the contact page is displayed. - This test case checks if the contact link on the header is functioning properly.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExYjQxMzM1Y2UwMDI1MzFlMDEwYTc5YmNlZmFkN2Q1ZGUxZjEwZWVlNiZjdD1n/6m5Yo5xC0dzhfzyIpL/giphy.gif">

### Log:

```
Running 'contact'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.mouseOver on linkText=About us OK
4.mouseOut on linkText=About us OK
5.click on linkText=Contact OK
6.click on css=#exampleModal .btn-secondary OK
7.close OK
'contact' completed successfully
```

## 3. about- verify that the contact page is displayed. - This test case checks if the contact link on the header is functioning properly.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNTkwZDQyM2Q2YzYzZTZkZDY5MmQzNzQxM2RhYmUzMDMwZGNkOTIyNiZjdD1n/B5XLARgLSEFKubVU3W/giphy.gif">

### Log:

```
Running 'about '
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on linkText=About us OK
4.click on css=#videoModal .btn OK
5.close OK
'about ' completed successfully
```

## 4. signup- verify that the sign up page is displayed. - This test case checks if the sign up link on the header is functioning properly.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExMjlhMGU4ZGI1MmU0MTBjNTQ2MTlhZDJkNjkyNDkzODdiMmY3MDE4MyZjdD1n/PlfXxsxcdp6TJhB8Op/giphy.gif">

### Log:

```
Running 'signup'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on id=signin2 OK
4.click on id=sign-username OK
5.type on id=sign-username with value firaji OK
6.type on id=sign-password with value qwertyuiop OK
7.click on css=#signInModal .btn-primary OK
8.assertAlert on This user already exist. OK
9.doubleClick on id=sign-username OK
10.type on id=sign-username with value qafirajitio5 OK
11.doubleClick on id=sign-password OK
12.type on id=sign-password with value qwertyuiop OK
13.click on css=#signInModal .btn-primary OK
14.assertAlert on Sign up successful. OK
15.close OK
'signup' completed successfully
```

## 5. login- verify that the login page is displayed. -his test case checks if the login link on the header is functioning properly.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExZmRiZDlhN2Q5NzY5ZTQ3OTEzYzExM2E5ZTI0ZGNhZThiMTIyMGZkOCZjdD1n/kJfJdAyzqXdkAoCrxx/giphy.gif">

### Log:

```
Running 'login success '
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on id=login2 OK
4.click on id=loginusername OK
5.type on id=loginusername with value firaji OK
6.type on id=loginpassword with value qwertyuiop OK
7.click on css=#logInModal .btn-primary OK
8.close OK
'login success ' completed successfully
```

## 6. sidebar- verify that every sidebar is displayed. - This test case checks if the link on the sidebar is functioning properly.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExZjk0ZjI3MDM5OTVkOGMxYjJkODQ3YmJmNDA1MjEyNWY1ZTRiNGI0ZSZjdD1n/PsxhPYrSJpJ2bLmeOj/giphy.gif">

### Log:

```
Running 'sidebar'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on id=itemc OK
4.click on id=itemc OK
5.click on linkText=Sony xperia z5 OK
6.click on css=.active > .nav-link OK
7.click on linkText=Laptops OK
8.click on linkText=MacBook Pro OK
9.click on css=.active > .nav-link OK
10.click on linkText=Monitors OK
11.click on linkText=ASUS Full HD OK
12.click on css=.active > .nav-link OK
13.close OK
'sidebar' completed successfully
```

## 6. cart- verify that the cart page is displayed. - This test case checks if the cart link on the header is functioning properly, add some items and delete it. Also Order

**Add Cart**
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNGVjMGI3NjA5ZGEzZWU1ZmJiYmY1YTMxMzljZTlmMjA2MjFiNmEyYSZjdD1n/ScEoDVhcIoqHbujyxU/giphy.gif">

### Log:

```
Running 'add_cart'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.Trying to find linkText=Samsung galaxy s6... OK
4.Trying to find linkText=Add to cart... OK
5.assertAlert on Product added. OK
6.click on css=.active > .nav-link OK
7.Trying to find linkText=Sony vaio i5... OK
8.Trying to find linkText=Add to cart... OK
9.assertAlert on Product added. OK
10.click on id=cartur OK
11.close OK
'add_cart' completed successfully
```

**Delete Cart**
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExMDA4MDI2ZDdkMzBjNWE3MDQ0ZDJkOGIxYzQ1YzMxODEzZjgzM2VhYiZjdD1n/ECTlTzRZLOMcHwGIZU/giphy.gif">

### Log:

```
Running 'delete_cart'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on id=cartur OK
4.Trying to find linkText=Delete... OK
5.click on linkText=Delete OK
6.close OK
'delete_cart' completed successfully
```

**Order Cart**
<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExMGY1MDE4MGFiYmU1ZjFiYTVjZTJmY2QyMGIwM2Y5YzNlMDY4NTdiNiZjdD1n/Y7m3raFFNPcuk1NHKa/giphy.gif">

### Log:

```
Running 'cart_place_order'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on id=cartur OK
4.click on css=.btn-success OK
5.mouseOver on css=.btn-success OK
6.mouseOut on css=.btn-success OK
7.click on id=name OK
8.type on id=name with value Firman Aji Prasetyo OK
9.type on id=country with value Indonesia OK
10.type on id=city with value Kabupaten Magelang OK
11.click on id=card OK
12.type on id=card with value 123456789 OK
13.click on id=month OK
14.type on id=month with value July OK
15.click on id=year OK
16.type on id=year with value 2023 OK
17.click on css=#orderModal .btn-primary OK
18.click on css=.confirm OK
19.close OK
'cart_place_order' completed successfully
```

## 6. logout- verify that the user is logged out and redirected to the homepage. - This test case checks if the log out link on the header is functioning properly, and if the user is successfully logged out and redirected to the homepage.

<img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExODdmYTk4M2Q1NjU0MWI0NmRjMzAyN2JlMTg4NTU0ODQ5MTI1NmNiZiZjdD1n/uHo0CIwyOF9ZZXcyDo/giphy.gif">

### Code: [logout](/Test%20Question/05/code/LogoutTest.java)

### Log:

```
Running 'logout'
1.open on https://www.demoblaze.com/index.html OK
2.setWindowSize on 1074x618 OK
3.click on id=logout2 OK
4.close OK
'lgout' completed successfully
```
