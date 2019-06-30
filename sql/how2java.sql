# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2019-07-01 00:00:08
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "hero"
#

DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `hp` float DEFAULT NULL,
  `damage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Data for table "hero"
#

INSERT INTO `hero` VALUES (1,'盖伦',616,100),(2,'盖伦',616,100),(3,'盖伦',616,100),(4,'盖伦',616,100),(5,'盖伦',616,100),(6,'盖伦',61600,1009),(9,'盖伦',616,100),(10,'tyty',567,5);
