CREATE DATABASE IF NOT EXISTS `employees`;
USE `employees`;


DROP TABLE IF EXISTS `ADDRESS`;

CREATE TABLE `ADDRESS` (
	`id` bigint(11) NOT NULL AUTO_INCREMENT,
	`HOUSE_NUM` varchar(5) NOT NULL,
	`STREET` varchar(150) NOT NULL,
	`ADD_LINE_ONE` varchar(150) NOT NULL,
	`ADD_TYPE` varchar(5) NOT NULL,
	`STATE` varchar(100) NOT NULL,
	`COUNTRY` varchar(100) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

LOCK TABLES `ADDRESS` WRITE;

INSERT INTO `ADDRESS` VALUES (1, 'HTGRA-34', 'Hogger Naught', 'Willian St', 'OFF',  'Noia', 'USA'), (2, 'SIMA-45', 'Liam', 'Poscher St', 'PER', 'Motina', 'Russia'),  (3, 'GIA', 'Miller Naught', 'Koscher St', 'TMP', 'Noida', 'India'), (4, 'MOSAKA-92', 'Moshta', 'Kupler St', 'PER', 'Wiltada', 'Peru');

UNLOCK TABLES;

DROP TABLE IF EXISTS `STUDENT`;

CREATE TABLE `STUDENT` (
	`id` bigint(11) NOT NULL AUTO_INCREMENT,
	`ADDRESS_ID` bigint(11) DEFAULT NULL,
	`FIRST_NAME` varchar(150) NOT NULL,
	`LAST_NAME` varchar(150) NOT NULL,
	`MAJOR` varchar(50) NOT NULL,
	PRIMARY KEY (`id`),
	KEY `FK_Address` (`ADDRESS_ID`),
	CONSTRAINT `FK_Address` FOREIGN KEY (`ADDRESS_ID`) REFERENCES `ADDRESS` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

LOCK TABLES `STUDENT` WRITE;

INSERT INTO `STUDENT` VALUES (1, 2, 'Tiger', 'Scott', 'Computer Science'), (2, 1, 'Sima', 'Lugani', 'Economics'), (3, 3, 'Nilam', 'Kaur', 'Astrophysics'), (4, 14, 'Matt', 'Morgan');

UNLOCK TABLES;

CREATE USER 'empadmin'@'%' IDENTIFIED BY 'password';
SET PASSWORD FOR 'empadmin' = PASSWORD('empadminpswd@123');

GRANT SELECT, INSERT, UPDATE, DELETE, DROP ON employees.* TO 'empadmin'@'%';



