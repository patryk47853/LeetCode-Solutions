SELECT DISTINCT product_id, 10 AS price -- Select distinct product_id with price 10 as default
FROM Products
WHERE product_id NOT IN ( -- Exclude products with changes before or on 2019-08-16
    SELECT DISTINCT product_id
    FROM Products
    WHERE change_date <= '2019-08-16'
)
UNION
SELECT product_id, new_price AS price -- Union with the latest new_price for products with changes on or before 2019-08-16
FROM Products
WHERE (product_id, change_date) IN (
    SELECT product_id, MAX(change_date) AS date -- Find the latest change_date for each product on or before 2019-08-16
    FROM Products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
);
