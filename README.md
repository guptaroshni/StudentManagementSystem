# Student Management System

This is a Student Management System designed to ease the process of managing students and courses. The application is built using Spring Boot for creating a RESTful API, JPA with Hibernate for data persistence, and integrates Swagger for API documentation



## Features

### Admin/Owner Operations

1. *Admit Students:* The admin/owner can admit a student to the school by providing information such as name, date of birth, gender, and a unique student code. A student can have multiple addresses, including permanent, correspondence, and current addresses, with details like area, state, district, pincode, and address type.

2. *Upload Course Details:* The admin/owner can upload course details, including course name, description, course type, duration, and topics.

3. *Assign Courses:* Courses can be assigned to students. This creates a many-to-many relationship between students and courses.

4. *Search Students by Name:* The admin/owner can search for students by their names.

5. *Get Students Assigned to a Course:* The admin/owner can retrieve a list of students assigned to a particular course.

### Student Operations

1. *Update Profile:* Students can update their profile details, including email, mobile number, parents' name, and addresses.

2. *Search for Assigned Topics/Courses:* Students can search for topics or courses they have been assigned.

3. *Leave a Course:* Students can leave a course if needed.

## Implementation Details

The application follows a multi-layered architecture:

- *Entity Layer:* Contains the entity classes representing the data structures, including `Student`, `StudentAddress`, and `Course`.

- *Repository Layer:* Handles data access and interacts with the database. Includes repositories for `Student` and `Course`.

- *Controller Layer:* Contains RESTful API endpoints for performing various operations. It includes controllers for both admin/owner and student operations.

- *Business Layer:* Contains business logic and services to handle operations like admitting students, assigning courses, and managing profiles.

## Technologies Used

- Spring Boot: For creating a RESTful API.
- JPA with Hibernate: For data persistence and database interactions.
- Swagger: Integrated for API documentation.
- Unit Tests: Implemented for various layers (optional but recommended).
- DTO Layer: Can be added for mapping between DTOs and entities (optional).

## Setup and Usage

1. Clone the repository to your local machine.
2. Configure your database settings in the `application.properties` file.
3. Build and run the application.
4. Access the Swagger documentation for the API at `/swagger-ui.html`.

## API Endpoints

- *Admit Student:* `POST /api/students/admit`
- *Upload Course:* `POST /api/courses/upload`
- *Assign Course to Student:* `POST /api/students/{studentId}/assign-course/{courseId}`
- *Search Students by Name:* `GET /api/students/search?name={studentName}`
- *Get Students Assigned to a Course:* `GET /api/courses/{courseId}/students`
- *Update Student Profile:* `PUT /api/students/{studentId}/update-profile`
- *Search Student Assigned Topics/Courses:* `GET /api/students/{studentId}/assigned-courses`
- *Leave a Course:* `DELETE /api/students/{studentId}/leave-course/{courseId}`

## Authentication

Admin/Owner can log in using credentials via Postman or any other authentication mechanism you prefer.

Students can validate themselves using their unique student code and date of birth.

## Good Practices

- Implement unit tests to ensure the functionality of each layer.
- Consider adding a DTO (Data Transfer Object) layer for mapping between DTOs and entities for improved data validation and security.

Feel free to contribute to the project and improve its functionality and usability.

---

