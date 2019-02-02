## How to run the tests via maven commands on your local command line
1. Go to project directory then run your tests
```
mvn clean test 
```
You can generate a report on web server 
```
mvn allure:serve
```
Report will be generated into temp folder. Web server with results will start.
```
mvn allure:report
```
Report will be generated tо directory: target/site/allure-maven/index.html
