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


-- Adatbázis struktúra mentése a pizzabolt.
CREATE DATABASE IF NOT EXISTS `pizzabolt` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_hungarian_ci */;
USE `pizzabolt`;

-- Struktúra mentése tábla pizzabolt. futar
CREATE TABLE IF NOT EXISTS `futar` (
  `id` int(3) NOT NULL DEFAULT 0,
  `nev` varchar(25) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `telefon` varchar(12) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `szuletesi_ev` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése pizzabolt.futar: ~6 rows (hozzávetőleg)
/*!40000 ALTER TABLE `futar` DISABLE KEYS */;
INSERT INTO `futar` (`id`, `nev`, `telefon`, `szuletesi_ev`) VALUES
	(1, 'Hurrikán', '123456', 1995),
	(2, 'Gyalogkakukk', '666666', NULL),
	(3, 'Gömbvillám', '888888', NULL),
	(4, 'Szélvész', '258369', NULL),
	(5, 'Imperial', '987654', NULL),
	(6, 'Quicksilver', '567891', 1986);
/*!40000 ALTER TABLE `futar` ENABLE KEYS */;

-- Struktúra mentése tábla pizzabolt. pizza
CREATE TABLE IF NOT EXISTS `pizza` (
  `id` int(3) NOT NULL DEFAULT 0,
  `nev` varchar(15) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `ar` int(4) NOT NULL DEFAULT 0,
  `atmero` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése pizzabolt.pizza: ~6 rows (hozzávetőleg)
/*!40000 ALTER TABLE `pizza` DISABLE KEYS */;
INSERT INTO `pizza` (`id`, `nev`, `ar`, `atmero`) VALUES
	(1, 'Capricciosa', 900, NULL),
	(2, 'Frutti di Mare', 1100, NULL),
	(3, 'Hawaii', 780, NULL),
	(4, 'Vesuvio', 890, NULL),
	(5, 'Sorrento', 990, NULL),
	(6, 'Margarita', 720, 32);
/*!40000 ALTER TABLE `pizza` ENABLE KEYS */;

-- Struktúra mentése tábla pizzabolt. rendeles
CREATE TABLE IF NOT EXISTS `rendeles` (
  `id` int(8) NOT NULL DEFAULT 0,
  `vevo_id` int(6) NOT NULL DEFAULT 0,
  `futar_id` int(3) NOT NULL DEFAULT 0,
  `datum` date NOT NULL DEFAULT '0000-00-00',
  `ido` float NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése pizzabolt.rendeles: ~21 rows (hozzávetőleg)
/*!40000 ALTER TABLE `rendeles` DISABLE KEYS */;
INSERT INTO `rendeles` (`id`, `vevo_id`, `futar_id`, `datum`, `ido`) VALUES
	(1, 4, 2, '2010-10-01', 13.15),
	(2, 7, 2, '2010-10-01', 14.17),
	(3, 1, 1, '2010-10-02', 11.07),
	(4, 5, 2, '2010-10-02', 14.55),
	(5, 2, 3, '2010-10-02', 15.27),
	(6, 4, 2, '2010-10-03', 15.58),
	(7, 6, 2, '2010-10-04', 11.44),
	(8, 7, 4, '2010-10-04', 12.11),
	(9, 1, 5, '2010-10-04', 14.33),
	(10, 3, 5, '2010-10-04', 18.04),
	(11, 2, 1, '2010-10-05', 16.38),
	(12, 5, 2, '2010-10-05', 17.02),
	(13, 6, 2, '2010-10-06', 12.17),
	(14, 4, 3, '2010-10-06', 13.21),
	(15, 1, 4, '2010-10-06', 15.05),
	(16, 2, 5, '2010-10-06', 15.59),
	(17, 7, 2, '2010-10-06', 18.44),
	(18, 3, 2, '2010-10-07', 12.01),
	(19, 4, 5, '2010-10-07', 13.44),
	(20, 1, 1, '2010-10-07', 17.25),
	(21, 5, 3, '2010-10-08', 14.29);
/*!40000 ALTER TABLE `rendeles` ENABLE KEYS */;

-- Struktúra mentése tábla pizzabolt. tetel
CREATE TABLE IF NOT EXISTS `tetel` (
  `rendeles_id` int(8) NOT NULL DEFAULT 0,
  `pizza_id` int(3) NOT NULL DEFAULT 0,
  `db` int(3) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése pizzabolt.tetel: ~37 rows (hozzávetőleg)
/*!40000 ALTER TABLE `tetel` DISABLE KEYS */;
INSERT INTO `tetel` (`rendeles_id`, `pizza_id`, `db`) VALUES
	(1, 1, 2),
	(1, 4, 3),
	(2, 2, 1),
	(3, 1, 2),
	(4, 1, 1),
	(4, 4, 1),
	(5, 2, 4),
	(6, 1, 1),
	(6, 4, 1),
	(6, 5, 1),
	(7, 5, 5),
	(8, 4, 3),
	(9, 2, 1),
	(10, 1, 1),
	(10, 4, 1),
	(11, 1, 1),
	(12, 2, 2),
	(12, 4, 2),
	(13, 4, 1),
	(13, 5, 1),
	(13, 2, 1),
	(14, 2, 2),
	(15, 1, 1),
	(16, 2, 1),
	(16, 4, 1),
	(16, 5, 1),
	(17, 1, 2),
	(17, 2, 3),
	(18, 1, 4),
	(18, 5, 1),
	(19, 1, 1),
	(19, 2, 1),
	(19, 4, 1),
	(19, 5, 1),
	(20, 5, 3),
	(21, 2, 2),
	(21, 4, 1);
/*!40000 ALTER TABLE `tetel` ENABLE KEYS */;

-- Struktúra mentése tábla pizzabolt. vevo
CREATE TABLE IF NOT EXISTS `vevo` (
  `id` int(6) NOT NULL DEFAULT 0,
  `nev` varchar(30) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `cim` varchar(30) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `telefon` varchar(9) COLLATE utf8mb3_hungarian_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése pizzabolt.vevo: ~8 rows (hozzávetőleg)
/*!40000 ALTER TABLE `vevo` DISABLE KEYS */;
INSERT INTO `vevo` (`id`, `nev`, `cim`, `telefon`) VALUES
	(1, 'Hapci', '', NULL),
	(2, 'Vidor', '', NULL),
	(3, 'Tudor', '', NULL),
	(4, 'Kuka', '', NULL),
	(5, 'Szende', '', NULL),
	(6, 'Szundi', '', NULL),
	(7, 'Morgó', '', NULL),
	(8, 'Hófehérke', 'Kerekerdő 1.', '145789631');
/*!40000 ALTER TABLE `vevo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
