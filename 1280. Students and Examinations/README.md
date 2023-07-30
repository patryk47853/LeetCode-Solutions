## It is my submission for the following LeetCode problem:

---

### 1280. Students and Examinations

Table: Students

<code>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| student_id    | int     |
| student_name  | varchar |
+---------------+---------+
In SQL, student_id is the primary key for this table.
Each row of this table contains the ID and the name of one student in the school.
</code><br>

Table: Subjects

<code>+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| subject_name | varchar |
+--------------+---------+
In SQL, subject_name is the primary key for this table.
Each row of this table contains the name of one subject in the school.
</code><br>

Table: Examinations

<code>+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| student_id   | int     |
| subject_name | varchar |
+--------------+---------+
This table may contain duplicates (In other words, there is no primary key for this table in SQL).
Each student from the Students table takes every course from the Subjects table.
Each row of this table indicates that a student with ID student_id attended the exam of subject_name.
</code><br> 

Find the number of times each student attended each exam.

Return the result table ordered by student_id and subject_name.
