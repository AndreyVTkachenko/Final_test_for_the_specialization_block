/*
7. Работа с MySQL (Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux).
“Установить MySQL на вашу машину”

7.1. После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" 
должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы,
которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля,
которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.).
 
7.2		- В ранее подключенном MySQL создать базу данных с названием "Human Friends".
		- Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
		- Заполнить таблицы данными о животных, их командах и датами рождения.
		- Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
		- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
		- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

Пример заполненной таблицы для теста:

Лист "Pets"
ID	Name		Type		BirthDate		Commands
1	Fido		Dog			2020-01-01		Sit, Stay, Fetch
2	Whiskers	Cat			2019-05-15		Sit, Pounce
3	Hammy		Hamster		2021-03-10		Roll, Hide
4	Buddy		Dog			2018-12-10		Sit, Paw, Bark
5	Smudge		Cat			2020-02-20		Sit, Pounce, Scratch
6	Peanut		Hamster		2021-08-01		Roll, Spin
7	Bella		Dog			2019-11-11		Sit, Stay, Roll
8	Oliver		Cat			2020-06-30		Meow, Scratch, Jump

Лист "PackAnimals"
ID	Name		Type		BirthDate		Commands
1	Thunder		Horse		2015-07-21		Trot, Canter, Gallop
2	Sandy		Camel		2016-11-03		Walk, Carry Load
3	Eeyore		Donkey		2017-09-18		Walk, Carry Load, Bray
4	Storm		Horse		2014-05-05		Trot, Canter
5	Dune		Camel		2018-12-12		Walk, Sit
6	Burro		Donkey		2019-01-23		Walk, Bray, Kick
7	Blaze		Horse		2016-02-29		Trot, Jump, Gallop
8	Sahara		Camel		2015-08-14		Walk, Run

*/


/*
												СОЗДАНИЕ БАЗЫ ДАННЫХ
*/

CREATE DATABASE IF NOT EXISTS HumanFriends;
USE HumanFriends;


/*
											СОЗДАНИЕ И ЗАПОЛНЕНИЕ ВСЕХ ТАБЛИЦ
*/

CREATE TABLE IF NOT EXISTS Dogs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
TRUNCATE Dogs;
INSERT INTO Dogs (`Name`, BirthDate, Commands)
VALUES 
    ('Fido', '2020-01-01', 'Sit, Stay, Fetch'),
    ('Buddy', '2018-12-10', 'Sit, Paw, Bark'),
    ('Bella', '2019-11-11', 'Sit, Stay, Roll');

CREATE TABLE IF NOT EXISTS Cats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
TRUNCATE Cats;
INSERT INTO Cats (`Name`, BirthDate, Commands)
VALUES 
    ('Whiskers', '2019-05-15', 'Sit, Pounce'),
    ('Smudge', '2020-02-20', 'Sit, Pounce, Scratch'),
    ('Oliver', '2020-06-30', 'Meow, Scratch, Jump');

CREATE TABLE IF NOT EXISTS Hamsters (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
TRUNCATE Hamsters;
INSERT INTO Hamsters (`Name`, BirthDate, Commands)
VALUES 
    ('Hammy', '2021-03-10', 'Roll, Hide'),
    ('Peanut', '2021-08-01', 'Roll, Spin');

CREATE TABLE IF NOT EXISTS Horses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
TRUNCATE Horses;
INSERT INTO Horses (`Name`, BirthDate, Commands)
VALUES 
    ('Thunder', '2015-07-21', 'Trot, Canter, Gallop'),
    ('Storm', '2014-05-05', 'Trot, Canter'),
    ('Blaze', '2016-02-29', 'Trot, Jump, Gallop');
    
    
    CREATE TABLE IF NOT EXISTS Camels (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
TRUNCATE Camels;
INSERT INTO Camels (`Name`, BirthDate, Commands)
VALUES 
    ('Sandy', '2016-11-03', 'Walk, Carry Load'),
    ('Dune', '2018-12-12', 'Walk, Sit'),
    ('Sahara', '2015-08-14', 'Walk, Run');
    
CREATE TABLE IF NOT EXISTS Donkeys (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
TRUNCATE Donkeys;
INSERT INTO Donkeys (`Name`, BirthDate, Commands)
VALUES 
    ('Eeyore', '2017-09-18', 'Walk, Carry Load, Bray'),
    ('Burro', '2019-01-23', 'Walk, Bray, Kick');

CREATE TABLE IF NOT EXISTS Pets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    PetsType VARCHAR(50)
);
TRUNCATE Pets;
INSERT INTO Pets (PetsType)
VALUES
('Dogs'),
('Cats'),
('Hamsters');

CREATE TABLE IF NOT EXISTS PackAnimals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    PackAnimalsType VARCHAR(50)
);
TRUNCATE PackAnimals;
INSERT INTO PackAnimals (PackAnimalsType)
VALUES
('Horses'),
('Camels'),
('Donkeys');

CREATE TABLE IF NOT EXISTS Animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    AnimalType VARCHAR(50)
);
TRUNCATE Animals;
INSERT INTO Animals (AnimalType)
VALUES
('Pets'),
('PackAnimal');


/*
										ПОСТРОЕНИЕ ВЗАИМОСВЯЗЕЙ МЕЖДУ ТАБЛИЦАМИ
*/

ALTER TABLE Animals
ADD COLUMN AnimalTypeID INT;

UPDATE Animals
SET AnimalTypeID = 1
WHERE AnimalType = 'Pets';

UPDATE Animals
SET AnimalTypeID = 2
WHERE AnimalType = 'PackAnimal';

ALTER TABLE Pets
ADD COLUMN PetsTypeID INT;

UPDATE Pets
SET PetsTypeID = 1
WHERE PetsType = 'Dogs';

UPDATE Pets
SET PetsTypeID = 2
WHERE PetsType = 'Cats';

UPDATE Pets
SET PetsTypeID = 3
WHERE PetsType = 'Hamsters';

ALTER TABLE PackAnimals
ADD COLUMN PackAnimalsTypeID INT;

UPDATE PackAnimals
SET PackAnimalsTypeID = 1
WHERE PackAnimalsType = 'Horses';

UPDATE PackAnimals
SET PackAnimalsTypeID = 2
WHERE PackAnimalsType = 'Camels';

UPDATE PackAnimals
SET PackAnimalsTypeID = 3
WHERE PackAnimalsType = 'Donkeys';


/*
									ВЫПОЛНЕНИЕ МАНИПУЛЯЦИЙ С ТАБЛИЦАМИ ПО ЗАДАНИЮ
							(чтобы не потерять верблюдов удаление сделаем в последнюю очередь)
*/

CREATE TABLE IF NOT EXISTS YoungAnimals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    AnimalType VARCHAR(50),
    `Name` VARCHAR(50),
    BirthDate DATE
);
INSERT INTO YoungAnimals (AnimalType, `Name`, BirthDate)
SELECT AnimalType, `Name`, BirthDate
FROM (
    SELECT 'Dog' AS AnimalType, `Name`, BirthDate
    FROM Dogs
    UNION ALL
    SELECT 'Cat' AS AnimalType, `Name`, BirthDate
    FROM Cats
    UNION ALL
    SELECT 'Hamster' AS AnimalType, `Name`, BirthDate
    FROM Hamsters
    UNION ALL
    SELECT 'Horse' AS AnimalType, `Name`, BirthDate
    FROM Horses
    UNION ALL
    SELECT 'Camel' AS AnimalType, `Name`, BirthDate
    FROM Camels
    UNION ALL
    SELECT 'Donkey' AS AnimalType, `Name`, BirthDate
    FROM Donkeys
) AS all_animals
WHERE TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) BETWEEN 1 AND 3;
ALTER TABLE YoungAnimals
ADD COLUMN months INT;
UPDATE YoungAnimals
SET months = TIMESTAMPDIFF(MONTH, BirthDate, CURDATE());
SELECT * FROM YoungAnimals;


CREATE TABLE IF NOT EXISTS AllAnimals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    AnimalType VARCHAR(50),
    Name VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
INSERT INTO AllAnimals (AnimalType, Name, BirthDate, Commands)
SELECT 'Dog' AS AnimalType, Name, BirthDate, Commands
FROM Dogs
UNION ALL
SELECT 'Cat' AS AnimalType, Name, BirthDate, Commands
FROM Cats
UNION ALL
SELECT 'Hamster' AS AnimalType, Name, BirthDate, Commands
FROM Hamsters
UNION ALL
SELECT 'Horse' AS AnimalType, Name, BirthDate, Commands
FROM Horses
UNION ALL
SELECT 'Camel' AS AnimalType, Name, BirthDate, Commands
FROM Camels
UNION ALL
SELECT 'Donkey' AS AnimalType, Name, BirthDate, Commands
FROM Donkeys;
SELECT * FROM AllAnimals;


DELETE FROM Camels;
CREATE TABLE IF NOT EXISTS HorsesDonkeys (
    id INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50),
    BirthDate DATE,
    Commands VARCHAR(255)
);
INSERT INTO HorsesDonkeys (`Name`, BirthDate, Commands)
SELECT `Name`, BirthDate, Commands FROM Horses
UNION
SELECT `Name`, BirthDate, Commands FROM Donkeys;
SELECT * FROM HorsesDonkeys;
