-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.4-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for vending_machine_management
CREATE DATABASE IF NOT EXISTS `vending_machine_management` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `vending_machine_management`;

-- Dumping structure for table vending_machine_management.orderitem
CREATE TABLE IF NOT EXISTS `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT '',
  `moneytotal` int(11) DEFAULT 0,
  `status` int(11) DEFAULT 0,
  `storemachineid` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `FK_orderitem_storemachine` (`storemachineid`),
  CONSTRAINT `FK_orderitem_storemachine` FOREIGN KEY (`storemachineid`) REFERENCES `storemachine` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.orderitem: ~0 rows (approximately)
/*!40000 ALTER TABLE `orderitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderitem` ENABLE KEYS */;

-- Dumping structure for table vending_machine_management.orderitem_product
CREATE TABLE IF NOT EXISTS `orderitem_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `orderitemid` int(11) NOT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_orderitem_product_orderitem` (`orderitemid`),
  KEY `FK_orderitem_product_product` (`productid`),
  CONSTRAINT `FK_orderitem_product_orderitem` FOREIGN KEY (`orderitemid`) REFERENCES `orderitem` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orderitem_product_product` FOREIGN KEY (`productid`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.orderitem_product: ~0 rows (approximately)
/*!40000 ALTER TABLE `orderitem_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderitem_product` ENABLE KEYS */;

-- Dumping structure for table vending_machine_management.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT '',
  `price` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.product: ~2 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`, `name`, `price`, `total`, `status`) VALUES
	(1, 'cake', 10, 10, 1),
	(2, 'hamberger', 15, 15, 1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table vending_machine_management.role
CREATE TABLE IF NOT EXISTS `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(256) NOT NULL,
  `name` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.role: ~2 rows (approximately)
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`id`, `code`, `name`) VALUES
	(1, 'ADMIN', 'ADMIN'),
	(2, 'NORMALSTAFF', 'NORMALSTAFF');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- Dumping structure for table vending_machine_management.storemachine
CREATE TABLE IF NOT EXISTS `storemachine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `name` int(11) DEFAULT NULL,
  `address` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_storemachine_user` (`userid`),
  CONSTRAINT `FK_storemachine_user` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.storemachine: ~0 rows (approximately)
/*!40000 ALTER TABLE `storemachine` DISABLE KEYS */;
/*!40000 ALTER TABLE `storemachine` ENABLE KEYS */;

-- Dumping structure for table vending_machine_management.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(256) DEFAULT NULL,
  `username` varchar(256) NOT NULL DEFAULT '',
  `password` varchar(256) NOT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.user: ~2 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `fullname`, `username`, `password`, `status`) VALUES
	(1, 'admin', 'admin', 'admin', 1),
	(2, 'normalstaff', 'normalstaff', 'normalstaff', 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table vending_machine_management.user_role
CREATE TABLE IF NOT EXISTS `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_user_role_user` (`userid`) USING BTREE,
  KEY `FK_user_role_role` (`roleid`),
  CONSTRAINT `FK_user_role_role` FOREIGN KEY (`roleid`) REFERENCES `role` (`id`),
  CONSTRAINT `FK_user_role_user` FOREIGN KEY (`userid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table vending_machine_management.user_role: ~2 rows (approximately)
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`id`, `userid`, `roleid`) VALUES
	(1, 1, 1),
	(2, 2, 2);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
