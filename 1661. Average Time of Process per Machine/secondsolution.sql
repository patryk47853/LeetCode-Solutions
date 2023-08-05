SELECT a1.machine_id, ROUND(
  (SELECT AVG(a2.timestamp) FROM Activity a2 WHERE a2.activity_type = 'end' and a2.machine_id = a1.machine_id) 
  -
  (SELECT AVG(a2.timestamp) FROM Activity a2 WHERE a2.activity_type = 'start' and a2.machine_id = a1.machine_id) 
, 3) AS processing_time
FROM Activity a1
GROUP BY a1.machine_id;
