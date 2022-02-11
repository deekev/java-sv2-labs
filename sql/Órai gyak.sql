-- Összekapcsolás JOIN nélkül:

SELECT * FROM naplo, diak
WHERE naplo.id = diak.naplo_id;




-- Összekapcsolás JOIN-nal:
SELECT * FROM naplo
JOIN diak ON naplo.id = diak.naplo_id;

SELECT * FROM naplo
LEFT JOIN diak ON naplo.id = diak.naplo_id;

SELECT * FROM naplo
RIGHT JOIN diak ON naplo.id = diak.naplo_id;

SELECT * FROM naplo
LEFT JOIN diak ON naplo.id = diak.naplo_id
UNION
SELECT * FROM naplo
RIGHT JOIN diak ON naplo.id = diak.naplo_id;




-- Több tábla összekapcsolása:
SELECT * FROM naplo
JOIN diak ON naplo.id = diak.naplo_id
JOIN jegy ON diak.id = jegy.diak_id;



-- VIEW létrehozása(nézet, változik ha az eredeti tábla változik):

CREATE VIEW suli.temp AS
SELECT * FROM diak;

-- Keresés view-ban:

SELECT nev FROM temp
WHERE temp.id = 1;




-- Változó létrehozás és index megadása változóval:

SELECT @diak_id := MAX(id) FROM diak; 
INSERT INTO diak
VALUES ((@diak_id + 1), 'Kiss Anna', '2010-06-06', 1);




-- Tranzakciók beállítása:
--autocommit alapértelmezetten be van állítva, lekérdezése:

SELECT @@autocommit;

-- autocommit kikapcsolása:
SET @@autocommit = 0;


-- tranzakció indítása:
START TRANSACTION;

-- kitöröltük a tábla összes adatát:
DELETE FROM orszagok;

-- megnéztük, hogy valóban törlődtek-e az adatok:
SELECT COUNT(*) FROM orszagok;

-- visszavontuk a törlést, ez a tranzakció miatt lehetséges:
ROLLBACK;

-- COMMIT; paranccsal viszont végrehajtódna a törlés visszavonhatatlanul.

-- autocommitot visszakapcsoltuk:
SET @@autocommit = 1;




-- HAVING példa (4-es átlagnál jobbakat adja vissza):

SELECT nev, round(AVG(jegy.ertek),1) AS atlag FROM diak
JOIN jegy ON diak.id = jegy.diak_id
GROUP BY nev
HAVING AVG(jegy.ertek) > 4;




-- Constraint(megszorítás):
-- oszlop létrehozása max.9 karakter hosszú varchar fér bele:
ALTER TABLE diak
ADD COLUMN taj VARCHAR(9);
 

-- így viszont ellenőrizni fogja, hogy pontosan 9 karakter legyen:

ALTER TABLE diak
MODIFY taj VARCHAR(9) CHECK (CHAR_LENGTH(taj) = 9);


-- reguláris kifejezéssel ugyanaz:

ALTER TABLE diak
MODIFY taj VARCHAR(9) CHECK (taj RLIKE '^[0-9]{9}$');


-- hibát ad, ha nem 9 karakter hosszú TAJ-t adunk:

INSERT INTO diak (`nev`, `szuldatum`, `naplo_id`, `taj`)
VALUES ('Kiss Anna', '2010-12-12', 1, '123456');


-- lefut, ha a constarint-nek megfelel:

INSERT INTO diak (`nev`, `szuldatum`, `naplo_id`, `taj`)
VALUES ('Kiss Emma', '2010-12-12', 1, '123456789');

