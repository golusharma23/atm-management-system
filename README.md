# atm-management-system

\# ATM Management System



An ATM Management System built using Spring Boot that provides REST APIs

for performing core banking operations such as balance enquiry, deposit,

and withdrawal. The project focuses on backend development, clean

architecture, and database integration.



\## 🚀 Features

\- Account balance enquiry

\- Deposit money into an account

\- Withdraw money with balance validation

\- Insufficient balance handling

\- Persistent data storage using MySQL

\- RESTful API design using Spring Boot



\## 🛠 Tech Stack

\- Java 21

\- Spring Boot

\- Spring Data JPA

\- Hibernate

\- MySQL

\- Maven



\## 📌 API Endpoints



\### Check Balance



GET /atm/balance/{accountNumber}





\### Deposit Money





POST /atm/deposit

Parameters:



accountNumber



amount





\### Withdraw Money





POST /atm/withdraw

Parameters:



accountNumber



amount





\## ▶️ How to Run

1\. Create a MySQL database

2\. Update database credentials in `application.properties`

3\. Run the project as a Spring Boot application

4\. Test APIs using browser or Postman



\## 📂 Project Structure

\- controller → REST API layer

\- service → Business logic

\- repository → Database access layer

\- model → Entity classes



\## 📌 Purpose

This project was developed to practice backend development using Spring Boot

and to gain hands-on experience with REST API design and database interaction.



