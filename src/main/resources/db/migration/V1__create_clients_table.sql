create table client
(
    id                      VARCHAR primary key      not null,

    name                    VARCHAR,
    last_name               VARCHAR,
    email                   VARCHAR not null,
    born                    VARCHAR(10),
    created_at              timestamp with time zone not null,
    updated_at              timestamp with time zone
);

alter table client add constraint u_email unique (email);