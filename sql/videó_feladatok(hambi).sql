CREATE TABLE Products (
  id INT,
  `name` VARCHAR(255),
  description VARCHAR(255),
  price INT
);

INSERT INTO products (id, `name`, description, price, category_id) VALUES
  (1, 'hamburger', 'finom hambi', 1000, 1),
  (2, 'extra hús', 'plusz feltét', 300, 1),
  (3, 'pepsi cola', 'üdítőital', 400, 2),
  (4, 'coca cola', 'üdítőital', 400, 2);

CREATE TABLE Customers (
  id INT,
  `name` VARCHAR(100),
  contact VARCHAR(100),
  address VARCHAR(250),
  city VARCHAR(50),
  postal_code INT,
  country VARCHAR(50)
);


SELECT * FROM customers;


SELECT `name`, city FROM customers;


SELECT DISTINCT country FROM customers;


SELECT DISTINCT country AS 'Ország' FROM customers;


SELECT * FROM customers
WHERE country = 'Hungary';


SELECT * FROM customers
WHERE id = 1;


SELECT * FROM customers
WHERE id <> 1;


SELECT * FROM customers
WHERE id BETWEEN  2 AND 4;


SELECT * FROM customers
WHERE id IN (2, 4, 5);


SELECT * FROM customers
WHERE 
  country = 'Hungary'
  AND
  city = 'Budapest';

  
SELECT * FROM customers
WHERE 
  country = 'Hungary'
  OR
  city = 'Budapest';
  
  
SELECT * FROM customers
WHERE 
  NOT country = 'Germany';
  
  
SELECT * FROM customers
WHERE 
  country = 'Hungary'
  AND
  city = 'Berlin'
  OR
  city = 'Budapest';
  
  
  
SELECT * FROM customers
WHERE 
  country = 'Hungary'
  AND
  (
  city = 'Kecskemét'
  OR
  city = 'Budapest'
  );
  
  
SELECT * FROM customers
ORDER BY country;


SELECT * FROM customers
ORDER BY country, `name`;


SELECT * FROM customers
ORDER BY country DESC, `name`;


SELECT * FROM customers
ORDER BY country ASC, `name` DESC;


SELECT price
FROM products
WHERE id = 2;


SELECT MIN(price) AS Smallest_price
FROM products;


SELECT MAX(price) AS Largest_price
FROM products;

-- A NULL értéket nem számolja bele!!!!!
SELECT COUNT(id)
FROM products
WHERE category_id = 2;


SELECT COUNT(price)
FROM products
WHERE category_id = 2;


SELECT AVG(price)
FROM products
WHERE category_id = 2;


SELECT AVG(price)
FROM products;


SELECT SUM(price)
FROM products;


SELECT SUM(price)
FROM products
WHERE category_id = 1;


SELECT country
FROM customers
GROUP BY country;


SELECT category_id
FROM products
GROUP BY category_id; 


SELECT *
FROM customers
WHERE `name` LIKE 'a%';


SELECT *
FROM customers
WHERE `name` LIKE '%a%';


SELECT *
FROM customers
WHERE `name` LIKE '%er%';


SELECT *
FROM customers
WHERE `name` LIKE '_e%';


SELECT *
FROM customers
WHERE `name` LIKE '_e';


INSERT INTO customers 
  (id, `name`, contact, address, city, postal_code, country)
VALUES 
  (42, 'Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40006, 'Norway');
  
  
INSERT INTO customers 
VALUES 
  (43, 'Thor', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40006, 'Norway'),
  (44, 'Freya', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40006, 'Norway'),
  (45, 'Loki', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40006, 'Norway');
  
  
UPDATE customers
SET `name` = 'Alfred Schmidt', city = 'Frankfurt'
WHERE id = 1;


-- WHERE nélkül minden irányítószámot megváltoztat!!!!
-- UPDATE customers
-- SET postal_code = 6000;


UPDATE customers
SET postal_code = 40007
WHERE country = 'Norway';


-- WHERE nélkül a tábla egész tartalmát törli!!!!
-- DELETE FROM customers;


DELETE FROM customers
WHERE id = 6;


CREATE TABLE orders (
  id INT,
  customer_id INT,
  product_id INT,
  order_date TIMESTAMP
);


INSERT INTO orders
  VALUES 
    (1, 2, 1, NOW()),
    (2, 1, 3, NOW()),
    (3, 3, 3, NOW());
    
    
SELECT orders.id, customers.name, orders.order_date
FROM orders
  INNER JOIN customers ON orders.customer_id = customers.id;
  
  
SELECT p.*
FROM products p
  JOIN product_to_category ptc ON ptc.product_id = p.id
  JOIN categories c ON c.id = ptc.category_id
WHERE c.id = 1;


SELECT p.*
FROM products p
  JOIN product_to_category ptc ON ptc.product_id = p.id
  JOIN categories c ON c.id = ptc.category_id
ORDER BY c.id DESC, p.id;


-- selfjoin
SELECT A.`name` AS CustomerName1, B.`name` AS CustomerName2, A.city
FROM customers A, customers B
WHERE A.id <> B.id 
  AND A.city = B.city;
  

  
ALTER TABLE products
MODIFY `name` VARCHAR(100) NOT NULL CHECK (CHAR_LENGTH(`name`) > 5);

-- megszorítás miatt(name 5 karakternél több legyen) nem fut le
-- INSERT INTO products (id, `name`) VALUES (10, 'kapa');

INSERT INTO products (id, `name`) VALUES (5, 'extra sajt');



ALTER TABLE products
MODIFY `name` VARCHAR(100) NOT NULL UNIQUE CHECK (CHAR_LENGTH(`name`) > 5);

-- megszorítás miatt(name nem ismétlődhet) nem fut le
-- INSERT INTO products (id, `name`) VALUES (10, 'hamburger');



ALTER TABLE customers
ADD CONSTRAINT unique_name_pairs UNIQUE (`name`, contact);

-- megszorítás miatt(name contact pár nem ismétlődhet) nem fut le
-- INSERT INTO customers
-- (`name`, contact) VALUES ('Kiss Róbert', 'Nagy Dalma');

INSERT INTO customers
(`name`, contact) VALUES ('Kiss Róbert', 'Nagy Alma');

ALTER TABLE customers
DROP CONSTRAINT unique_name_pairs;



ALTER TABLE customers
MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT;

ALTER TABLE customers AUTO_INCREMENT = 48;



CREATE INDEX name_contact
ON customers (`name`, contact);



SELECT city FROM customers
UNION
SELECT city FROM suppliers;

SELECT city FROM customers
UNION ALL
SELECT city FROM suppliers;

SELECT city FROM customers WHERE country = 'Hungary'
UNION ALL
SELECT city FROM suppliers WHERE country = 'Hungary';

SELECT city FROM customers WHERE country = 'Hungary'
UNION
SELECT city FROM suppliers WHERE country = 'Hungary';



CREATE TABLE employees (
  tsz VARCHAR(50),
  nev VARCHAR(100),
  sz_helye VARCHAR(100),
  sz_ideje DATE,
  fiz INT
);

INSERT INTO employees VALUES
  ('T234578', 'Kiss István', 'Eger', '1968.12.11', 120000),
  ('T3443234', 'Kiss Timót', 'Eger', '1972.01.28', 105000),
  ('T456734', 'Nagy József', 'Budapest', '1972.01.30', 150000),
  ('T768545', 'Vári Ödön', 'Budapest', '1958.07.12', 210000),
  ('T429877', 'Kovács János', 'Szeged', '1967.05.12', 120000);

  
SELECT sz_helye AS 'Születési hely', 
  COUNT(tsz) AS 'A dolg. száma'
FROM employees
GROUP BY sz_helye;


SELECT sz_helye AS 'Születési hely', 
  SUM(fiz) AS 'Össz. fizetés',
  AVG(fiz) AS 'Átlag fizetés'
FROM employees
GROUP BY sz_helye;


SELECT sz_helye AS 'Születési hely', 
  SUM(fiz) AS 'Össz. fizetés',
  AVG(fiz) AS 'Átlag fizetés'
FROM employees
GROUP BY sz_helye
HAVING AVG(fiz) <= 120000;



ALTER TABLE products 
ADD PRIMARY KEY (id);

ALTER TABLE products 
MODIFY id INT NOT NULL AUTO_INCREMENT;


CREATE TABLE `log` (
  id INT NOT NULL AUTO_INCREMENT,
  message VARCHAR(500) NOT NULL,
  product_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (product_id) REFERENCES products (id)
); 

-- megszorítás miatt(product_id csak a products táblában már létező id lehet) nem fut le
-- INSERT INTO `log` (message, product_id)
-- VALUES ('m', 44);

INSERT INTO `log` (message, product_id)
VALUES ('m', 4);