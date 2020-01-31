#INSERTS MADE INTO TABLE
INSERT INTO employees_types (description) VALUES ("Seller");
INSERT INTO employees_types (description) VALUES ("Stock_charger");
INSERT INTO employees_types (description) VALUES ("Admin");
INSERT INTO products_types (name) VALUES ("Keyword");
INSERT INTO products_types (name) VALUES ("Mouse");
INSERT INTO products_types (name) VALUES ("Ram");
INSERT INTO products_types (name) VALUES ("Headphones");
INSERT INTO persons (name, lastname, address) VALUES ("Sandino", "Sanchez", "anystreet 223");
INSERT INTO employees (person_idperson, employees_types) VALUES (1, 2);
INSERT INTO persons (name, lastname, address) VALUES ("Luca", "De Maio", "anystreet 223");
INSERT INTO clients (person_idperson, last_buy) VALUES (2 ,null);
INSERT INTO sells (clients_person_idperson, employees_person_idperson) VALUES (2, 1);
INSERT INTO products (description, sell_price, buy_price, products_types) VALUES ("Keyword", 20, 10, 1);

INSERT INTO sells_details (sells_idsells, products_idproducts) VALUES (1, 1);

#SELECTS MADE TO THE TABLE
SELECT * FROM employees_types;
SELECT * FROM clients;
SELECT * FROM sells;
SELECT * FROM products;
SELECT * FROM products_types;
SELECT * FROM persons;
SELECT * FROM sells_details;
SELECT * FROM employees;



ALTER TABLE person RENAME TO persons;
ALTER TABLE products;


DELETE FROM persons 
WHERE idperson = 2;