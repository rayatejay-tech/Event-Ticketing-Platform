# Event Ticketing Platform

## Project Description
The Event Ticketing Platform is a Java-based mini project developed using Java, JDBC, and MySQL. It allows users to view available events, book tickets, update available seats, and store booking details in a MySQL database.

## Technologies Used
- Java
- JDBC
- MySQL
- VS Code

## Features
- View Available Events
- Book Event Tickets
- Update Available Seats
- Store Booking Details in MySQL
- Simple Console-Based Menu

## Project Structure
```
src/
├── Main.java
├── DBConnection.java
├── Event.java
├── Booking.java
├── User.java
└── LoadHandler.java
```

## Database
Database Name:
```
event_ticketing
```

Tables:
- users
- events
- bookings

## How to Run
1. Install JDK.
2. Install MySQL Server.
3. Create the `event_ticketing` database.
4. Create the `users`, `events`, and `bookings` tables.
5. Update database credentials in `DBConnection.java`.
6. Run `Main.java`.

## Sample Menu
```
===== EVENT TICKETING PLATFORM =====
1. View Events
2. Book Ticket
3. Exit
```

## Author
**Jay Rayate**

**Course:** MCA Mini Project
