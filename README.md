## 🧠 Be_Delulu Booking API
Be_Delulu Booking API is a lightweight Spring Boot backend service designed to simulate a real-world user management and booking system.
It demonstrates REST API design, layered architecture, and integration with PostgreSQL using Spring Data JPA.

## ✨ Vision: Clean Backend, Real-World Structure

## This project is part of the Be Delulu ecosystem, built to strengthen backend engineering skills through real-world patterns like:

## RESTful API design
🔹 Layered architecture (Controller → Service → Repository)

🔹 Database integration (PostgreSQL)

🔹 DTO-ready structure for scalability

## 🎯 Mission

🔹 Build production-style backend systems for portfolio readiness

🔹 Practice real-world Spring Boot architecture patterns

🔹 Prepare for cloud-ready deployment (Azure / Firebase frontend integration)

🔹 Showcase backend engineering skills for junior roles

## 🧱 Tech Stack
🔹 Java 17

🔹 Spring Boot 4

🔹 Spring Web (REST APIs)

🔹 Spring Data JPA

🔹 PostgreSQL

🔹 Maven

## 🧩 Core Features
👤 User Management API (CRUD-ready structure)

📡 RESTful endpoints (GET /users, POST /users)

🗄️ PostgreSQL integration via JPA

⚙️ Layered architecture (Controller, Service, Repository)

🔄 Extensible design for DTOs, validation, and authentication

## 🏗 Architecture
Controller → Service → Repository → PostgreSQL

## Layers:
🔹 Controller → Handles HTTP requests

🔹 Service → Business logic layer

🔹 Repository → Database access (JPA)

🔹 Model → Entity mapping

## 🚧 Challenges Faced
🔹 Initial 404 routing issues due to missing endpoint mapping validation

🔹 Git remote misconfiguration during first commit setup

🔹 Maven lifecycle command errors (clean./mvnw)

🔹 Understanding Spring Boot auto-configuration behavior

## 🛠 Solutions
🔹 Fixed REST routing by confirming @RestController and @RequestMapping("/users")

🔹 Cleaned and restructured Git remote configuration

🔹 Separated Maven commands correctly (./mvnw clean → ./mvnw spring-boot:run)

🔹 Verified Spring Boot component scanning structure

## 📌 API Endpoints
## Method	Endpoint	Description :

🔹 GET	/users	Fetch all users

🔹 POST	/users	Create new user
