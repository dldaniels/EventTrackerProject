# EventTrackerProject

## Overview part 1
This project is a Spring JPA event tracker to track runs. The goal of this project is to implement full CRUD and map API endpoints. All endpoints can be tested and verified with postman.

## Overview part 2
Phase 2 of this project is to build upon the existing features by adding a javascript front end.

## Overview part 3
Phase 3 of this project requires to build an angular front end to replace the javascript one that was build in phase 2.

## Login Information
Access to DB

mysql -u run -p rundb

-p = run


## REST API Endpoints

Below are the api endpoints in use on this project. Enter the route for each function in postman for testing. There are currently 9 runs in the DB for testing purposes. These 9 runs may be edited or deleted. Any additional runs added will be assigned an ID number starting at 10.

|Return Type   |        | Route    | Functionality |
|----------|-------------|--------|-------------|
| `List<Run>` | GET  | api/runs | Show List of All Runs |
| Run | GET | api/runs/{runId} | Show Individual Run by ID |
| Run | POST | api/runs | Create a new Run |
| Run | PUT | api/runs/{runId} | Updates an existing Run by ID |
| Void | DELETE | api/runs/{runId} | Deletes an existing Run by ID |


## Technologies Used
* Spring Boot
* Spring Data JPA
* REST API
* Postman
* Java
* MySQL
* MySQL Workbench
* JSON
* Javascript
* DOM manipulation
* Request methods (GET/POST/PUT/DELETE)

## Key Lessons Learned
* Phase 1
This project was fun and quite simple for the most part but thats not to say i did not have to overcome a few hurdles along the way. Being able to view the created runs in postman during the create test is not happening but am getting a 201 message and can view them after the fact. I am not certain how crucial this is for the moment but will continue research for a resolution. Throughout this week many of the API topics were a little confusing at times but this project certainly helped in obtaining a better understanding.
* Phase 2
This phase of the project we began learning Javascript. This was a bit of a struggle for me based on just outside circumstances that came up and distracted me from being able to give all of my focus and attention on the material. Overall I was able to piece concepts together but am not entirely comfortable with what is actually going on here. I certainly look forward to getting more practice with javascript going forward.
* Phase 3
Phase 3 we began diving into Angular. Working with Angular was at first rather confusing at times. Throughout the week and toward the end I found myself growing more comfortable with it. It is something I certainly need more practice on to become more familiar and comfortable.

## How To Run
Run Tracker will track runs and display to user. Run Tracker home page provides a list of all runs in a scrolling table. When the user selects to view a run they are shown an update run form to update any of the fields of that run. Underneath the list of runs is an add run form which the user can add input to create a new run.
