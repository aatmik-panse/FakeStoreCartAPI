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

<h2>Running the application</h2>
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

<h2>PostMap Testing ScreenShorts</h2> 
<img width="1061" alt="Screenshot 2024-03-12 at 5 39 52 PM" src="https://github.com/aatmik-panse/FakeStoreCartAPI/assets/140905599/1feef63e-c998-44a6-83dc-65403f3ef0cc">

<img width="1060" alt="Screenshot 2024-03-12 at 5 39 25 PM" src="https://github.com/aatmik-panse/FakeStoreCartAPI/assets/140905599/e148370b-96c7-4882-a2cc-30be5414bdb7">

<img width="1016" alt="Screenshot 2024-03-12 at 5 39 13 PM" src="https://github.com/aatmik-panse/FakeStoreCartAPI/assets/140905599/9098cd17-b7f7-45de-a7a1-b6d977e1faa4">

