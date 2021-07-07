CREATE TABLE users
(
    id      UUID NOT NULL,
    age     int4,
    name    VARCHAR(255),
    country_id INT,
    PRIMARY KEY (id)
);

ALTER TABLE users ADD CONSTRAINT fk_users_countries FOREIGN KEY (country_id) REFERENCES countries;
