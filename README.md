# 🎓 Student Management System

A RESTful Student Management System built using Spring Boot, Spring Data JPA and MySQL. This project performs CRUD operations and provides custom search APIs to manage student records efficiently.

## 🚀 Features

- ➕ Add Student
- 📋 Get All Students
- 🔍 Get Student By ID
- ✏️ Update Student
- ❌ Delete Student
- 👤 Search Student By Name
- 📚 Search Student By Course
- 🔎 Search Student By Name And Course
- 🎂 Search Students Whose Age Is Less Than a Given Value

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- IntelliJ IDEA
- Postman
- Git & GitHub

## 📁 Project Structure

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 └── resources
```

## 📡 REST APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /students | Add Student |
| GET | /students | Get All Students |
| GET | /students/{id} | Get Student By ID |
| PUT | /students/{id} | Update Student |
| DELETE | /students/{id} | Delete Student |
| GET | /students/name/{name} | Get Student By Name |
| GET | /students/course/{course} | Get Student By Course |
| GET | /students/search?name=&course= | Get Student By Name And Course |
| GET | /students/age/{age} | Get Students Age Less Than |

## 🗄️ Database

- MySQL

## 🧪 Tested Using

- Postman

## 📌 Future Improvements

- Spring Security + JWT
- Validation
- Pagination & Sorting
- Swagger Documentation
- Docker
- Unit Testing

## 👨‍💻 Author

**Ankit Maurya**

⭐ If you like this project, don't forget to star the repository.
