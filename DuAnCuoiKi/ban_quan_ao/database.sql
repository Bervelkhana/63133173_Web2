CREATE DATABASE DUANCUOIKI
USE DUANCUOIKI

CREATE TABLE Admin (
    admin_id INT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(50),
    email VARCHAR(100)
);

-- Bảng Customer lưu thông tin về khách hàng
CREATE TABLE Customer (
    customer_id INT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(50),
    email VARCHAR(100),
    address VARCHAR(255),
    phone_number VARCHAR(15)
);

-- Bảng Category lưu thông tin về các loại sản phẩm
CREATE TABLE Category (
    category_id INT PRIMARY KEY,
    name VARCHAR(100) UNIQUE,
    description TEXT
);

-- Bảng Product lưu thông tin về các sản phẩm
CREATE TABLE Product (
    product_id INT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    price DECIMAL(10, 2),
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES Category(category_id)
);

-- Bảng Order lưu thông tin về các đơn hàng
CREATE TABLE CusOrder (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    total_amount DECIMAL(10, 2),
    status VARCHAR(20),
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);

-- Bảng OrderDetail lưu thông tin chi tiết về các mặt hàng trong đơn hàng
CREATE TABLE OrderDetail (
    order_detail_id INT PRIMARY KEY,
    order_id INT,
    product_id INT,
    quantity INT,
    price DECIMAL(10, 2),
    FOREIGN KEY (order_id) REFERENCES CusOrder(order_id),
    FOREIGN KEY (product_id) REFERENCES Product(product_id)
);