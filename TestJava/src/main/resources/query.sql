create database java_final_test collate Latin1_General_CI_AS
go

use java_final_test
go

create table student (
	id int primary key,
	fullname nvarchar(255) not null,
	gender bit not null,
	birthday date not null,
	phone char(10) not null
)
go

create proc selectAll
as
	select * from student
go

