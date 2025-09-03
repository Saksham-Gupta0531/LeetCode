-- Last updated: 9/3/2025, 5:27:44 PM
# Write your MySQL query statement below
select user_id ,max(time_stamp) as last_stamp from Logins
where time_stamp like '2020%' group by user_id;