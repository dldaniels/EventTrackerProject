# EventTrackerProject

## Overview
This project is a Spring JPA event tracker to track runs. The goal of this project is to implement full CRUD and map API endpoints. All endpoints can be tested and verified with postman.

## Login Information
Access to DB

mysql -u run -p rundb

-p = run


## REST API Endpoints

Below are the api endpoints in use on this project. Enter the route for each function in postman for testing.

|Return Type   |        | Route    | Functionality |
|----------|-------------|--------|-------------|
| List<Run> | GET  | api/runs | Show List of All Runs |
| Run | GET | api/runs/{runId} | Show Individual Run by ID |
| Run | POST | api/runs | Create a new Run |
| Run | PUT | api/runs/{runId} | Updates an existing Run by ID |
| Void | DELETE | api/runs/{runId} | Deletes an existing Run by ID |


## Technologies Used
*Spring Boot
*Spring Data JPA
*REST API
*Postman
*Java
*MySQL
*MySQL Workbench
*JSON

## Key Lessons Learned
This project was fun and quite simple for the most part but thats not to say i did not have to overcome a few hurdles along the way. Being able to view the created runs in postman during the create test is not happening but am getting a 201 message and can view them after the fact. I am not certain how crucial this is for the moment but will continue research for a resolution. Throughout this week many of the API topics were a little confusing at times but this project certainly helped in obtaining a better understanding.
