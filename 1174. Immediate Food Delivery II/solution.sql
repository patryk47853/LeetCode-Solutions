SELECT ROUND(AVG(delivery.order_date = delivery.customer_pref_delivery_date) * 100, 2) AS immediate_percentage
FROM (
    SELECT *,
    RANK() OVER(PARTITION BY customer_id ORDER BY order_date) AS r
    FROM Delivery
) AS delivery
WHERE delivery.r = 1;
