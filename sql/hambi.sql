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


-- Adatbázis struktúra mentése a hambi.
CREATE DATABASE IF NOT EXISTS `hambi` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `hambi`;

-- Struktúra mentése tábla hambi. categories
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.categories: ~2 rows (hozzávetőleg)
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` (`id`, `name`, `description`) VALUES
	(1, 'étel', 'ételek'),
	(2, 'üdítőitalok', 'italok');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. customers
CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `contact` varchar(100) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `postal_code` int(11) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name_contact` (`name`,`contact`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.customers: ~44 rows (hozzávetőleg)
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` (`id`, `name`, `contact`, `address`, `city`, `postal_code`, `country`) VALUES
	(1, 'Alfred Schmidt', 'Maria Anders', 'Obere Str. 57', 'Frankfurt', 12209, 'Germany'),
	(2, 'Ana Trujillo Emparedados y helados', 'Ana Trujillo', 'Avda. de la Constitución 2222', 'México D.F.', 5021, 'Mexico'),
	(3, 'Antonio Moreno Taquería', 'Antonio Moreno', 'Mataderos 2312', 'México D.F.', 5023, 'Mexico'),
	(4, 'Blauer See Delikatessen', 'Hanna Moos', 'Forsterstr. 57', 'Mannheim', 68306, 'Germany'),
	(5, 'Blondel père et fils', 'Frédérique Citeaux', '24, place Kléber', 'Strasbourg', 67000, 'France'),
	(7, 'Hungry Coyote Import Store', 'Yoshi Latimer', 'City Center Plaza 516 Main St.', 'Elgin', 97827, 'USA'),
	(8, 'Königlich Essen', 'Philip Cramer', 'Maubelstr. 90', 'Brandenburg', 14776, 'Germany'),
	(9, 'LILA-Supermercado', 'Carlos González', 'Carrera 52 con Ave. Bolívar #65-98 Llano Largo', 'Barquisimeto', 3508, 'Venezuela'),
	(10, 'LINO-Delicateses', 'Felipe Izquierdo', 'Ave. 5 de Mayo Porlamar', 'I. de Margarita', 4980, 'Venezuela'),
	(11, 'Lonesome Pine Restaurant', 'Fran Wilson', '89 Chiaroscuro Rd.', 'Portland', 97219, 'USA'),
	(12, 'Magazzini Alimentari Riuniti', 'Giovanni Rovelli', 'Via Ludovico il Moro 22', 'Bergamo', 24100, 'Italy'),
	(13, 'Morgenstern Gesundkost', 'Alexander Feuer', 'Heerstr. 22', 'Leipzig', 4179, 'Germany'),
	(14, 'Océano Atlántico Ltda.', 'Yvonne Moncada', 'Ing. Gustavo Moncada 8585 Piso 20-A', 'Buenos Aires', 1010, 'Argentina'),
	(15, 'Old World Delicatessen', 'Rene Phillips', '2743 Bering St.', 'Anchorage', 99508, 'USA'),
	(16, 'Ottilies Käseladen', 'Henriette Pfalzheim', 'Mehrheimerstr. 369', 'Köln', 50739, 'Germany'),
	(17, 'Paris spécialités', 'Marie Bertrand', '265, boulevard Charonne', 'Paris', 75012, 'France'),
	(18, 'Pericles Comidas clásicas', 'Guillermo Fernández', 'Calle Dr. Jorge Cash 321', 'México D.F.', 5033, 'Mexico'),
	(19, 'Piccolo und mehr', 'Georg Pipps', 'Geislweg 14', 'Salzburg', 5020, 'Austria'),
	(20, 'Princesa Isabel Vinhoss', 'Isabel de Castro', 'Estrada da saúde n. 58', 'Lisboa', 1756, 'Portugal'),
	(21, 'QUICK-Stop', 'Horst Kloss', 'Taucherstraße 10', 'Cunewalde', 1307, 'Germany'),
	(22, 'Rancho grande', 'Sergio Gutiérrez', 'Av. del Libertador 900', 'Buenos Aires', 1010, 'Argentina'),
	(23, 'Rattlesnake Canyon Grocery', 'Paula Wilson', '2817 Milton Dr.', 'Albuquerque', 87110, 'USA'),
	(24, 'Reggiani Caseifici', 'Maurizio Moroni', 'Strada Provinciale 124', 'Reggio Emilia', 42100, 'Italy'),
	(25, 'Richter Supermarkt', 'Michael Holz', 'Grenzacherweg 237', 'Genève', 1203, 'Switzerland'),
	(26, 'Romero y tomillo', 'Alejandra Camino', 'Gran Vía, 1', 'Madrid', 28001, 'Spain'),
	(27, 'Santé Gourmet', 'Jonas Bergulfsen', 'Erling Skakkes gate 78', 'Stavern', 40007, 'Norway'),
	(28, 'Save-a-lot Markets', 'Jose Pavarotti', '187 Suffolk Ln.', 'Boise', 83720, 'USA'),
	(29, 'Simons bistro', 'Jytte Petersen', 'Vinbæltet 34', 'København', 1734, 'Denmark'),
	(30, 'Spécialités du monde', 'Dominique Perrier', '25, rue Lauriston', 'Paris', 75016, 'France'),
	(31, 'Split Rail Beer & Ale', 'Art Braunschweiger', 'P.O. Box 555', 'Lander', 82520, 'USA'),
	(32, 'The Big Cheese', 'Liz Nixon', '89 Jefferson Way Suite 2', 'Portland', 97201, 'USA'),
	(33, 'The Cracker Box', 'Liu Wong', '55 Grizzly Peak Rd.', 'Butte', 59801, 'USA'),
	(34, 'Toms Spezialitäten', 'Karin Josephs', 'Luisenstr. 48', 'Münster', 44087, 'Germany'),
	(35, 'Tortuga Restaurante', 'Miguel Angel Paolino', 'Avda. Azteca 123', 'México D.F.', 5033, 'Mexico'),
	(36, 'Die Wandernde Kuh', 'Rita Müller', 'Adenauerallee 900', 'Stuttgart', 70563, 'Germany'),
	(37, 'Wartian Herkku', 'Pirkko Koskitalo', 'Torikatu 38', 'Oulu', 90110, 'Finland'),
	(38, 'White Clover Markets', 'Karl Jablonski', '305 - 14th Ave. S. Suite 3B', 'Seattle', 98128, 'USA'),
	(39, 'Wilman Kala', 'Matti Karttunen', 'Keskuskatu 45', 'Helsinki', 21240, 'Finland'),
	(40, 'Kiss Róbert', 'Nagy Dalma', 'Október 23. u. 4.', 'Budapest', 1122, 'Hungary'),
	(41, 'Nagy Péter', 'Kovács Magdolna', 'Október 23. u. 4.', 'Kecskemét', 1122, 'Hungary'),
	(42, 'Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40007, 'Norway'),
	(43, 'Thor', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40007, 'Norway'),
	(44, 'Freya', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40007, 'Norway'),
	(45, 'Loki', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', 40007, 'Norway'),
	(47, 'Kiss Róbert', 'Nagy Alma', NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. employees
CREATE TABLE IF NOT EXISTS `employees` (
  `tsz` varchar(50) DEFAULT NULL,
  `nev` varchar(100) DEFAULT NULL,
  `sz_helye` varchar(100) DEFAULT NULL,
  `sz_ideje` date DEFAULT NULL,
  `fiz` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.employees: ~5 rows (hozzávetőleg)
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` (`tsz`, `nev`, `sz_helye`, `sz_ideje`, `fiz`) VALUES
	('T234578', 'Kiss István', 'Eger', '1968-12-11', 120000),
	('T3443234', 'Kiss Timót', 'Eger', '1972-01-28', 105000),
	('T456734', 'Nagy József', 'Budapest', '1972-01-30', 150000),
	('T768545', 'Vári Ödön', 'Budapest', '1958-07-12', 210000),
	('T429877', 'Kovács János', 'Szeged', '1967-05-12', 120000);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. log
CREATE TABLE IF NOT EXISTS `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `message` varchar(500) NOT NULL,
  `product_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `log_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.log: ~1 rows (hozzávetőleg)
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` (`id`, `message`, `product_id`) VALUES
	(2, 'm', 4);
/*!40000 ALTER TABLE `log` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. orders
CREATE TABLE IF NOT EXISTS `orders` (
  `id` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `order_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.orders: ~3 rows (hozzávetőleg)
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` (`id`, `customer_id`, `product_id`, `order_date`) VALUES
	(1, 2, 1, '2022-02-13 11:35:58'),
	(2, 1, 3, '2022-02-13 11:35:58'),
	(3, 3, 3, '2022-02-13 11:35:58');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. products
CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL CHECK (char_length(`name`) > 5),
  `description` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.products: ~5 rows (hozzávetőleg)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` (`id`, `name`, `description`, `price`, `category_id`) VALUES
	(1, 'hamburger', 'finom hambi', 1000, 1),
	(2, 'extra hús', 'plusz feltét', 300, 1),
	(3, 'pepsi cola', 'üdítőital', 400, 2),
	(4, 'coca cola', 'üdítőital', 400, 2),
	(5, 'extra sajt', NULL, NULL, NULL);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. product_to_category
CREATE TABLE IF NOT EXISTS `product_to_category` (
  `id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.product_to_category: ~4 rows (hozzávetőleg)
/*!40000 ALTER TABLE `product_to_category` DISABLE KEYS */;
INSERT INTO `product_to_category` (`id`, `product_id`, `category_id`) VALUES
	(1, 1, 1),
	(2, 2, 1),
	(3, 3, 2),
	(4, 4, 2);
/*!40000 ALTER TABLE `product_to_category` ENABLE KEYS */;

-- Struktúra mentése tábla hambi. suppliers
CREATE TABLE IF NOT EXISTS `suppliers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Tábla adatainak mentése hambi.suppliers: ~2 rows (hozzávetőleg)
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` (`id`, `name`, `city`, `country`) VALUES
	(1, 'BBQ', 'Budapest', 'Hungary'),
	(2, 'Craft', 'Győr', 'Hungary');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
