## It is my submission for the following LeetCode problem:

---

### 1693. Daily Leads and Partners

Table: DailySales

<code>+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| date_id     | date    |
| make_name   | varchar |
| lead_id     | int     |
| partner_id  | int     |
+-------------+---------+
There is no primary key (column with unique values) for this table. It may contain duplicates.
This table contains the date and the name of the product sold and the IDs of the lead and partner it was sold to.
The name consists of only lowercase English letters.</code><br>

For each date_id and make_name, find the number of distinct lead_id's and distinct partner_id's.

Return the result table in any order.
