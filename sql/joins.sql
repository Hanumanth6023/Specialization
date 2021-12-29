CREATE TABLE IF NOT EXISTS newauthor(aut_id varchar(8) NOT NULL , aut_name varchar(50) NOT NULL, country varchar(25) NOT NULL, home_city varchar(25) NOT NULL, UNIQUE (aut_id));
desc newauthor;
Insert into newauthor values('2','somu','ind','tpt');
select* from newauthor;

use demo;

----JOINS ----

create table xtable(
id int,
xname varchar(20));

create table ytable(
id int,
yname varchar(20));

insert into xtable values(1,'x1');
insert into xtable values(2,'x2');
insert into xtable values(3,'x3');
insert into xtable values(4,'x4');
insert into xtable values(5,'x5');
insert into xtable values(7,'x6');

insert into ytable values(1,'y1');
insert into ytable values(2,'y2');
insert into ytable values(3,'y3');
insert into ytable values(4,'y4');
insert into ytable values(6,'y6');
insert into ytable values(7,'y7');

select * from xtable
inner join ytable
on xtable.id=ytable.id;

select * from xtable cross join ytable;

select * from xtable
left join ytable
on xtable.id=ytable.id;

select * from xtable
right join ytable
on xtable.id=ytable.id;

select * from xtable
full join ytable
where xtable.id=ytable.id;

show tables;

select * from student;

select s1.name,s2.name,s1.id
from student as s1,student as s2
where s1.id=s2.id;















