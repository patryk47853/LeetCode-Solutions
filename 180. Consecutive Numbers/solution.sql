SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT num, 
           LEAD(num) OVER (ORDER BY id) AS next_num,
           LEAD(num, 2) OVER (ORDER BY id) AS third_num
    FROM Logs
) AS ConsecutiveNums
WHERE num = next_num AND num = third_num;
