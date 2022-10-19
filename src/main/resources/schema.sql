CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(75) NOT NULL,
  `name` varchar(75) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`email`)
) ENGINE = INNODB;

CREATE TABLE `request` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `creation_date` datetime NOT NULL,
  `description` text DEFAULT NULL,
  `state` varchar(12) NOT NULL,
  `subject` varchar(75) NOT NULL,
  `owner_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`owner_id`) REFERENCES user(id)
) ENGINE = INNODB;

CREATE TABLE `request_stage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` text DEFAULT NULL,
  `realization_date` datetime NOT NULL,

  `state` varchar(12) NOT NULL,
  `owner_id` bigint(20) NOT NULL,
  `request_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`owner_id`) REFERENCES user(id),
  FOREIGN KEY (`request_id`) REFERENCES request(id)
) ENGINE = INNODB;


