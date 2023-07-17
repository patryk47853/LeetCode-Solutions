## It is my submission for the following LeetCode problem:

---

### 184. Department Highest Salary

Table: Employee

<code>
+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| id           | int     |
| name         | varchar |
| salary       | int     |
| departmentId | int     |
+--------------+---------+
In SQL, id is the primary key column for this table.
departmentId is a foreign key (join key in Pandas) of the ID from the Department table.
Each row of this table indicates the ID, name, and salary of an employee. It also contains the ID of their department.
</code><br>
 

Table: Department

<code>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
+-------------+---------+
In SQL, id is the primary key column for this table. It is guaranteed that department name is not NULL.
Each row of this table indicates the ID of a department and its name.
</code><br>

Find employees who have the highest salary in each of the departments.

Return the result table in any order.
