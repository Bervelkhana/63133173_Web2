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

-- Chèn dữ liệu vào bảng Admin
INSERT INTO Admin (admin_id, username, password, email) VALUES
(1, 'admin1', 'admin123', 'admin1@example.com'),
(2, 'admin2', 'admin456', 'admin2@example.com');

-- Chèn dữ liệu vào bảng Customer
INSERT INTO Customer (customer_id, username, password, email, address, phone_number) VALUES
(1, 'customer1', 'customer123', 'customer1@example.com', '123 Street, City', '123456789'),
(2, 'customer2', 'customer456', 'customer2@example.com', '456 Avenue, Town', '987654321');

-- Chèn dữ liệu vào bảng Category
INSERT INTO Category (category_id, name, description) VALUES
(1, 'Men', 'Clothing for men'),
(2, 'Women', 'Clothing for women'),
(3, 'Kids', 'Clothing for kids');

-- Chèn dữ liệu vào bảng Product
INSERT INTO Product (product_id, name, description, price, category_id) VALUES
(1, 'T-shirt', 'Cotton T-shirt', 19.99, 1),
(2, 'Jeans', 'Blue denim jeans', 39.99, 1),
(3, 'Dress', 'Floral print dress', 49.99, 2),
(4, 'Shorts', 'Kids cotton shorts', 14.99, 3);

-- Chèn dữ liệu vào bảng Order
INSERT INTO CusOrder (order_id, customer_id, order_date, total_amount, status) VALUES
(1, 1, '2024-04-01', 59.98, 'Shipped'),
(2, 2, '2024-04-02', 109.98, 'Processing');

-- Chèn dữ liệu vào bảng OrderDetail
INSERT INTO OrderDetail (order_detail_id, order_id, product_id, quantity, price) VALUES
(1, 1, 1, 2, 39.98),
(2, 1, 2, 1, 19.99),
(3, 2, 3, 1, 49.99),
(4, 2, 4, 2, 29.98);