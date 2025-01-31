# 🚀 Spring Boot JPA CRUD Demo  

A simple **Spring Boot REST API** for managing employees using **Spring Boot, Spring Data JPA, and MySQL**.  

## 📌 Features  
✅ Add a new employee  
✅ Retrieve all employees  
✅ Retrieve an employee by ID  
✅ Update an employee’s details  
✅ Delete an employee  
✅ Filter employees by **role** and **department**  

---

## 🛠️ Tech Stack  
🔹 **Java 17+**  
🔹 **Spring Boot 3.x**  
🔹 **Spring Data JPA**  
🔹 **MySQL**  
🔹 **Hibernate**  
🔹 **Maven**  

---

## ⚙️ Setup & Installation  

### 🔹 1. Clone the Repository  
```bash
git clone https://github.com/Bothinath-B/SpringBootJPADemo.git
cd SpringBootJPADemo
```

### 🔹 2. Configure Database  
Edit `src/main/resources/application.properties`:  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 🔹 3. Build & Run  
```bash
mvn clean install
mvn spring-boot:run
```

---

## 📌 API Endpoints  

| Method | Endpoint | Description |
|--------|----------|------------|
| **GET** | `/getAllEmployee` | Get all employees |
| **POST** | `/setEmployee` | Add a new employee |
| **GET** | `/getEmpById/{id}` | Get employee by ID |
| **PUT** | `/updateEmp/{id}` | Update employee details |
| **DELETE** | `/removeEmp/{id}` | Delete an employee |
| **GET** | `/getEmpByRole/{role}` | Get employees by role |
| **GET** | `/getEmpByRoleAndDept?role=role&dept=dept` | Get employees by role and department |

---

## 📂 Project Structure  
```
SpringBootJPADemo
├── src/main/java/com/example/SpringBootJPADemo
│   ├── Controller
│   │   ├── EmployeeController.java
│   ├── Model
│   │   ├── Employee.java
│   ├── Repository
│   │   ├── EmployeeRepository.java
│   ├── Service
│   │   ├── EmployeeService.java
│   ├── SpringBootJpaDemoApplication.java
│
├── src/main/resources
│   ├── application.properties
│
├── pom.xml
└── README.md
```

---


### 🔥 Happy Coding! 🚀  
