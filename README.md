# spring-microservices-demo
This repository contains a Maven multi-module project showcasing a set of Spring Boot microservices. Each microservice is developed as an independent Spring Boot application and managed under a single parent Maven project for dependency management and build consistency.
Spring Boot Microservices Architecture

This repository demonstrates a Microservices Architecture using Spring Boot, Spring Cloud, and Netflix Eureka.
It is a Maven multi-module project where each service is an independent Spring Boot application, managed under a single parent project.

📌 Services Included

🛒 order-service → Manages customer orders.

📦 product-service → Handles product catalog and inventory.

👤 user-service → Manages user accounts and profiles.

🌀 api-gateway → Centralized entry point for routing requests to services (uses Spring Cloud Gateway).

🔗 eureka-server → Service discovery and registration (Netflix Eureka).

📂 Project Structure
spring-microservices-demo/
 ├── pom.xml                 # Parent Maven configuration
 ├── order-service/          # Order microservice
 ├── product-service/        # Product microservice
 ├── user-service/           # User microservice
 ├── api-gateway/            # API Gateway (Spring Cloud Gateway)
 └── eureka-server/          # Service Discovery Server
