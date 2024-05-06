CREATE TABLE user
(
    userId   bigint NOT NULL AUTO_INCREMENT,
    name     varchar(255) DEFAULT NULL,
    password  varchar(255) DEFAULT NULL,
    email  varchar(255) DEFAULT NULL,
    phone    varchar(255) DEFAULT NULL,
    PRIMARY KEY (userId)
) ENGINE=InnoDB;


