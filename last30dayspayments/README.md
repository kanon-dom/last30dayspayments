# Last30DaysPayments

Last30DaysPayments returns a list of payments a user has made in the last 30 days.  

## Requirements
For building and running the application you need:
* Java 1.8 or above
* Maven 3


## Build 
unzip file
Goto to the following directory last30dayspayments\last30dayspayments
 e.g cd last30dayspayments\last30dayspayments
mvn clean package

## Run Tests
From the build directory run the following command
mvn test

The test coverage report is in 
 <buildDirectory>/target/site/jacoco/index.html

## Run

mvn spring-boot:run

## Usage

On a browser enter the following urls:

http://localhost:8080/payments/last30days?accountId=1294048
Should return the list of payments made by user with account Id= 1294048 the last 30 days

