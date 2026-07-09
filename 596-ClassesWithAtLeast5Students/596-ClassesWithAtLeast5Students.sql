-- Last updated: 7/9/2026, 3:06:50 PM
# Write your MySQL query statement below
select class
from Courses
group by class
having COUNT(student)>=5;