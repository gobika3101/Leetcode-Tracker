-- Last updated: 7/9/2026, 3:05:55 PM
select distinct author_id as id from Views
where author_id = viewer_id 
order by id;