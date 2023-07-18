## It is my submission for the following LeetCode problem:

---

### 570. Managers with at Least 5 Direct Reports

Table: Employee

<code>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| department  | varchar |
| managerId   | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the name of an employee, their department, and the id of their manager.
If managerId is null, then the employee does not have a manager.
No employee will be the manager of themself.
</code><br>
 

Find the managers with at least five direct reports.

Return the result table in any order.
