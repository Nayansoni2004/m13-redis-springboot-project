# Spring Boot + Redis CRUD (m13)

A simple Spring Boot application demonstrating **Redis integration** using **Spring Data Redis**.  
Provides REST APIs to store and fetch `City` data.

---

## Tech Stack
- Java 17
- Spring Boot
- Spring Web MVC
- Spring Data Redis
- Jedis
- Redis (Cloud/Local)
- Maven
- STS

---

## Requirements
- Java 17
- Maven
- STS (Spring Tool Suite)
- Redis (Cloud or Local)
- Postman

---

## Configuration (`application.yml`)
```yaml
spring:
  data:
    redis:
      host: <host>
      port: <port>
      username: <username>
      password: <password>

server:
  port: 9090
