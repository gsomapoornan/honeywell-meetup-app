insert into meetupgroups(id,groupname) values (1,'HackersGroup');
insert into meetupgroups(id,groupname) values (2,'Java Developers Group');
insert into meetupgroups(id,groupname) values (3,'TravellersGroup');

insert into user(id,contact,email,groupid,name) values (1,'7999282','meetme@ganesh',1,'ganesh');
insert into user(id,contact,email,groupid,name) values (2,'7999282','meetme@ramesh',2,'ramesh');
insert into user(id,contact,email,groupid,name) values (3,'7999282','meetme@suresh',3,'suresh');


insert into events(id,contact,date, groupid,name) values (1,'ganesh@gmail',TO_DATE('17/12/2019', 'DD/MM/YYYY'),1,'Hacktrix @ Honeywell');