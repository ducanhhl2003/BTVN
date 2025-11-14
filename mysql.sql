create database 1602_mysql
drop database 1602_mysql
create database if not exists 1602_mysql
use 1602_mysql
create table student(
id INT,
student_name VARCHAR(200),
age INT,
score FLOAT
);
create table department(
id INT primary key,
student_name VARCHAR(200),
age INT,
score FLOAT
);
create database if not exists moinhat
use moinhat
create table person(
id int primary key auto_increment,
full_name varchar(200),
address varchar(200)
);
insert into person(full_name,address)
values ('Ducanh1','VN1'),('Ducanh2','VN2'),('Ducanh3','VN3')

delete from person
where id = 2 
update person
set full_name = 'DUCANHH' 
where id=3
create table student(
id int primary key auto_increment,
student_name varchar(200),
email varchar(200) unique
);
insert into student(full_name,address)
values ('Ducanh1','VN'),('Ducanh2','VN')
select *
from person;
select full_name,address
from person;
select *
from person;
select full_name as ho_ten,address as dia_chi
from person;
select *
from person
where id >3;
select *
from person
where full_name ='Ducanh2';


