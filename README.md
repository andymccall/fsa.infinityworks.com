# Infinity Works Tech Test
#### Developer, Andy McCall, mailme@andymccall.co.uk

The repository hosts a solution for the Infinity Works Tech Test as of the 11th March 2017.

The solution has been built using Java 8 and the Spring Framework.  I have used HTML, JS (Bootstrap and jQuery) and Thymeleaf to generate the front end.  With more time I would have looked at changing the front end to use KnockoutJS or AngularJS.

The project has been built using SOLID principles using well known design patterns.

##Project Status

[![Build Status](https://travis-ci.com/andymccall/fsa.infinityworks.com.svg?token=sVkegsMFBe6xusaGVvQA&branch=master)](https://travis-ci.com/andymccall/fsa.infinityworks.com.svg) [![codecov](https://codecov.io/gh/andymccall/fsa.infinityworks.com/branch/master/graph/badge.svg?token=NsaA3UgmQv)](https://codecov.io/gh/andymccall/fsa.infinityworks.com)

##Application Demo

A working demo of the application is hosted at:

[https://infinityworks.andymccall.co.uk/](https://infinityworks.andymccall.co.uk/)

##Build and Environment

The application has been created using the IntelliJ IDE with the JRebel plugin.  To run via the IDE, checkout the project from GitHub and or unzip the provided archive.

To test and package the project using maven on the command line run the following:

    mvn package

##Running

On Linux ensure the resources folder and the cominfinityworksfsa-0.0.1-SNAPSHOT.jar file are in the same directory.  Ensure you are logged in with a user that has permissions to access the file system and ru the following:

    root@linux-server:/opt/fsa.infinityworks.com# java -Dserver.port=9091 -Djava.net.preferIPv4Stack=true -jar cominfinityworksfsa-0.0.1-SNAPSHOT.jar

You should then be able to browse to the application on http://localhost:9091 if you have launched in on your local workstation.  If you have launched it on a server you will need to ensure the port between your workstation and the server is not being blocked by the firewall and the you are not configured to use a proxy.

##Testing

To run the projects unit tests using maven on the command line run the following:

    mvn test

Testing has been performed using JUnit and Mockito.  Code coverage reports have been produced using Jacoco and are presented by Codecov.io.

A Grid chart for the project is below.  Each block represents a single file in the project. The size and color of each block is represented by the number of statements and the coverage, respectively.

![coverage](https://codecov.io/gh/andymccall/fsa.infinityworks.com/branch/master/graphs/tree.svg?token=NsaA3UgmQv)

If working with a Business Analyst on the project it would have been beneficial to use Cucumber for BDD.  For the purpose of this test I have not included this.

##CI / CD Pipeline

The project is hosted on a private GitHub.com repository.  Upon commit a private Travis-CI.com build initiates, builds and tests the project.  An after-success option in the .travis.yml triggers Codecov.io to produce code coverage reports.

The next logical step for this CI/CD pipeline is upon a successful build publish straight into AWS Elastic BeanStalk, however I feel this is out of the scope of the tech test and would take longer then the time I have allowed to completed the test.

I would also look at automatic load testing using LoadImpact.com.

