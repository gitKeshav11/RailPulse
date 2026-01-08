# 🚆 RailPulse – Train Finder & Backend API

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![REST API](https://img.shields.io/badge/REST-API-black?style=for-the-badge)
![Open Source](https://img.shields.io/badge/Open%20Source-Contributions-purple?style=for-the-badge)

---

## 📌 About The Project

**RailPulse** is a backend application built using **Java & Spring Boot** that provides fast, reliable, and structured train-related data through RESTful APIs.  
This project follows clean backend architecture and real-world development practices.

---

## ✨ Features

- 🔍 Search trains between source & destination  
- 🕒 Train schedules and timings  
- 🚉 Station-wise train lookup  
- ⚙️ RESTful API architecture  
- 🗄️ MySQL database integration  
- 🛡️ Clean & scalable backend code  

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **MySQL**
- **Hibernate / JPA**
- **Maven**
- **REST API**
- **Git & GitHub**

---

## 📂 Project Structure

```
RailPulse/
│
├── src/
│   ├── main/
│   │   ├── java/com/railpulse/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   └── model/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│
├── pom.xml
└── README.md
```

---

## 🚀 Getting Started

### ✅ Prerequisites
- Java 17+
- Maven
- MySQL
- Git

### 🔧 Installation & Run

```bash
git clone https://github.com/gitKeshav11/RailPulse.git
cd RailPulse
mvn clean install
mvn spring-boot:run
```

---

## 🌐 API Documentation

**Base URL**
```
http://localhost:8080/api
```

### 📍 Get All Trains
```
GET /trains
```

### 📍 Get Train By ID
```
GET /trains/{id}
```

### 📍 Search Trains
```
GET /trains/search?source=Delhi&destination=Mumbai
```

### 📍 Add New Train
```
POST /trains
```

**Request Body**
```json
{
  "trainName": "Rajdhani Express",
  "source": "Delhi",
  "destination": "Mumbai",
  "departureTime": "16:30"
}
```

---

## 📸 Screenshots & Demo

### 🔹 API Testing (Postman)
![Postman Screenshot](screenshots/postman-api.png)

### 🔹 Database Records
![Database Screenshot](screenshots/database.png)

### 🎥 Demo GIF
![RailPulse Demo](demo/railpulse-demo.gif)

---

## 🚀 Future Enhancements

- 🔐 JWT Authentication  
- 📊 Admin Dashboard  
- 📱 Frontend Integration  
- ☁️ Cloud Deployment  

---

## 🤝 Contributing

Contributions are welcome!  
Fork the repository and submit a pull request.

---

## 👨‍💻 Author

**Keshav Upadhyay**  
Java Backend Developer | Spring Boot | REST APIs  

🔗 GitHub: https://github.com/gitKeshav11  
🔗 LinkedIn: https://www.linkedin.com/in/keshavupadhyayje/

---

## ⭐ Support

If you like this project, please give it a ⭐ on GitHub.  
Your support motivates me to build more projects 🚀
