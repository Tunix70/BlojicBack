create table tdocument (
    id serial primary key,
    name varchar(1024) not null,
    created timestamp not null,
    updated timestamp not null
);

