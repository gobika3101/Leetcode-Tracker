-- Last updated: 7/9/2026, 3:08:31 PM
# Write your MySQL query statement below
SELECT p.firstName,p.LastName, a.city,a.state
FROM Person p
LEFT JOIN Address a
ON p.personId=a.personId;
