SELECT COUNT(customer_id) AS rich_count
FROM (
    SELECT SUM(amount) as amount, COUNT(customer_id) AS customer_id
    FROM Store
    WHERE amount > 500
    GROUP BY customer_id
) as ans;
