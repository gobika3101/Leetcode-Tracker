-- Last updated: 7/9/2026, 3:08:30 PM
# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary
FROM Employee 
Where salary< (
    SELECT MAX(salary)
    FROM Employee

)
