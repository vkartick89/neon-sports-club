<h1 align="center">
  <br>
  <a><img src="https://github.com/vkartick89/neon-sports-club/blob/main/docs/images/neon-sc-logo.png" alt="neon sc"></a>
  <br>
  Neon Sports Club Application
  <br>
</h1>

<h4 align="center">Neon Sports Club Application with Admin and User Login Support.</h4>

<p align="center">
    <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v1.8-orange.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-v2.3.3-brightgreen.svg" />
    </a>
    <a alt="Bootstrap">
        <img src="https://img.shields.io/badge/Bootstrap-v4.0.0-yellowgreen.svg">
    </a>
    <a alt="Material">
        <img src="https://img.shields.io/badge/Material%20Design-UI-orange.svg">  
    </a>      
    <a alt="Docker">
        <img src="https://img.shields.io/badge/Docker-v19-yellowgreen.svg" />
    </a>
    <a alt="Dependencies">
        <img src="https://img.shields.io/badge/dependencies-up%20to%20date-brightgreen.svg" />
    </a>
    <a alt="Contributions">
        <img src="https://img.shields.io/badge/contributions-welcome-orange.svg" />
    </a>
    <a alt="License">
        <img src="https://img.shields.io/badge/license-MIT-blue.svg" />
    </a>
</p>

## Table of Contents ##
1. [Application](#Application)
2. [Technology](#Technology)
3. [Run Locally](#Running-the-server-locally)
4. [Run Insider Docker](#Running-the-server-in-Docker-Container)
5. [Contributor](#Contributor)
6. [License](#License)

## Application ##

The app is a _Court Reservation System_ with an Admin portal which can be operated over browsers and a series of REST APIs to interact with the system using mobile applications or frontend applications written for the browsers. The complete systems has two important actors :

1. Admin user
2. End user

The _Admin user_ can access this application on browser (laptop or mobile/tablet, doesn't really matter as this is built using bootstrap, material design and is completely responsive) and can perform the following actions :

1. Signup
2. Login
3. Update their profile
4. Create an agency
5. Add courts to the agency
6. Add bookings consisting of courts and slots
 
The _End user_ can use their mobile application (yet to be built, however the REST APIs are ready and could be used via Postman or Swagger) to perform the following actions :

1. Signup
2. Login (and get a JWT token) 
3. List all available slots
4. Filter with a date option
5. Find an available slot in any of the courts
6. Book a slot for a particular duration

Admin interface and REST APIs both have their independent authentication mechanisms, the web application uses the cookie based authentication (provided by default by Spring security) and the REST API uses the JWT authentication for access. This application assumes the availability of 'MySQL' installation on the localhost where the server will run or the use of docker-compose to boot up a mysql container and link the application with it within the realm of docker.

Any changes that the admin users will do on the web portal will impact the search results of the end users.

The admin user interface is completely written in material design using Bootstrap v4 and is responsive to suite a variety of devices. The template engine used to render the admin views is Thymeleaf since the library is extremely extensible and its natural templating capability ensures templates can be prototyped without a back-end – which makes development very fast when compared with other popular template engines such as JSP.

## Technology ##
Following libraries were used during the development of this app :

- **Spring Boot** - Server side framework
- **Docker** - Containerizing framework
- **MySQL** - Database 
- **Swagger** - API documentation
- **Thymeleaf** - Templating engine
- **Thymeleaf** - Templating engine
- **Material** - UI theming/design
- **Bootstrap** - CSS framework
- **JWT** - Authentication mechanism for REST APIs

## Running the server locally ##
To be able to run this app you will need to first build it. To build and package the app into a single executable Jar file with Maven, use the below command. You will need to run it from the project folder which contains the pom.xml file.

```
maven package
```
or you can also use

```
mvn install
```

To run the app from a command line in a Terminal window you can you the java -jar command. This is provided your app was packaged as an executable jar file.

```
java -jar target/neon-sports-club-1.0.jar
```

You can also use Maven plugin to run the app. Use the below example to run the Spring Boot app with Maven plugin :

```
mvn spring-boot:run
```

If you do not have a mysql instance running and still just want to create the JAR, then please use the following command:

```
mvn install -DskipTests
```

This will skip the test cases and won't check the availability of a mysql instance and allow you to create the JAR.

You can follow any/all the above commands, or simply use the run configuration provided by your favorite IDE and run/debug the app from there for development purposes. Once the server is setup you should be able to access the admin interface at the following URL :

http://localhost:8080

And the REST APIs can be accessed over the following base-path :

http://localhost:8080/api/

Some of the important api endpoints are as follows :

- http://localhost:8080/api/v1/user/signup (HTTP:POST)
- http://localhost:8080/api/auth (HTTP:POST)
- http://localhost:8080/api/v1/reservation/slots (HTTP:GET)
- http://localhost:8080/api/v1/reservation/slotsbydate (HTTP:GET)
- http://localhost:8080/api/v1/reservation/slotschedules (HTTP:GET)
- http://localhost:8080/api/v1/reservation/bookslots (HTTP:POST)

## Running the server in Docker Container ##
##### Docker #####
Command to build the container :

```
docker build -t neonsportsclub/app .
```

Command to run the container :

```
docker run -p 8080:8080 neonsportsclub/app
```

Please **note** when you build the container image and if mysql is running locally on your system, you will need to provide your system's IP address (or cloud hosted database's IP) in the application.properties file to be able to connect to the database from within the container.

##### Docker Compose #####
Another alternative to run the application is to use the docker-compose.yml file and utility. To build the application using docker-compose simply execute the following command :
```
docker-compose build
docker-compose build
```

And to run the application, please execute the following command :
```
docker-compose up
```

## Contributors ##
[Kartick Vijayakumar](https://www.linkedin.com/in/kartick-vijayakumar/)

## License ##
This project is licensed under the terms of the MIT license.