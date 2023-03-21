SELECT * from students;
SELECT* FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- Encontrar estudiantes que sean del pais 125
SELECT * FROM students 
WHERE nationality = 125;

-- Contar estudiantes que pertenezcan al curso JAVA-1
SELECT count(*) FROM courses_has_students WHERE course_code = 'JAVA-1';

-- Contar estudiantes por cada modulo, usar agrupaciones
SELECT
t4.name AS 'modulo',
count(t1.idStudent) AS 'Numero de estudiantes'
FROM students t1
JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
JOIN courses t3
ON t2.course_code = t3.code
JOIN modules t4
ON t3.module_code = t4.code
group by t4.code
order by count(t1.idStudent);



-- Encontrar estudiantes sin curso




