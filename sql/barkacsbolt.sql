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


-- Adatbázis struktúra mentése a barkacsbolt.
CREATE DATABASE IF NOT EXISTS `barkacsbolt` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_hungarian_ci */;
USE `barkacsbolt`;

-- Struktúra mentése tábla barkacsbolt. elado
CREATE TABLE IF NOT EXISTS `elado` (
  `id` int(3) NOT NULL DEFAULT 0,
  `nev` varchar(25) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `telefon` varchar(12) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése barkacsbolt.elado: ~5 rows (hozzávetőleg)
/*!40000 ALTER TABLE `elado` DISABLE KEYS */;
INSERT INTO `elado` (`id`, `nev`, `telefon`) VALUES
	(1, 'Hurrikán', '123456'),
	(2, 'Gyalogkakukk', '666666'),
	(3, 'Gömbvillám', '888888'),
	(4, 'Szélvész', '258369'),
	(5, 'Imperial', '987654');
/*!40000 ALTER TABLE `elado` ENABLE KEYS */;

-- Struktúra mentése tábla barkacsbolt. rendeles
CREATE TABLE IF NOT EXISTS `rendeles` (
  `id` int(8) NOT NULL DEFAULT 0,
  `vasarlo_id` int(6) NOT NULL DEFAULT 0,
  `elado_id` int(3) NOT NULL DEFAULT 0,
  `datum` date NOT NULL DEFAULT '0000-00-00',
  `ido` float NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése barkacsbolt.rendeles: ~21 rows (hozzávetőleg)
/*!40000 ALTER TABLE `rendeles` DISABLE KEYS */;
INSERT INTO `rendeles` (`id`, `vasarlo_id`, `elado_id`, `datum`, `ido`) VALUES
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

-- Struktúra mentése tábla barkacsbolt. termek
CREATE TABLE IF NOT EXISTS `termek` (
  `id` int(3) NOT NULL DEFAULT 0,
  `nev` varchar(15) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `ar` int(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése barkacsbolt.termek: ~6 rows (hozzávetőleg)
/*!40000 ALTER TABLE `termek` DISABLE KEYS */;
INSERT INTO `termek` (`id`, `nev`, `ar`) VALUES
	(1, 'csavarbehajto', 22000),
	(2, 'tetolec', 1200),
	(3, 'csavarok', 780),
	(4, 'kalapacs', 3100),
	(5, 'lancfuresz', 65000),
	(6, 'faragaszto', 990);
/*!40000 ALTER TABLE `termek` ENABLE KEYS */;

-- Struktúra mentése tábla barkacsbolt. tetel
CREATE TABLE IF NOT EXISTS `tetel` (
  `rendeles_id` int(8) NOT NULL DEFAULT 0,
  `termek_id` int(3) NOT NULL DEFAULT 0,
  `db` int(3) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése barkacsbolt.tetel: ~37 rows (hozzávetőleg)
/*!40000 ALTER TABLE `tetel` DISABLE KEYS */;
INSERT INTO `tetel` (`rendeles_id`, `termek_id`, `db`) VALUES
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

-- Struktúra mentése tábla barkacsbolt. vasarlo
CREATE TABLE IF NOT EXISTS `vasarlo` (
  `id` int(6) NOT NULL DEFAULT 0,
  `nev` varchar(30) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  `cim` varchar(30) COLLATE utf8mb3_hungarian_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;

-- Tábla adatainak mentése barkacsbolt.vasarlo: ~7 rows (hozzávetőleg)
/*!40000 ALTER TABLE `vasarlo` DISABLE KEYS */;
INSERT INTO `vasarlo` (`id`, `nev`, `cim`) VALUES
	(1, 'Hapci', ''),
	(2, 'Vidor', ''),
	(3, 'Tudor', ''),
	(4, 'Kuka', ''),
	(5, 'Szende', ''),
	(6, 'Szundi', ''),
	(7, 'Morgó', '');
/*!40000 ALTER TABLE `vasarlo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
