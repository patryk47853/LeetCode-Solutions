SELECT query_name,
ROUND(AVG(rating/position), 2) AS quality,
ROUND(100 * AVG(rating < 3), 2) as poor_query_percentage
FROM Queries
GROUP BY query_name
ORDER BY 2 DESC;
