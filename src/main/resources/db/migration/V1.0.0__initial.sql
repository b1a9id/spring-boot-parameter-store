create table sample (
  id          integer auto_increment,
  name        varchar(100) not null,
  primary key (id)
);

insert into sample (name) values ('TEST1');
insert into sample (name) values ('TEST2');
insert into sample (name) values ('TEST3');
