SELECT name AS Customers FROM customers WHERE id not in
(
    select customerId from orders 
);
