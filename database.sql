DROP DATABASE IF EXISTS Human_friends;
CREATE DATABASE Human_friends;

USE Human_friends;

-- Создаем таблицу Category(Категории животных)

DROP TABLE IF EXISTS Category;
CREATE TABLE Category
(
    id  int auto_increment primary key,
    categoryName varchar(50) null
);
-- Заполняем таблицу pets
INSERT INTO Category (categoryName)
VALUES ('Pets'), ('PackAnimal');

SELECT * FROM Category;

-- Создаем таблицу Types(Виды животных)

DROP TABLE IF EXISTS TypesAnimal;
CREATE TABLE TypesAnimal
(
    id  int auto_increment primary key,
    typeName varchar(50) null
);
-- Заполняем таблицу Types
INSERT INTO TypesAnimal (typeName)
VALUES ('Dog'), ('Cat'), ('Hamster'), ('Horses'), ('Camels'), ('Donkeys');

SELECT * FROM TypesAnimal;

-- Создаем таблицу Animals (Животные)
DROP TABLE IF EXISTS Animals;
CREATE TABLE Animals
(
    id  int auto_increment primary key,
    category_Id int,
    typesAnimal_Id int,
    animalsName varchar(50) null,
    birthdate date,
    foreign key (category_Id) references Category (id),
    foreign key (typesAnimal_Id) references TypesAnimal (id)
);
-- Заполняем таблицу Animals
INSERT INTO Animals (category_Id, typesAnimal_Id, AnimalsName, birthdate) 
VALUES 
('1', '1', 'Шарик', date'2020-05-05'),
('1', '2', 'Мурзик', date'2021-06-01'),
('1', '3', 'Беляш', date'2022-05-05'),
('2', '4', 'Мустанг', date'2005-03-09'),
('2', '5', 'Моисей', date'2018-02-01'),
('2', '6', 'Шарик', date'2020-05-05'),
('1', '1', 'Мухтар', date'2015-05-05'),
('1', '2', 'Барсик', date'2019-06-10');

SELECT * FROM Animals;

-- Создаем таблицу Commands (Команды)
DROP TABLE IF EXISTS Commands;
CREATE TABLE Commands
(
    id  int auto_increment primary key,
    commandName varchar(50) null
);

-- Заполняем таблицу Commands
INSERT INTO Commands (commandName)
VALUES 
('Сидеть'),
('Лежать'),
('Аппорт'),
('Рядом'),
('Место'),
('Служить');

SELECT * FROM Commands;

-- Создаем таблицу AnimalCommands (Команды, которые знают животные)
DROP TABLE IF EXISTS AnimalCommands;
CREATE TABLE AnimalCommands
(
    id  int auto_increment primary key,
    animal_Id int,
    command_Id int,
    foreign key (animal_Id) references Animals (id),
    foreign key (command_Id) references Commands (id)
);

-- Заполняем таблицу AnimalCommands
INSERT INTO AnimalCommands (animal_Id, command_Id)
VALUES 
('1', '1'),
('1', '2'),
('1', '3'),
('1', '4'),
('1', '5'),
('1', '6'),
('7', '4'),
('7', '5'),
('7', '6');

SELECT * FROM AnimalCommands;

DELETE FROM Animals
WHERE typesAnimal_Id = 5;

SELECT * FROM Animals;

CREATE TABLE YoungAnimals
SELECT id, category_Id, typesAnimal_Id, animalsName, 
(YEAR(CURRENT_DATE)-YEAR(birthdate)) AS age
FROM Animals
WHERE (YEAR(CURRENT_DATE)-YEAR(birthdate)) > 1 AND (YEAR(CURRENT_DATE)-YEAR(birthdate)) < 3;

SELECT * FROM YoungAnimals;
