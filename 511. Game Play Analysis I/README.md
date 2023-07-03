## It is my submission for the following LeetCode problem:

---

### 511. Game Play Analysis I

Table: Activity
<code>

+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| player_id    | int     |
| device_id    | int     |
| event_date   | date    |
| games_played | int     |
+--------------+---------+
(player_id, event_date) is the primary key of this table.
This table shows the activity of players of some games.
Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.
</code>

Find the first login date for each player.

Return the result table in any order.

The result format is in the following example.

