SELECT * FROM employee
order by salary ASC;

 -- MIN FUNCION QUE SELECCIONA EL MINIMO, SIRVE PARA DATOS NUMERICOS
 SELECT min(salary) from employee;
 
 -- MAX 
 SELECT max(salary) from employee;
  
  -- AVG PROMEDIO con alias (as)
  SELECT avg(salary) AS promedio from employee;

 -- SUM
  SELECT sum(employee_id) FROM employee;
  
  -- se puede hacer combinacion de funciones:
  SELECT sum(salary), avg(salary) FROM employee;
  
  -- COUNT sirve para hacer conteo de datos agrupados
  SELECT count(employee_id) FROM employee;
SELECT count(salary) from employee;
SELECT count(DISTINCT(salary)) FROM employee;   
  