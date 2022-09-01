create table "user"
(
    uuid bigserial primary key not null ,
    firstName text not null ,
    lastName text not null ,
    age integer not null ,
    username text not null ,
    password text not null

)