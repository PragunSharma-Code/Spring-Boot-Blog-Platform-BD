# 🚀 Blog Application

Welcome to my first **Spring Boot** application! This is a backend REST API designed to handle blogging features, built as a learning milestone to master modern Java web development.

---

## 🛠️ Tech Stack & Tools

* **Backend:** Java 17 / Spring Boot 3
* **Build Tool:** Maven
* **Database:** H2 (In-Memory for development)
* **IDE:** IntelliJ IDEA
* **API Testing:** Postman / cURL

---

## ✨ Features

* **CRUD Operations:** Full create, read, update, and delete actions for blog posts.
* **Data Persistence:** Automatic database schema creation using Spring Data JPA.
* **RESTful Architecture:** Clean JSON responses adhering to HTTP standard methods.

---

## 🚀 Getting Started

Follow these steps to run the project locally on your machine.

### Prerequisites

Make sure you have the following installed:
* **Java Development Kit (JDK 17 or higher)**
* **Maven** (Optional: the project includes `mvnw` wrapper)

### Installation & Running

1. **Clone the repository:**
   ```bash
   git clone https://github.com
   cd blog
   ```

2. **Run the application using Maven:**
   ```bash
   ./mvnw spring-boot:run
   ```
   *(Use `mvnw.cmd spring-boot:run` if you are on Windows Command Prompt)*

3. **Verify it works:**
   Open your browser and navigate to `http://localhost:8080`.

---

## 🔌 API Endpoints (Preview)

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/api/posts` | Get all blog posts |
| **POST** | `/api/posts` | Create a new post |
| **GET** | `/api/posts/{id}` | Get a specific post by ID |
| **DELETE** | `/api/posts/{id}` | Delete a post |

---

## 📝 What I Learned

* Configuring a Spring Boot project using `
