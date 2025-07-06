
# Inserting data in to Address Table;
INSERT IGNORE into `address` (`id`, `street`, `city`, `state`, `zip`, `country`) VALUES ('1', '101 University Ave', 'Houston', 'TX', '77090', 'USA');
INSERT IGNORE into `address` (`id`, `street`, `city`, `state`, `zip`, `country`) VALUES ('2', '100 University Ave', 'Dallas', 'TX', '77001', 'USA');
INSERT IGNORE into `address` (`id`, `street`, `city`, `state`, `zip`, `country`) VALUES ('3', '102 University Ave', 'Austin', 'TX', '77002', 'USA');

# Inserting data into Supplier table;
Insert IGNORE into `supplier` (`id`, `company_name`, `contact_name`, `phone`, `country`, `address_id`)  VALUES ('1', 'Saugat Supplier Pvt. Ltd.', 'Saugat Thapa', '0000000000', 'USA', '1');
Insert IGNORE into `supplier` (`id`, `company_name`, `contact_name`, `phone`, `country`, `address_id`)  VALUES ('2', 'Sushmita Supplier Pvt. Ltd.', 'Sushmita Karki', '1111111111', 'USA', '2');
Insert IGNORE into `supplier` (`id`, `company_name`, `contact_name`, `phone`, `country`, `address_id`)  VALUES ('3', 'Saroj Supplier Pvt. Ltd.', 'Saroj Bogati', '3333333333', 'USA', '3');

# Inserting data into Category table;
Insert IGNORE into `category` (`id`, `name`, `description`) Values('1', 'Fruit', '');
Insert IGNORE into `category` (`id`, `name`, `description`) Values('2', 'Vegetable', '');
Insert IGNORE into `category` (`id`, `name`, `description`) Values('3', 'Bakery', '');

#Inserting data into Product table;
Insert IGNORE into `product` (`id`, `name`, `quantity_per_unit`, `unit_price`, `units_in_stock`, `supplier_id`, `category_id`) VALUES ('1', 'Banana', '1', '0.59', '500', '1', '1');
Insert IGNORE into `product` (`id`, `name`, `quantity_per_unit`, `unit_price`, `units_in_stock`, `supplier_id`, `category_id`) VALUES ('2', 'Cauliflower', '1', '3.00', '100', '2', '2');
Insert IGNORE into `product` (`id`, `name`, `quantity_per_unit`, `unit_price`, `units_in_stock`, `supplier_id`, `category_id`) VALUES ('3', 'Croissant', '10', '5.00', '20', '3', '3');
Insert IGNORE into `product` (`id`, `name`, `quantity_per_unit`, `unit_price`, `units_in_stock`, `supplier_id`, `category_id`) VALUES ('4', 'Apple', '1', '1.49', '100', '1', '1');
Insert IGNORE into `product` (`id`, `name`, `quantity_per_unit`, `unit_price`, `units_in_stock`, `supplier_id`, `category_id`) VALUES ('5', 'Mushroom', '1', '3.50', '50', '2', '2');
Insert IGNORE into `product` (`id`, `name`, `quantity_per_unit`, `unit_price`, `units_in_stock`, `supplier_id`, `category_id`) VALUES ('6', 'Bread', '1', '2.00', '25', '3', '3');

# Inserting data into Employee table;
Insert IGNORE into `employee` (`id`,`first_name`,`last_name`,`title`,`birth_date`,`hire_date`,`phone`, `address_id`) VALUES ('1', 'Saugat', 'Thapa', 'ADMIN', '2000-01-01', '2025-05-01', '1000000000', '1');
Insert IGNORE into `employee` (`id`,`first_name`,`last_name`,`title`,`birth_date`,`hire_date`,`phone`, `address_id`) VALUES ('2', 'Sristi', 'Acharya', 'STAFF', '2001-01-01', '2025-07-01', '2111111111', '2');
Insert IGNORE into `employee` (`id`,`first_name`,`last_name`,`title`,`birth_date`,`hire_date`,`phone`, `address_id`) VALUES ('3', 'Sanjay', 'Kunwar', 'STAFF', '2001-01-01', '2025-07-01', '3222222222', '3');

# Inserting data into Shipper table;
Insert IGNORE into `shipper` (`id`, `company_name`, `phone`) VALUES ('1', 'ABC Pvt. Ltd.', '1100000000');
Insert IGNORE into `shipper` (`id`, `company_name`, `phone`) VALUES ('2', 'XYZ Pvt. Ltd.', '2200000000');
Insert IGNORE into `shipper` (`id`, `company_name`, `phone`) VALUES ('3', 'S&J Pvt. Ltd.', '3300000000');

# Inserting data into Customer table;
Insert IGNORE into `customer` (`id`,`company_name`,`contact_name`,`phone`,`address_id`) VALUES ('1','','Khusboo Tiwari','1110000000','1');
Insert IGNORE into `customer` (`id`,`company_name`,`contact_name`,`phone`,`address_id`) VALUES ('2','','Srijan Shrestha','2220000000','2');
Insert IGNORE into `customer` (`id`,`company_name`,`contact_name`,`phone`,`address_id`) VALUES ('3','','Samir Thapa','3330000000','3');

# Inserting data into Order table;
Insert Ignore into `orders` (`id`, `order_date`, `require_date`, `shipped_date`, `ship_via`, `ship_address_id`, `customer_id`, `employee_id`)
    VALUES ('1', '2025-07-03', '2025-07-03', '2025-07-03', 'road', '1', '1', '2');

Insert Ignore into `orders` (`id`, `order_date`, `require_date`, `shipped_date`, `ship_via`, `ship_address_id`, `customer_id`, `employee_id`)
    VALUES ('2', '2025-07-01', '2025-07-02', '2025-07-02', 'road', '2', '2', '3');

Insert Ignore into `orders` (`id`, `order_date`, `require_date`, `shipped_date`, `ship_via`, `ship_address_id`, `customer_id`, `employee_id`)
    VALUES ('3', '2025-07-02', '2025-07-02', '2025-07-02', 'road', '3', '3', '2');

# Inserting data into OrderDetail table;
Insert ignore into `order_detail` (`id`, `unit_price`, `quantity`, `discount`, `product_id`, `order_id`) VALUES ('1', '2.00', '1', '0.0', '6', '1');
Insert ignore into `order_detail` (`id`, `unit_price`, `quantity`, `discount`, `product_id`, `order_id`) VALUES ('2', '3.50', '2', '0.0', '5', '2');
Insert ignore into `order_detail` (`id`, `unit_price`, `quantity`, `discount`, `product_id`, `order_id`) VALUES ('3', '0.59', '5', '0.0', '1', '3');