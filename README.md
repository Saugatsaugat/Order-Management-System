# Order Management System

A backend-based **Order Management System** developed using **Java** and modern backend technologies to manage customer orders, inventory, and order processing efficiently.

This project demonstrates concepts of backend development, REST APIs, database integration, and scalable application architecture.

---

## Features

- Create and Manage Orders
- Update Order Details
- Delete Orders
- Retrieve Order Information
- Inventory/Item Management
- RESTful API Architecture
- Database Integration
- Clean Backend Structure

---

## Technologies Used

- Java
- Spring Boot
- Spring Cloud
- Spring Security
- Maven
- MySQL
- REST APIs
- Docker
- Swagger API Documentation

---

## Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Saugatsaugat/Order-Management-System.git
```

---

### 2️⃣ Open the Project

Import the project into:

- IntelliJ IDEA
- Eclipse
- VS Code

---

### 3️⃣ Configure Database

Update your database configuration in:

```properties
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/order_management
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

### 4️⃣ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main Spring Boot application directly from your IDE.

---

## API Documentation

Swagger is integrated for API testing and documentation.

After running the project, open:

```bash
http://localhost:8080/swagger-ui/
```

---

## Docker Support

Build Docker Image:

```bash
docker build -t order-management-system .
```

Run Container:

```bash
docker run -p 8080:8080 order-management-system
```
---

## 👨‍💻 Author

Developed by [Saugat Thapa](https://github.com/Saugatsaugat)

---

## Repository

If you like this project, feel free to ⭐ the repository.

👉 Repository Link:  
:[contentReference[oaicite:0]{index=0}](https://github.com/Saugatsaugat/Order-Management-System)
