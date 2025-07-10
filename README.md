# 🛠️ Spring Boot REST API for LMS Batch & Program Management

This project is a Spring Boot-based RESTful API built to manage Learning Management System (LMS) entities: `tbl_lms_batch` and `tbl_lms_program`. It demonstrates full CRUD operations, entity relationships, field-level validations, and best practices in REST API development using Spring Boot and Spring Data JPA.

---

## 📚 Project Requirements

1. Implement **CRUD** (GET, POST, PUT, DELETE) operations for:
   - `tbl_lms_batch`
   - `tbl_lms_program`

2. Identify and implement the **relationship** between these two tables (based on `LMS_DB-ER Diagram.jpg`), and develop a `GET` method to retrieve related data accordingly.

3. Include **field-level validations** for all incoming data.

---

## 🧰 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate Validator
- PostgreSQL (or H2 for testing)
- Maven
- Swagger UI (for API documentation)

---

## 📁 API Endpoints

### 🎓 Program Endpoints

| Method | Endpoint             | Description              |
|--------|----------------------|--------------------------|
| GET    | `/programs`          | Get all programs         |
| POST   | `/programs`          | Create new program       |
| PUT    | `/programs/{id}`     | Update program by ID     |
| DELETE | `/programs/{id}`     | Delete program by ID     |

---

### 🗂️ Batch Endpoints

| Method | Endpoint             | Description              |
|--------|----------------------|--------------------------|
| GET    | `/batches`           | Get all batches          |
| POST   | `/batches`           | Create new batch         |
| PUT    | `/batches/{id}`      | Update batch by ID       |
| DELETE | `/batches/{id}`      | Delete batch by ID       |

---

### 🔗 Relationship Endpoint

| Method | Endpoint                             | Description                                      |
|--------|--------------------------------------|--------------------------------------------------|
| GET    | `/programs/{programId}/batches`       | Get all batches for a specific program           |

---

## ✅ Validations Included

- Required fields using `@NotNull`, `@NotBlank`
- Custom error messages for failed validation

---

## 🚀 How to Run

### Using Maven Wrapper

```bash
./mvnw spring-boot:run

Author
Swatisha Raj
Java Developer | Spring Boot Enthusiast
