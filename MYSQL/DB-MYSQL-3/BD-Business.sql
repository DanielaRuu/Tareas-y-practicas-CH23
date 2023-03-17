-- USE 'business';

-- Revisar employee
SELECT * FROM employee;

-- ALIAS ayuda a cambiar temporalmente el nombre de las columnas para mostrar un resultado con màs contexto, no lo modifica en la estructura.
select last_name AS 'Apellido' from employee;

-- ALIAS ++ 
select
 employee_id AS 'ID',
 first_name As 'Nombre',
 last_name as 'Apellido',
 department as 'Departamento'
 from employee;
 
 -- Filtrar por nombre
 -- Buscar a Monika
 select * from employee
 where first_name = 'Monika';
 
 
 -- Filtrar doble
 select * FROM EMPLOYEE
 where salary = 500000 AND first_name = 'Vivek';
 
 -- Filtrar por NOT: el not aqui es para que no se cumpla la condicion, es decir, no mostrara a Barrack en la lista, solo a los demas empleados
 select * from employee
 where not first_name = 'Barrack';
 
 -- Filtrar por doble negacion
 select * from employee
 where not first_name = 'Santiago' AND NOT first_name = 'Ian';
 
 
 -- Ordenamiento
 -- ORDER BY: ordena de forma alfabetica
 -- Default es orden descendiente, asc para ascendente o desc para descendente
 select * FROM employee
 order by department asc;
 
  select * FROM employee
 order by department desc;
 
 
  select * FROM employee
 order by department asc, last_name desc;
 
 -- GROUP BY  agrupar significa que los datos se colocaran e una misma fila, y si se repiten los datos no se pueden agrupar
 select * from employee
 group by department;
