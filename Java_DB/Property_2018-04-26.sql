# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: localhost (MySQL 5.7.18)
# Database: Property
# Generation Time: 2018-04-26 10:01:22 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table building
# ------------------------------------------------------------

DROP TABLE IF EXISTS `building`;

CREATE TABLE `building` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `building_type` varchar(100) NOT NULL,
  `date_construction` varchar(30) NOT NULL,
  `number_rooms` int(11) NOT NULL,
  `number_floors` int(11) NOT NULL,
  `original_price` int(11) NOT NULL,
  `depreciation_rate` double NOT NULL,
  `dimension` double NOT NULL,
  `addArea` double NOT NULL,
  `isActive` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `building` WRITE;
/*!40000 ALTER TABLE `building` DISABLE KEYS */;

INSERT INTO `building` (`id`, `building_type`, `date_construction`, `number_rooms`, `number_floors`, `original_price`, `depreciation_rate`, `dimension`, `addArea`, `isActive`)
VALUES
	(1,'Apartment','',12,12,10000,5,567,0,1),
	(2,'Apartment','',12,4,1000000,4,123,0,1);

/*!40000 ALTER TABLE `building` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table land
# ------------------------------------------------------------

DROP TABLE IF EXISTS `land`;

CREATE TABLE `land` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `soil_type` varchar(30) NOT NULL,
  `dist_mn_rd` int(11) NOT NULL,
  `orig_price` double NOT NULL,
  `land_serial` varchar(30) NOT NULL,
  `isActive` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `land` WRITE;
/*!40000 ALTER TABLE `land` DISABLE KEYS */;

INSERT INTO `land` (`id`, `soil_type`, `dist_mn_rd`, `orig_price`, `land_serial`, `isActive`)
VALUES
	(1,'red',12,1000000,'1117',1),
	(2,'loam',34,900000,'1117',1),
	(3,'red',67,489999,'678',1),
	(4,'red',8,8999999,'1118',1);

/*!40000 ALTER TABLE `land` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table owner_property
# ------------------------------------------------------------

DROP TABLE IF EXISTS `owner_property`;

CREATE TABLE `owner_property` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `owner_ID` int(11) NOT NULL,
  `property_ID` int(11) NOT NULL,
  `isActive` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `owner_property` WRITE;
/*!40000 ALTER TABLE `owner_property` DISABLE KEYS */;

INSERT INTO `owner_property` (`id`, `owner_ID`, `property_ID`, `isActive`)
VALUES
	(1,12,1,1),
	(2,45,2,1),
	(3,45,4,1);

/*!40000 ALTER TABLE `owner_property` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
