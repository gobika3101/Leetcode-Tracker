-- Last updated: 7/9/2026, 3:06:53 PM
# Write your MySQL query statement below
select customer_number
from Orders
group by customer_number
order by COUNT(customer_number) DESC
LIMIT 1;