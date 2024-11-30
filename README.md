##  This project is a simple web-based application developed using Java Servlets, JSP, and JDBC for database interaction. 
# This web application allows users to register, log in, and view a dashboard using JSP, Servlets, and JDBC. 
# The registration form collects the user's first name, last name, email, and username (with validation for unique usernames and email format). 
# Upon successful registration, a random key is generated and displayed. 
# The login form validates the username, password, and generated key, and redirects to a dashboard that displays all registered usernames and their associated keys. 
# The front-end is built with Bootstrap for responsive design, and jQuery is used for client-side validation.


##  Following is the assignment.

 

Framework         : JSP, Servlet & JDBC

Database            : MySQL or PostgreSQL

Frontend             : Bootstrap

Validations         : jQuery

 

## Requirement is as below:

1.  Registration form with following fields:

  a.       First name

  b.       Last name

  c.       Email -> Check valid email (email address should contain @ somewhere in the middle and a dot at least 2 characters after @ and minimum 2 characters at the end)

  d.       Username -> Check duplicate username using Ajax

  e.       Password
          
          Generate a random key in the database while inserting this record.

2.  Registration success page

   a.       Fetch the random key that was generated and display the same on the page

3.  Login form

    a.       Username

    b.       Password

    c.       Key 

    Accept the above on the form and validate all of these from the backend. Redirect to a dashboard page if successful, or display authentication failure if unsuccessful. 

4.  Dashboard

    a.   Fetch all the usernames and associated keys from the database and display them in a tabular form.
