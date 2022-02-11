-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Szerver verzió:               10.6.5-MariaDB - mariadb.org binary distribution
-- Szerver OS:                   Win64
-- HeidiSQL Verzió:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Adatbázis struktúra mentése a suli.
CREATE DATABASE IF NOT EXISTS `suli` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `suli`;

-- Struktúra mentése tábla suli. diak
CREATE TABLE IF NOT EXISTS `diak` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nev` varchar(30) DEFAULT NULL,
  `szuldatum` date DEFAULT NULL,
  `naplo_id` int(11) DEFAULT NULL,
  `taj` varchar(9) DEFAULT NULL CHECK (char_length(`taj`) = 9),
  PRIMARY KEY (`id`),
  KEY `naplo_id` (`naplo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése suli.diak: ~7 rows (hozzávetőleg)
/*!40000 ALTER TABLE `diak` DISABLE KEYS */;
INSERT INTO `diak` (`id`, `nev`, `szuldatum`, `naplo_id`, `taj`) VALUES
	(1, 'Szabó Tünde', '2010-02-10', 1, NULL),
	(2, 'Nagy Péter', '2010-03-03', 1, NULL),
	(3, 'Kiss Rózsa', '2010-04-15', 1, NULL),
	(4, 'Kovács Barna', '2010-05-10', 3, NULL),
	(5, 'Kiss Anna', '2010-06-06', 1, NULL),
	(6, 'Kiss Emma', '2010-12-12', 1, '123456789');
/*!40000 ALTER TABLE `diak` ENABLE KEYS */;

-- Struktúra mentése tábla suli. jegy
CREATE TABLE IF NOT EXISTS `jegy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ertek` int(11) DEFAULT NULL,
  `leiras` varchar(10) DEFAULT NULL,
  `datum` date DEFAULT NULL,
  `diak_id` int(11) NOT NULL,
  `tantargy` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `diak_id` (`diak_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése suli.jegy: ~10 rows (hozzávetőleg)
/*!40000 ALTER TABLE `jegy` DISABLE KEYS */;
INSERT INTO `jegy` (`id`, `ertek`, `leiras`, `datum`, `diak_id`, `tantargy`) VALUES
	(1, 5, 'jeles', '2022-01-03', 1, 'magyar'),
	(2, 3, 'közepes', '2022-01-04', 1, 'matek'),
	(3, 4, 'jó', '2022-01-05', 2, 'biológia'),
	(4, 2, 'elégséges', '2022-01-10', 3, 'fizika'),
	(5, 4, 'jó', '2022-01-11', 3, 'kémia'),
	(6, 4, 'jó', '2022-01-11', 3, 'magyar'),
	(7, 4, 'jó', '2022-01-12', 1, 'magyar'),
	(8, 3, 'közepes', '2022-01-12', 2, 'matek'),
	(9, 5, 'jeles', '2022-01-03', 1, 'Kémia'),
	(10, 3, 'közepes', '2022-01-15', 2, 'történelem');
/*!40000 ALTER TABLE `jegy` ENABLE KEYS */;

-- Struktúra mentése tábla suli. naplo
CREATE TABLE IF NOT EXISTS `naplo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leiras` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése suli.naplo: ~2 rows (hozzávetőleg)
/*!40000 ALTER TABLE `naplo` DISABLE KEYS */;
INSERT INTO `naplo` (`id`, `leiras`) VALUES
	(1, '6B'),
	(2, '6C');
/*!40000 ALTER TABLE `naplo` ENABLE KEYS */;

-- Struktúra mentése nézet suli. temp
-- Ideiglenes tábla létrehozása a VIEW függőségi hibák lekezelésére
CREATE TABLE `temp` (
	`id` INT(11) NOT NULL,
	`nev` VARCHAR(30) NULL COLLATE 'utf8mb3_general_ci',
	`szuldatum` DATE NULL,
	`naplo_id` INT(11) NULL
) ENGINE=MyISAM;

-- Struktúra mentése nézet suli. temp
-- Ideiglenes tábla eltávolítása és a végső VIEW struktúra létrehozása
DROP TABLE IF EXISTS `temp`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `temp` AS SELECT * FROM diak ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
