# 📚 SStudentHub (Console + JDBC)

A simple Java-based console application that performs CRUD operations on student records using JDBC, designed with a clean modular architecture.

## ✅ Features

* ➕ **Add a new student** - Insert new student records with name, email, course, and age
* 📄 **View all students** - Display complete list of all registered students
* 🔍 **Search student by ID** - Find specific student using their unique ID
* 🔍 **Search student by Name** - Search students using partial or full name matching
* 🔍 **Search student by Course** - Filter students enrolled in a particular course
* 📝 **Update student details** - Modify existing student information
* ❌ **Delete student** - Remove student records from the database
* 💡 **Uses MySQL database with JDBC** - Reliable data persistence
* 🧱 **Modular design** - Clean separation of concerns with Service and DAO layers

## 📁 Project Structure

```
Student-Management-System/
│
├── src/
│   └── student/
│       └── management/
│           ├── db/
│           │   └── DatabaseConnection.java   # Handles MySQL connection
│           │
│           ├── service/
│           │   └── StudentService.java       # CRUD operations
│           │
│           └── MainApp.java                  # Menu & App runner
│
├── .classpath
├── .project
├── .gitignore
│
└── README.md                                 # Project documentation
```

## 🛠 Technologies Used

* **💻 Java** - JDK 17+ (Object-oriented programming language)
* **🗃 MySQL** - Database for persistent data storage
* **🔌 JDBC API** - Java Database Connectivity for database operations
* **📦 IDE** - Eclipse IDE (recommended) or IntelliJ IDEA
* **🖥️ Operating System** - Windows, macOS, or Linux

## 🗄 Database Configuration

### Step 1: Create MySQL Database

Open MySQL command line or MySQL Workbench and execute the following SQL commands:

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100),
  course VARCHAR(100),
  age INT
);
```

### Step 2: Update Database Credentials

Open `src/student/management/db/DatabaseConnection.java` and update your MySQL credentials:

```java
private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
private static final String USER = "root";
private static final String PASSWORD = "your_mysql_password";  // Change this
```

### Step 3: Download MySQL JDBC Driver

Download `mysql-connector-java-8.0.x.jar` from [MySQL Official Website](https://dev.mysql.com/downloads/connector/j/) and add it to your project's classpath.

**For Eclipse:**
1. Right-click on project → Build Path → Configure Build Path
2. Click "Add External JARs"
3. Select `mysql-connector-java-x.x.x.jar`
4. Click Apply and Close

## 🚀 How to Run

### Using Eclipse IDE

1. **Clone or Import the repository:**
   ```bash
   git clone https://github.com/YourUsername/Student-Management-System.git
   ```

2. **Import project into Eclipse:**
   - File → Import → Existing Projects into Workspace
   - Select the project folder
   - Click Finish

3. **Add MySQL JDBC Driver:**
   - Right-click on project → Build Path → Configure Build Path
   - Click "Add External JARs"
   - Select `mysql-connector-java-8.0.x.jar`
   - Click Apply and Close

4. **Run the application:**
   - Navigate to `src/student/management/MainApp.java`
   - Right-click → Run As → Java Application

```
```

## 📖 Usage Guide

Once the application runs, you'll see a menu with the following options:

```
========== Student Management System ==========
1. ➕ Add Student
2. 📄 View All Students
3. 🔍 Search Student by ID
4. 🔍 Search Student by Name
5. 🔍 Search Student by Course
6. 📝 Update Student Details
7. ❌ Delete Student
8. 🚪 Exit
==============================================
Enter your choice: 
```

### Class Responsibilities

**DatabaseConnection.java** - Database connectivity management
- Establishes MySQL connection
- Handles connection pooling
- Manages driver loading

**StudentService.java** - Business logic and CRUD operations
- Add student records
- Retrieve all students
- Search by ID, Name, Course
- Update student information
- Delete student records

**MainApp.java** - Application entry point and user interface
- Displays menu options
- Handles user input
- Calls service methods
- Manages application flow
---


## 👨‍💻 Author

**Shweta Nilkanth Narkhede**  
🔗 [GitHub Profile](https://github.com/Shwetannarkhede)

Feel free to fork this repository and contribute improvements!



---

**Happy Coding! 🚀**

*Last Updated: October 2025*
*Version: 1.0*
