SELECT uni.unique_id, e.name
FROM EmployeeUNI uni
RIGHT JOIN Employees e ON uni.id = e.id;
