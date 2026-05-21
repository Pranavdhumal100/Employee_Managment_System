# Order Management System (OMS)

A scalable and secure **Order Management System** built using **Microservices Architecture** with **Spring Boot**, **Netflix Eureka**, **API Gateway**, and **JWT Authentication**.

---

# 🚀 Project Overview

This project demonstrates a complete microservices-based backend system for managing users and orders with secure authentication and centralized service discovery.

The system includes:

- User Registration & Login
- JWT Based Authentication & Authorization
- Order Management APIs
- API Gateway Routing
- Eureka Service Discovery
- Inter-Service Communication
- Centralized Microservices Architecture

---

# 🏗️ Microservices Architecture

## Services Included

| Service Name | Description |
|---|---|
| Eureka Server | Service Registry & Discovery |
| API Gateway | Centralized API Routing |
| User Management Service | Handles user registration & authentication |
| Order Service | Manages order operations |
| JWT Security | Token-based authentication system |

---

# ⚙️ Tech Stack

## Backend
- Java
- Spring Boot
- Spring Security
- Spring Cloud
- Spring Data JPA

## Database
- MySQL / PostgreSQL

## Build Tool
- Maven

---

# 📂 Project Structure

```bash
Order-Management-System/
│
├── eureka-server/
├── api-gateway/
├── user-management-service/
├── order-service/
│
└── README.md
```

---

# 🔐 Authentication Flow

1. User registers using User Service
2. User logs in with credentials
3. JWT token is generated
4. Client sends JWT token in headers
5. API Gateway validates token
6. Authorized request forwarded to services

---

# ▶️ How to Run the Project

## Clone Repository

```bash
git clone https://github.com/your-username/order-management-system.git
```

## Start Eureka Server

```bash
cd eureka-server
mvn spring-boot:run
```

## Start API Gateway

```bash
cd api-gateway
mvn spring-boot:run
```

## Start User Service

```bash
cd user-management-service
mvn spring-boot:run
```

## Start Order Service

```bash
cd order-service
mvn spring-boot:run
```

---

# 📸 Features

✅ Microservices Architecture  
✅ API Gateway Routing  
✅ Eureka Service Discovery  
✅ JWT Authentication  
✅ Secure REST APIs  
✅ User Management  
✅ Order Management  
✅ Scalable Design  
✅ Spring Security Integration  

---

# 👨‍💻 Author

## Pranav Dhumal

