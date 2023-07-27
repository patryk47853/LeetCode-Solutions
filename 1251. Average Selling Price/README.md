## It is my submission for the following LeetCode problem:

---

### 1251. Average Selling Price

Table: Prices

<code>
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| product_id    | int     |
| start_date    | date    |
| end_date      | date    |
| price         | int     |
+---------------+---------+
(product_id, start_date, end_date) is the primary key for this table.
Each row of this table indicates the price of the product_id in the period from start_date to end_date.
For each product_id there will be no two overlapping periods. That means there will be no two intersecting periods for the same product_id.
</code><br> 

Table: UnitsSold

<code>
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| product_id    | int     |
| purchase_date | date    |
| units         | int     |
+---------------+---------+
There is no primary key for this table, it may contain duplicates.
Each row of this table indicates the date, units, and product_id of each product sold. 
</code><br>

Write an SQL query to find the average selling price for each product. average_price should be rounded to 2 decimal places.

Return the result table in any order.
