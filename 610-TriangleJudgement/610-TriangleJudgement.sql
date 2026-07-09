-- Last updated: 7/9/2026, 3:06:45 PM
# Write your MySQL query statement below
SELECT *, IF(x+y>z and y+z>x and z+x>y, "Yes", "No") as triangle FROM Triangle