CREATE DATABASE spring_api_yt_01_school;
USE spring_api_yt_01_school;

CREATE TABLE Student(
	studentID INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(250) NOT NULL,
    lastName VARCHAR(250) NOT NULL,
    studentNumber VARCHAR(10) NOT NULL UNIQUE,
    dateOfBirth DATE NOT NULL
);

CREATE TABLE Teacher(
	teacherID INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(250) NOT NULL,
    lastName VARCHAR(250) NOT NULL,
    teachingSubject VARCHAR(250) NOT NULL
);

INSERT INTO Student (firstName, lastName, studentNumber, dateOfBirth) VALUES
('Alice', 'Rossi', 'S10001', '2003-05-15'),
('Bob', 'Verdi', 'S10002', '2004-09-20'),
('Charlie', 'Bianchi', 'S10003', '2002-12-01'),
('Diana', 'Neri', 'S10004', '2005-03-10'),
('Eva', 'Gialli', 'S10005', '2003-07-22'),
('Franco', 'Marrone', 'S10006', '2004-11-08'),
('Giorgia', 'Viola', 'S10007', '2002-06-30'),
('Luca', 'Arancio', 'S10008', '2005-01-18'),
('Maria', 'Blu', 'S10009', '2003-08-25'),
('Nicola', 'Grigio', 'S10010', '2004-04-05');

INSERT INTO Teacher (firstName, lastName, teachingSubject) VALUES
('Prof. Anna', 'Ferrari', 'Matematica'),
('Prof. Marco', 'Russo', 'Storia'),
('Prof. Laura', 'Colombo', 'Inglese'),
('Prof. Paolo', 'Ricci', 'Fisica'),
('Prof. Elena', 'Romano', 'Chimica'),
('Prof. Stefano', 'Conti', 'Biologia'),
('Prof. Giulia', 'Marino', 'Letteratura'),
('Prof. Roberto', 'Gallo', 'Geografia'),
('Prof. Francesca', 'Costa', 'Arte'),
('Prof. Davide', 'Moretti', 'Informatica');

SELECT * FROM Student;
SELECT * FROM Teacher;