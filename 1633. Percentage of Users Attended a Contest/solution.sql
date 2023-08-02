SELECT r.contest_id, ROUND((COUNT(DISTINCT(r.user_id)) * 100 / COUNT(DISTINCT(u.user_id))), 2) AS percentage
FROM Register r, Users u
GROUP BY contest_id
ORDER BY percentage DESC, contest_id;
