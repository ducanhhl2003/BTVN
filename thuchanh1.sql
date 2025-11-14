CREATE DATABASE hk_1602_thuc_hanh_1;
use hk_1602_thuc_hanh_1
CREATE TABLE orders (
    created DATETIME,
    order_code INT,
    in_use VARCHAR(50),
    check_data VARCHAR(50),
    status VARCHAR(50),
    name VARCHAR(50),
    shipping VARCHAR(50)
);

INSERT INTO orders (created, order_code, in_use, check_data, status, name, shipping)
VALUES 
('2021-09-02 21:36', 1026, 'No', 'No', 'Unfulfilled', 'Testcustomer Doewith longname', 'Standard'),
('2021-10-17 08:40', 1026, 'No', 'No', 'Unfulfilled', 'My Name', 'Standard'),
('2021-10-30 10:28', 1026, 'No', 'No', 'Unfulfilled', 'My Name', 'Outside EU Express'),
('2021-10-30 10:54', 1027, 'No', 'No', 'Unfulfilled', 'My Name', 'Outside EU Express'),
('', 1105, 'No', 'No', 'Unfulfilled', 'My Name', 'Normal shipping'),
('2022-03-13 15:42', 1106, 'No', 'No', 'Unfulfilled', 'My Name', 'Normal shipping'),
('2022-10-18 09:31', 1107, 'No', 'No', 'Unfulfilled', 'Test Doe', 'Normal shipping'),
('2022-05-22 06:29', 1108, 'No', 'No', 'Unfulfilled', 'John Doe', 'Normal shipping'),
('2022-05-22 07:01', 1110, 'No', 'No', 'Partially fulfilled', 'John Doe', 'Normal shipping');

SELECT * 
FROM orders
WHERE shipping = 'Normal shipping';
SELECT * 
FROM orders
WHERE order_code >1100;
SELECT * 
FROM orders
WHERE name = 'John Doe';
SELECT * 
FROM orders
WHERE name = 'John Doe';
SELECT *
FROM orders
WHERE created > '2022-01-06 17:37';
SELECT *
FROM orders
WHERE check_data = 'Yes';
