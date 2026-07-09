<div align="center">

# 🎓 Student Management System

### 🚀 Spring Boot • Java • MySQL • REST API

<img src="https://readme-typing-svg.demolab.com?font=Poppins&size=24&pause=1000&color=00BFFF&center=true&vCenter=true&width=700&lines=Student+Management+System;Spring+Boot+REST+API;Java+%7C+MySQL+%7C+Hibernate;Built+by+Ankit+Maurya" />

<br>

<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk">
<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge">
<img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven">
<img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git">
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github">



**A Spring Boot CRUD application to manage student records with validation, exception handling and custom search APIs.**

</div>

---

# ✨ Features

- ➕ Add Student
- 📋 Get All Students
- 🔍 Get Student By ID
- ✏️ Update Student
- ❌ Delete Student
- 👤 Search Student By Name
- 📚 Search Student By Course
- 🔎 Search Student By Name & Course
- 🎂 Search Students Age Less Than
- ✅ Bean Validation (`@Valid`, `@NotBlank`, `@NotNull`)
- ⚠️ Global Exception Handling (`@ControllerAdvice`)
- pagination
- sorting 
---

# 🛠️ Tech Stack

| Technology | Used |
|------------|------|
| ☕ Java | Java 21 |
| 🌱 Spring Boot | REST API |
| 🍃 Spring MVC | MVC Architecture |
| 🗄 Spring Data JPA | Database Operations |
| 💾 Hibernate | ORM |
| 🐬 MySQL | Database |
| 📦 Maven | Build Tool |
| 📮 Postman | API Testing |
| 🐙 Git & GitHub | Version Control |
| 💻 IntelliJ IDEA | IDE |

---

# 📂 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── exception
├── dto
└── resources
```

---

# 📡 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/students` | ➕ Add Student |
| GET | `/students` | 📋 Get All Students |
| GET | `/students/{id}` | 🔍 Get Student By ID |
| PUT | `/students/{id}` | ✏️ Update Student |
| DELETE | `/students/{id}` | ❌ Delete Student |
| GET | `/students/name/{name}` | 👤 Search By Name |
| GET | `/students/course/{course}` | 📚 Search By Course |
| GET | `/students/search?name=&course=` | 🔎 Search By Name & Course |
| GET | `/students/age/{age}` | 🎂 Age Less Than |

---

# 🛡️ Validation

- ✅ @Valid
- ✅ @NotBlank
- ✅ @NotNull

---

# ⚠️ Exception Handling

Implemented using **@ControllerAdvice**

Handles:

- ❌ Student Not Found Exception
- ❌ Validation Errors
- ❌ Bad Request
- ❌ Custom Exceptions

---

# 🗄️ Database

- 🐬 MySQL

---

# 📮 API Testing

- ✅ Postman

---

# ▶️ How to Run

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Ankit775490/student-management-system.git
```

### 2️⃣ Open Project

Open the project in **IntelliJ IDEA**

### 3️⃣ Configure Database

Update your **application.properties**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

### 4️⃣ Install Dependencies

```bash
mvn clean install
```

### 5️⃣ Run Application

Run the Spring Boot Application.

### 6️⃣ Test APIs

Open **Postman**

Test all endpoints.

---

# 🚀 Future Enhancements

- 📄 Swagger UI
- 🔐 Spring Security + JWT
- 📑 Pagination & Sorting
- 🧪 JUnit & Mockito
- 🐳 Docker
- ☁️ Deployment (Render / Railway / AWS)

---

# 👨‍💻 Author

## Ankit Maurya

🚀 Aspiring Java Full Stack Developer

⭐ If you like this project, don't forget to **Star ⭐** the repository.

---

<div align="center">

### ❤️ Happy Coding 🚀

</div>
