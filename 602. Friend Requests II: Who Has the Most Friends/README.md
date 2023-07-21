## It is my submission for the following LeetCode problem:

---

### 602. Friend Requests II: Who Has the Most Friends

Table: RequestAccepted

<code>
+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| requester_id   | int     |
| accepter_id    | int     |
| accept_date    | date    |
+----------------+---------+
(requester_id, accepter_id) is the primary key for this table.
This table contains the ID of the user who sent the request, the ID of the user who received the request, and the date when the request was accepted.
</code><br>

Write an SQL query to find the people who have the most friends and the most friends number.

The test cases are generated so that only one person has the most friends.
