SELECT d.name AS Department, e.name AS Employee, e.salary
FROM Department d
JOIN Employee e ON d.id = e.departmentId
WHERE (
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = d.id and e2.salary > e.salary
) <= 2;
