-- creates a new databsw callled main
CREATE DATABASE 92746;

-- selects the main database
USE 92746;

-- Then creates the tables below
CREATE TABLE Meals
(
	meal_id int,
	meal_name varchar(50),
	meal_price int,
	meal_time datetime
);

CREATE TABLE Labs
(
	lab_id int,
	lab_name varchar(50),
	lab_time datetime
);

CREATE TABLE Courses
(
	course_id int,
	course_time datetime,
	course_name varchar(50),
	lecturer_id int
);

CREATE TABLE Lecturers
(
	lecturer_id int,
	lecturer_name varchar(50)
);

CREATE TABLE Students
(
	student_id int,
	student_email varchar(320),
	student_name varchar(50),
	course_id int
);
