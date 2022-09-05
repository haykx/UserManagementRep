create table "user"
(
    uuid bigserial primary key not null ,
    firstName varchar(50) not null ,
    lastName varchar(50) not null ,
    age integer not null ,
    username varchar(50) unique not null ,
    password varchar(50) not null,
    roles varchar(255),
    created timestamp not null,
    updated timestamp,
    deleted timestamp
)