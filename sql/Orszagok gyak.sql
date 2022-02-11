-- Orszagok gyakorlófeladatok:
-- M-el kezdődő országok adatai:

SELECT * FROM orszagok
WHERE orszag LIKE 'M%';



-- M-el kezdődő országok száma:

SELECT COUNT(*) AS orszagok_szama
FROM orszagok
WHERE orszag LIKE 'M%';



-- M-el kezdődő országok adatai név szerint csökkenő sorrendben:

SELECT * FROM orszagok
WHERE orszag LIKE 'M%'
ORDER BY orszag DESC;



-- Az országok átlagterülete 2 tizedesre:

SELECT ROUND(AVG(terulet), 2) AS orszagok_atlagos_területe
FROM orszagok;



-- Az országok átlagterülete 2 tizedesre:

SELECT ROUND(AVG(nepesseg), 2) AS orszagok_atlagos_nepessege
FROM orszagok;



-- Különböző államformák száma:

SELECT COUNT(DISTINCT allamforma) AS államformak_szama
FROM orszagok;



-- Országok száma államformánként:

SELECT allamforma, COUNT(allamforma) AS orszagok_szama
FROM orszagok
GROUP BY allamforma;



-- Országok népsűrűsége:

SELECT orszag, ROUND(nepesseg * 1000 / terulet, 2) AS 'fo/km2'
FROM orszagok;



-- Föld legsűrűbben lakott országa:

SELECT * FROM orszagok
WHERE ROUND(nepesseg * 1000 / terulet, 2) = 
 (SELECT MAX(ROUND(nepesseg * 1000 / terulet, 2)) FROM orszagok);



-- Föld legritkábban lakott országa:

SELECT * FROM orszagok
WHERE ROUND(nepesseg * 1000 / terulet, 2) = 
 (SELECT MIN(ROUND(nepesseg * 1000 / terulet, 2)) FROM orszagok);



-- Legnagyobb ország:

SELECT * FROM orszagok
WHERE terulet = (SELECT MAX(terulet) FROM orszagok);



-- Legkisebb ország:

SELECT * FROM orszagok
WHERE terulet = (SELECT MIN(terulet) FROM orszagok);



-- A 3 ország, melyek területének nagysága a legközelebb van Magyarország területének nagyságához:

SELECT * FROM orszagok
WHERE orszag <> 'MAGYARORSZÁG'
ORDER BY ABS(terulet - (SELECT terulet FROM orszagok WHERE orszag = 'MAGYARORSZÁG'))
LIMIT 3;



-- Az M betűvel kezdődő országok fővárosai:

SELECT fovaros, orszag
FROM orszagok
WHERE orszag LIKE 'M%';



-- Az M betűvel kezdődő országok terület szerint növekvő sorrendben:

SELECT * FROM orszagok
WHERE orszag LIKE 'M%'
ORDER BY terulet;