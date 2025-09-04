-- Last updated: 9/4/2025, 6:14:29 AM
# Write your MySQL query statement below
select email as Email from Person group by Email having count(email)>1;