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
 
 -- IN 
 SELECT * FROM employee
 WHERE employee_id IN (1, 3, 7, 8, 5);
 
 -- BETWEEN funciona ocn rangos
 SELECT * FROM employee
 WHERE salary not BETWEEN 200000 AND 500000;
 
 -- LIMIT
 SELECT * FROM employee
 LIMIT 5;
 
  -- LIMIT + OFFSET da la indicacion de no mostraar los primeros 3 y limit le indica hasta donde mostrar 
 SELECT * FROM employee
 LIMIT 3 offset 3;
 
 -- LIKE EL SIGNO DE PORCENTAJE DA LA INSTRUCCION DE IGNORAR TODOS LOS TIPOS DE CARACTERES, SU POSICION IMPORTA, SI SE PONE ANTES DE LA LETRA QUE BUSCARA IGNORARA LOS QUE ESTEN ANTES, SI SE PONE DESPUES IGNORARA LOS CARACTERES QUE ESTEN DESPUES DEL CARAACTER INDICAADO.
 SELECT * FROM employee
 WHERE last_name LIKE 'B%';
 
 -- CASE SENSITIVE
 SELECT * FROM employee
 WHERE last_name LIKE BINARY '%A';
 
 -- LIKE ++
 SELECT * FROM employee
 WHERE join_date LIKE '%02%';
 
 -- UPDATE INFO
 UPDATE employee
  SET salary = 300000
  WHERE employee_id = 5;
  
  -- ingresar empleado
  insert into employee (first_name, last_name, salary, join_date, department)
  values ('Alejandro', 'Morales', '300000', '2023-03-17', 'Admin');
  
  -- ingresarr empleado con nuevo
 insert into employee (first_name, last_name, salary, join_date, department)
  values ('Daniela', 'Ruiz', '50000', '2023-03-17', 'Devalapars');
  
    SELECT * FROM employee;
