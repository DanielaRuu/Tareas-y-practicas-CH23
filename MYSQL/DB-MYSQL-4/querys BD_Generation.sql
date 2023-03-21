-- INNER JOIN
-- t.students con t.countries

SELECT * from students;
SELECT* FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- JOIN para encontrar a que pais pertenecen los estudiantes, uniendo dos tablas
SELECT students.*, countries.name, countries.code -- aqui le digo que partes de las tablas combinar
FROM students
INNER JOIN countries
ON
students.nationality = countries.idCountries;

-- 
SELECT students.idStudent AS 'ID', 
students.name AS 'Nombre', 
students.last_name AS 'Apellido', 
countries.name AS 'Pais de origen', 
countries.code AS 'Código de pais'
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries;

-- Encontramos qué tipo de ID tiene la raza
SELECT
students.idStudent AS 'ID',
students.name AS 'Nombre',
students. last_name As 'Apellido',
idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER join idtypes
ON students.idType_id = idtypes.id_idTypes;

-- Abreviaciones el alias se coloca enfrente del nombre de la tabla (t1)
SELECT tabla1.name, t2.name, t2.code 
FROM students tabla1
INNER JOIN countries t2
ON
t1.nationality = t2.idCountries;

-- EJERCICIO ESTUDIANTES QUE ESTEN REGISTRADES EN UN CURSO.
-- nombre, id, apellido y curso al que se registraron

SELECT 
ST.idStudent,
ST.name,
ST.last_name,
TABPIV.course_code
FROM students ST
INNER JOIN courses_has_students TABPIV
on ST.idStudent = TABPIV.students_id_student;

-- Buscar estudiantes y el curso al que pertenecern
SELECT
t1.name As 'Nombre',
t1.last_name AS 'Apellido',
t2.course_code AS 'Codigo de curso',
t3.name AS 'Curso',
t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON T1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- Group by sirve para agrupar datos agregados o coincidentes siempre y cuando coincidan
SELECT
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;




