
# Url Hit Counter

# Framework Used
* Spring Boot

# Language 
* Java
# Data Flow
  
 In this project, we have four layers-

* Controller-The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views ie, frontend part.

 *  Repository - Here database is stored, for which I have used arrayList. In the database layer, CRUD (create, read, update, delete) operations are performed.

* Service-The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers. • DataBase Class - Here the class user is defined and the whatever a user class will load, eg-userld, userName,

address, phone number etc.
# Data Structure used in my project

In our project HashMap and the methods involved with HashMap uesd for return a specific count of user ,how many time they hit the counter

# project Summary 
Our project basically maintains the upcoming user information which includes

* UserName
* count
You can read, read by specific id, update userName of specific userid, delete a user by their userld by api calls
