CREATE TABLE products
(
    uuid          BINARY(16)   NOT NULL,
    name          VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    price         DECIMAL      NULL,
    category      VARCHAR(255) NULL,
    status        VARCHAR(255) NULL,
    CONSTRAINT pk_products PRIMARY KEY (uuid)
);