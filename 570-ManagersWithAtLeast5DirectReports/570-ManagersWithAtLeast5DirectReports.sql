-- Last updated: 7/9/2026, 3:07:00 PM
# Write your MySQL query statement below
select E1.name
from Employee E1
join(
    select managerId, COUNT(*) AS directReports
    from Employee
    group by managerId
    having COUNT(*) >=5
) E2 ON E1.id=E2.managerId;