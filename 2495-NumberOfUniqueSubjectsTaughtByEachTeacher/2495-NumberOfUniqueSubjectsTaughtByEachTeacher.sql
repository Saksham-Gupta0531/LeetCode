-- Last updated: 9/3/2025, 5:27:31 PM
# Write your MySQL query statement below
select teacher_id ,count(Distinct(subject_id)) as cnt  from Teacher group by teacher_id;