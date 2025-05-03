create table service_order
(
    id                      VARCHAR primary key      not null,

    item_id                 BIGINT not null,
    full_name               VARCHAR,
    email                   VARCHAR not null,
    quantity                NUMERIC(4),
    amount                  NUMERIC(10, 2),
    cel_number              VARCHAR(20),
    address                 VARCHAR,
    code_address            VARCHAR(10),
    address_number           VARCHAR(10),
    size_clothing           VARCHAR(5),
    color_clothing          VARCHAR(20),
    detail                  VARCHAR,
    status                  VARCHAR(20),
    created_at              timestamp with time zone not null,
    updated_at              timestamp with time zone

);
