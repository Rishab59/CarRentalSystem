CREATE DATABASE CarRentalDB;
USE CarRentalDB;

CREATE TABLE Vehicle (
    vehicleID INT AUTO_INCREMENT PRIMARY KEY,
    make VARCHAR(50),
    model VARCHAR(50),
    year INT,
    dailyRate DOUBLE,
    status VARCHAR(20),
    passengerCapacity INT,
    engineCapacity DOUBLE
);

SELECT * FROM Vehicle;

CREATE TABLE Customer (
    customerID INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    email VARCHAR(100),
    phoneNumber VARCHAR(15)
);

SELECT * FROM Customer;

CREATE TABLE Lease (
    leaseID INT AUTO_INCREMENT PRIMARY KEY,
    vehicleID INT,
    customerID INT,
    startDate DATE,
    endDate DATE,
    type VARCHAR(20),
    FOREIGN KEY (vehicleID) REFERENCES Vehicle(vehicleID),
    FOREIGN KEY (customerID) REFERENCES Customer(customerID)
);

SELECT * FROM Lease;

CREATE TABLE Payment (
    paymentID INT AUTO_INCREMENT PRIMARY KEY,
    leaseID INT,
    paymentDate DATE,
    amount DOUBLE,
    FOREIGN KEY (leaseID) REFERENCES Lease(leaseID)
);

SELECT * FROM Payment;

SHOW TABLES;

DESC Lease;

ALTER TABLE Lease ADD COLUMN status VARCHAR(10) DEFAULT 'active';
