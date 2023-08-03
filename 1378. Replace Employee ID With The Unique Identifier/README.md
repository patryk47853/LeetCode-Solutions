## It is my submission for the following LeetCode problem:

---

### 1378. Replace Employee ID With The Unique Identifier

Table: Employees

<code>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| name          | varchar |
+---------------+---------+
In SQL, id is the primary key for this table.
Each row of this table contains the id and the name of an employee in a company.</code><br>
 

Table: EmployeeUNI

<code>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| unique_id     | int     |
+---------------+---------+
In SQL, (id, unique_id) is the primary key for this table.
Each row of this table contains the id and the corresponding unique id of an employee in the company.</code><br>
 
Show the unique ID of each user, If a user does not have a unique ID replace just show null.

Return the result table in any order.
