## Fawry OOP Task – Quantum Bookstore

## Overview
This project is a Java-based design for an online bookstore system, developed as part of an internship technical challenge. It demonstrates key Object-Oriented Programming (OOP) principles such as inheritance, polymorphism, encapsulation, and the Strategy Design Pattern to support extensibility and clean separation of concerns.

---

## Features
- Support for multiple book types:
  - **PaperBook**: Purchasable with limited stock, delivered via shipping
  - **EBook**: Purchasable and delivered via email
  - **DemoBook**: Showcase books that are not for sale
- Centralized inventory management:
  - Add new books by ISBN, title, author, year, and price
  - Remove outdated books based on publication year
  - Buy books by ISBN with quantity validation
- Delivery handling via strategy objects:
  - Email delivery for eBooks
  - Physical shipping for paper books
- Graceful error handling for:
  - Demo books being purchased
  - Out-of-stock conditions
  - Invalid or nonexistent ISBNs

---

## Technologies
- Java 17+
- No external libraries used

---

## Concepts Demonstrated
- Object-Oriented Design Principles (Abstraction, Encapsulation, Polymorphism)
- Strategy Design Pattern for delivery behaviors
- Interface-based design and composition
- Aggregation relationship for inventory
- Clear extensibility for new book types and delivery mechanisms

---

## How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/Nada-08/fawry-book-store-task.git

