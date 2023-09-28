SELECT a.employee_id AS EMPLOYEE_ID
FROM Employees AS a
LEFT JOIN Employees AS b ON a.manager_id = b.employee_id
LEFT JOIN Employees AS c ON b.manager_id = c.employee_id
LEFT JOIN Employees AS d ON c.manager_id = d.employee_id
WHERE a.employee_id != 1 AND d.employee_id = 1;
