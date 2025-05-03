create table item
(
    id                      VARCHAR primary key      not null,

    item_id                 BIGINT not null,
    path_image              VARCHAR,
    description             VARCHAR not null,
    item_name               VARCHAR(70),
    price                   NUMERIC(10, 2),
    weight_discount         NUMERIC(2),
    partner                 VARCHAR(70),
    partner_link            VARCHAR,
    active                  boolean,
    created_at              timestamp with time zone not null,
    updated_at              timestamp with time zone
);

alter table item add constraint u_item_id unique (item_id);