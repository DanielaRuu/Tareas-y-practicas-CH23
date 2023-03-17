INSERT INTO users
(first_name, last_name, fav_food)
VALUES
('Zabdiel', 'Diaz', 'Dragoncitos'),
('Felipe', 'Maqueda', 'Chilaquiles Verdes'),
('Fernando', 'Aguilar', 'Carne Asad');



-- Selecciona todo de una tabla
SELECT * FROM `users`;

-- Seleccionar solo una columna
SELECT `first_name` From `users`;

-- Insertar daatos a tabla pets
-- no es necesario colocar todas las columnas siempre y cuando los nombres de las columnas coincidad
INSERT INTO `pets`
(fist_name, fav_food, type_pet, Users_idUsers)
VALUES
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo', 2),
('Pepperoni', 'Huesitos de manzanas', 'Doggy', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- llave foranea se puede repetir (como en pepe y pepperoni, ambas tienen la misma llave foranea (3)

-- Seleccionar todo de pets
SELECT * FROM `pets`;

-- Filtrar por FK para identificar a owners
SELECT * FROM `pets`
WHERE Users_idUsers = 3;

-- Ejercicio
insert into users
(first_name, last_name, fav_food)
value
('Daniela', 'Ruiz', 'pozole'),
('Axel', 'Reynaga', 'mole'),
('Luisa', 'Castillo', 'Enchiladas Suizas'),
('Jorge', 'Recillas', 'Torta ahogada'),
('Alejandro','Morales','Chilaquiles'),
('Jonathan', 'Dominguez', 'Carne en su jugo');

SELECT * FROM `users`;

insert into pets
(fist_name, fav_food, type_pet, Users_idUsers)
values
('Nina', 'Pollito', 'Gathija', 4),
('Betty', 'pollo', 'gato', 5),
('Boster', 'jamon', 'doggo', 6),
('Lucifugo', 'Atun', 'Gato', 7),
('Toby', 'Croquetas', 'Doggo', 8),
('Sasha', 'Tacos', 'Gran Danes', 9);

SELECT * FROM `pets`;




