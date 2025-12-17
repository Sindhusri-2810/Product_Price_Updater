# Product_Price_Updater
 OBJECTIVE:
          To update the price of a product by entering the product ID and new price using JDBC.

 DESCRIPTION:
           This is a Java console-based application.
           The user enters a product ID and a new price.
           Using JDBC, the program updates the product’s price in the database.

This project demonstrates:
                     JDBC connection
                     UPDATE SQL query
                     PreparedStatement
                     executeUpdate() for update count
                     Exception handling

 Technologies Used:
                  Java
                  JDBC
                  MySQL
                  Eclipse IDE

Database Design:
       Create Database & Table
              CREATE DATABASE shop;
              USE shop;
              CREATE TABLE products (
              id INT PRIMARY KEY,
              name VARCHAR(50),
              price DOUBLE
              );

Insert Sample Data

INSERT INTO products VALUES
(1, 'Pen', 10.00),
(2, 'Notebook', 50.00),
(3, 'Bag', 800.00);

 Sample Output:
        Enter Product ID:
                      1
        Enter New Price:
                   15.00
Product price updated successfully

If product ID does not exist:
       Product ID not found



