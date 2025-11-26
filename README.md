# HexSoftwares_Employee_Leave_Management_System
📚 HexSoftwares Employee Leave Management System

A desktop-based Employee Leave Management System designed and developed to managing employee leave requests, approvals, and records. 
This system empowers employees to easily request time off, and provides managers and HR with the necessary tools for efficient approval workflows and tracking.
Employee Leave Management System in Java(using JFrame, Netbeans, MySQL)
Software Requirement:
1. Netbeans: https://netbeans.apache.org/front/main/download/nb13/nb13/
2. MySQL Version 5.5.41: https://downloads.mysql.com/archives/community/?version=5.5.41

Jar File:
1. JCalender-1.3.2:
   https://repo1.maven.org/maven2/com/toedter/jcalendar/1.3.2/jcalendar-1.3.2.jar

📖 About the Project

A desktop-based Employee Leave Management System designed and developed to managing employee leave requests, approvals, and records. 
This system empowers employees to easily request time off, and provides managers and HR with the necessary tools for efficient approval workflows and tracking.
This project provides a simple, interactive GUI to perform all major operations without needing complex database queries.

✨ Features

This system is built to provide a robust and seamless experience for all users involved in the leave management process.
Feature Category               Description
Employee Self-Service          Employees can view their real-time leave balances, track leave history, and apply for new leave through a user-friendly dashboard.
Multi-Level Workflow           Leave requests are automatically routed to the designated manager for approval, ensuring proper oversight and fast processing.
Automated Balance Tracking     Leave balances (vacation, sick, etc.) are automatically accrued and updated in real-time upon request submission and approval/rejection.
Custom Leave Policies          Administrators can define, configure, and assign various leave types, accrual rules, and carry-forward limits based on company or group policies.
Centralized Calendar           A team calendar view allows managers and peers to see approved leaves, helping to prevent staffing conflicts and ensure adequate coverage.
Role-Based Access Control (RBAC) Permissions are strictly managed based on user role (Employee, Manager, Admin).

Programming Language: Java (likely using Swing for GUI)

Database: MySQL

IDE: NetBeans / Eclipse

Version Control: Git & GitHub

Build Tool: Apache NetBeans Maven

💡 Update the exact technologies above if your implementation differs.

⚙️ Installation

Follow these steps to run the project on your local system:

Clone the Repository

git clone https://github.com/SnehalAjitPatil/HexSoftwares_Library_Management_System.git
cd HexSoftwares_Employee_Leave_Management_System


Open the Project in IDE

Use NetBeans or Eclipse.

Load the project as an existing Java project.

Setup Database

Open your MySQL server (e.g., XAMPP or MySQL Workbench).

Create a database:

CREATE DATABASE EmpLeaveMgtSys;


Import the SQL file provided in the repository - create databse EmpLeaveMgtSys.

Configure Database Connection

Update your database connection file with:

DB_URL = "jdbc:mysql://localhost:3306/EmpLeaveMgtSys";
DB_USER = "root";
DB_PASS = "yourpassword";


Run the Project

Build and run the main file (e.g., Main.java).

Login using default credentials (if seeded).

🧩 Project Modules
1. Login Page

Fields: Username and Password

If incorrect → Shows popup “Incorrect Username or Password.”

If correct → Navigates to the Home Page Admin or Employee(Username is Employee ID)

Includes an Exit button to close the application

2. Home Page

The first screen after successful login
Admin Home Page:
Contains Five functional buttons, each opening a different module:

Add New Employee

Set Leaves

Approve Leave

View Leaves of Employees

Exit

Employee Home Page:
Contains Four functional buttons, each opening a different module:

Update Employee Details

Apply for Leave

View Leaves by Employee

Exit

3.Add New Employee

Collects and stores details of new Employee

Two buttons:

Save – to save employee details to the database

Close – to exit this page

🚀 Usage Guide

Launch the application

Log in with valid credentials

Use the Home Page to:

Add students and books

Issue or return books

View statistics

Close pages safely using the Close or Exit buttons


The Source code Files are stored in Master Branch download them from there.


📬 Contact

Author: Snehal Ajit Patil

🔗 GitHub: https://github.com/SnehalAjitPatil

✉️ Email: patilaarti920@gmail.com
