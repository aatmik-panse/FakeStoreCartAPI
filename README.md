# FakeStoreCartAPI
This file outlines the instructions for setting up, running, and testing the Fake Store Cart API project.

<h2>Prerequisites</h2>
Java 11 or above
Maven build tool
Setup
Clone the project: Use Git to clone the project repository.
Install dependencies: Navigate to the project directory in your terminal and run:
Bash
mvn clean install

This command downloads and installs all the necessary libraries.

Running the application
Start the application: Run the following command in your terminal:
Bash
mvn spring-boot:run
Use code with caution.
This will start the Spring Boot application and expose the API endpoints.

API Endpoints
The API provides functionalities related to managing carts:

GET /hello: Returns a simple "Hello, World!" message.
GET /carts: Retrieves all carts.
GET /carts/{id}: Retrieves a specific cart by its ID.
GET /carts/user/{userId}: Retrieves carts belonging to a particular user identified by user ID.
POST /carts: Creates a new cart.
PUT /carts/{id}: Updates an existing cart with the provided details.
DELETE /carts/{id}: Deletes a cart by its ID.
GET /carts/{start}/{end}: Retrieves carts created within a specific date range (start and end dates inclusive).
Note:

Replace {id} and {userId} in the URL paths with actual values.
Refer to the Cart model class for the expected data format when creating or updating carts.
Running Tests
Unit and integration tests can be executed using Maven:

Bash
mvn test
Use code with caution.
This command will run all the tests present in the project and display the results.

