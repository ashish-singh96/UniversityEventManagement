# University Event Management
University Event Management is a Spring Boot application designed to manage events and students in a university setting. It provides endpoints to add, update, delete, and retrieve student and event information. The project uses an H2 in-memory database for data storage.

## Technologies Used
Java<br>
Spring Boot<br>
Spring Data JPA<br>
H2 Database<br>
### Getting Started
To run the University Event Management application locally, follow these steps<br>

Open the project in your preferred IDE (e.g., IntelliJ, Eclipse, etc.).<br>

Configure the H2 database in the src/main/resources/application.properties file if necessary.<br>

Build the project using Maven or your IDE's build tool.<br>

Run the application. You can either run it directly from your IDE or use the following command in the project's root directory:<br>

### API Endpoints
The University Event Management application exposes the following endpoints:

## Students
POST /students: Add a new student.<br>
PUT /students/{studentId}/department?department={department}: Update the department of a student.<br>
DELETE /students/{studentId}: Delete a student.<br>
GET /students: Get all students.<br>
GET /students/{studentId}: Get a student by ID.<br>
### Events
POST /events: Add a new event.<br>
PUT /events/{eventId}: Update an event.<br>
DELETE /events/{eventId}: Delete an event.<br>
GET /events: Get all events.<br>
GET /events/date?date={date}: Get all events on a specific date.<br>
### Models
The application uses the following models:

### Student
studentId (Long): The ID of the student.<br>
firstName (String): The first name of the student. (Validation: First letter should be capital)<br>
lastName (String): The last name of the student.<br>
age (int): The age of the student. (Validation: Between 18 and 25)<br>
department (Enum: Department): The department of the student. (Validation: Enum values: ME, ECE, CIVIL, CSE)<br>
### Event
eventId (Long): The ID of the event.<br>
eventName (String): The name of the event.<br>
locationOfEvent (String): The location of the event.<br>
date (LocalDate): The date of the event.<br>
startTime (LocalTime): The start time of the event.<br>
endTime (LocalTime): The end time of the event.<br>
### Validation
The following validations are applied to the student model:

age: Must be between 18 and 25.<br>
firstName: First letter should be capital.<br>
department: Must be one of the following values: ME, ECE, CIVIL, CSE.<br>

# Description
The University Event Management project is a web application designed to simplify and streamline the management of events and students in a university setting. It provides a user-friendly interface for administrators to create, update, and delete events, as well as manage student registrations.

### Key Features
Event Management: The application allows administrators to create new events by providing essential information such as event name, location, date, start time, and end time. Events can be updated or deleted as needed.<br>

Student Registration: Students can register for events by providing their details, including student ID, first name, last name, age, and department. The application validates the provided information, such as the age being within a specific range and the first name having a capitalized first letter.<br>

Department Management: The student department is managed through the application, ensuring that only valid department values (ME, ECE, CIVIL, CSE) are accepted.<br>

Date-Based Event Filtering: Events can be filtered based on specific dates, allowing administrators to view all events scheduled for a particular day.<br>

### Technologies Used
The University Event Management project is built using the following technologies:<br>

Java: The core programming language for the application's backend logic.<br>
Spring Boot: A Java framework that provides a simplified way to create Spring-based applications.<br>
Spring Data JPA: A Spring framework that provides an abstraction layer for interacting with the database.<br>
H2 Database: An in-memory database used for storing and retrieving event and student data.<br>
Maven: A build automation tool used for managing dependencies and building the project.<br>


### API Endpoints
The University Event Management application provides a set of RESTful API endpoints to perform various operations on events and students. These endpoints can be accessed using tools like Postman or integrated into a frontend application.

### Future Enhancements
The University Event Management project can be further enhanced with the following features:<br>

User Authentication: Implement a secure authentication mechanism to ensure only authorized administrators can access and manage events.<br>

Email Notifications: Send email notifications to students for event registration confirmation, event updates, and event reminders.<br>

Student Attendance Tracking: Implement functionality to track student attendance at events, providing valuable insights for future event planning.<br>

Event Categories and Tags: Introduce categories and tags to classify events, making it easier for students to search and discover events of interest.<br>
