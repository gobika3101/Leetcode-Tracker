-- Last updated: 7/9/2026, 3:06:58 PM
# Write your MySQL query statement below
select Employee.name,Bonus.bonus FROM Employee
LEFT JOIN Bonus ON Employee.empID = Bonus.empID
WHERE bonus<1000 OR Bonus IS NULL;