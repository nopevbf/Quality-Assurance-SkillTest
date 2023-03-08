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

```
Running 'sidebar'
01:22:53
1.
open on https://www.demoblaze.com/index.html OK
01:22:53
2.
setWindowSize on 1074x618 OK
01:22:54
3.
click on id=itemc OK
01:22:55
4.
click on id=itemc OK
01:22:56
5.
click on linkText=Sony xperia z5 OK
01:22:57
6.
click on css=.active > .nav-link OK
01:22:57
7.
click on linkText=Laptops OK
01:22:59
8.
click on linkText=MacBook Pro OK
01:22:59
9.
click on css=.active > .nav-link OK
01:23:00
10.
click on linkText=Monitors OK
01:23:01
11.
click on linkText=ASUS Full HD OK
01:23:02
12.
click on css=.active > .nav-link OK
01:23:03
13.
close OK
01:23:04
'sidebar' completed successfully
```

```
Running 'delete_cart'
01:21:15
1.
open on https://www.demoblaze.com/index.html OK
01:21:16
2.
setWindowSize on 1074x618 OK
01:21:16
3.
click on id=cartur OK
01:21:16
4.
Trying to find linkText=Delete... OK
01:21:17
5.
click on linkText=Delete OK
01:21:19
6.
close OK
01:21:19
'delete_cart' completed successfully
```

```
Running 'add_cart'
01:20:21
1.
open on https://www.demoblaze.com/index.html OK
01:20:21
2.
setWindowSize on 1074x618 OK
01:20:21
3.
Trying to find linkText=Samsung galaxy s6... OK
01:20:21
4.
Trying to find linkText=Add to cart... OK
01:20:22
5.
assertAlert on Product added. OK
01:20:24
6.
click on css=.active > .nav-link OK
01:20:24
7.
Trying to find linkText=Sony vaio i5... OK
01:20:24
8.
Trying to find linkText=Add to cart... OK
01:20:25
9.
assertAlert on Product added. OK
01:20:26
10.
click on id=cartur OK
01:20:26
11.
close OK
01:20:27
'add_cart' completed successfully
```

```
Running 'logout'
01:18:43
1.
open on https://www.demoblaze.com/index.html OK
01:18:43
2.
setWindowSize on 1074x618 OK
01:18:44
3.
click on id=logout2 OK
01:18:44
4.
close OK
01:18:45
'logout' completed successfully
```

```
Running 'login success '
01:16:31
1.
open on https://www.demoblaze.com/index.html OK
01:16:31
2.
setWindowSize on 1074x618 OK
01:16:32
3.
click on id=login2 OK
01:16:32
4.
click on id=loginusername OK
01:16:34
5.
type on id=loginusername with value firaji OK
01:16:34
6.
type on id=loginpassword with value qwertyuiop OK
01:16:35
7.
click on css=#logInModal .btn-primary OK
01:16:36
8.
close OK
01:16:36
'login success ' completed successfully
```
