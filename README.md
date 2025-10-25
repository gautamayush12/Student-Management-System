# 🎓 Student Management System (Spring Boot)

A simple **CRUD-based Spring Boot** project built for learning purposes.  
This application manages student details (create, read, update, delete) using **Spring Boot**, **Lombok**, **ModelMapper**, and **PostgreSQL**.

---

## 🧰 Tech Stack
- **Spring Boot** (Web, JPA)
- **PostgreSQL** (Database)
- **Lombok** (Boilerplate reduction)
- **ModelMapper** (Entity-DTO mapping)
- **Maven** (Dependency management)
- **Postman** (API testing)

---

## 🚀 Features
✅ Get all students  
✅ Get student by ID  
✅ Create new student  
✅ Update existing student (PUT)  
✅ Delete student  
✅ Partial update using PATCH  
✅ Request validation with annotations (`@Valid`, `@NotBlank`, etc.)

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone hhttps://github.com/gautamayush12/Student-Management-System.git
cd Student-Management-System

### 2️⃣ Configure PostgreSQL
Create a database, for example:
CREATE DATABASE student_db;

Update your application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

### 3️⃣ Run the project:
mvn spring-boot:run

