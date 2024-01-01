SELECT d.id, d.name FROM departments d
WHERE EXISTS (select s.name from sales s where s.department_id = d.id and s.price > 98)