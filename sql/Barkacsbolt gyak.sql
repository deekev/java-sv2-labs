-- Barkácsbolt SQL feladatok 
-- A feladatot a barkacsbolt.sql fájl importálásával kell kezdeni. A feladatokat az így importált barkacsbolt adatbázison végezd el.

-- Mely termékek drágábbak 1000 Ft-nál? (2 pont)

SELECT * FROM termek
WHERE ar > 1000;



-- Hányszor rendelt termékeket Morgó? (3 pont)

SELECT COUNT(rendeles.id) AS 'Morgó_rendeléseinek_száma'
FROM rendeles
JOIN vasarlo ON vasarlo.id = rendeles.vasarlo_id
WHERE vasarlo.nev = 'Morgó';



-- Ki vásárolta meg az egyes rendeléseket? A nevét is jelenítsd meg! Az eredményoszlopot nevezd el „ugyfel” néven!  (4 pont)

SELECT rendeles.*, vasarlo.nev AS ugyfel
FROM rendeles
JOIN vasarlo ON vasarlo.id = rendeles.vasarlo_id;



-- Hány darabot rendeltek összesen az egyes termékekből? A termékek árát is jelenítsd meg! (4 pont)

SELECT termek.*, sum(tetel.db) AS 'összes_megrendelt_darab'
FROM termek
LEFT JOIN tetel ON termek.id = tetel.termek_id
GROUP BY termek.id;



-- Mely rendelések történtek délután? A megrendelt termékek nevét is jelenítsd meg! (4 pont)

SELECT rendeles.*, termek.nev FROM rendeles
JOIN tetel ON rendeles.id = tetel.rendeles_id
JOIN termek ON tetel.termek_id = termek.id
WHERE rendeles.ido > 12;
 


-- Melyik a legolcsóbb termék? Az árát, az azonosítóját és a nevét is listázd ki! (3 pont)

SELECT * FROM termek
WHERE ar = (SELECT MIN(ar) FROM termek);



-- Mely termékek olcsóbbak 1000 Ft-nál? (2 pont)

SELECT * FROM termek
WHERE ar < 1000;



-- Hányszor rendelt termékeket Szende? (3 pont)

SELECT COUNT(rendeles.id) AS 'Szende_rendeléseinek_száma'
FROM rendeles
JOIN vasarlo ON vasarlo.id = rendeles.vasarlo_id
WHERE vasarlo.nev = 'Szende';



-- Ki adta el az egyes rendeléseket? A nevét is jelenítsd meg! Az eredményoszlopot nevezd el „elado” néven!  (4 pont)

SELECT rendeles.*, elado.nev AS 'elado'
FROM rendeles
JOIN elado ON elado.id = rendeles.elado_id;



-- Hány darabot rendeltek összesen az egyes termékekből? A termékek nevét is jelenítsd meg! (4 pont)

SELECT termek.nev, SUM(tetel.db) AS osszes_eladott_termek
FROM tetel
RIGHT JOIN termek ON tetel.termek_id = termek.id
GROUP BY termek.nev;



-- Mely rendelések történtek délelőtt? A megrendelt termék nevét is jelenítsd meg! (4 pont)

SELECT rendeles.*, termek.nev FROM rendeles
JOIN tetel ON rendeles.id = tetel.rendeles_id
JOIN termek ON tetel.termek_id = termek.id
WHERE rendeles.ido < 12;



-- Melyik a legdrágább termék? Az árát, az azonosítóját és a nevét is listázd ki! (4 pont)

SELECT * FROM termek
WHERE ar = (SELECT MAX(ar) FROM termek);



-- Melyek azok a termékek, amelyekből még nem történt eladás, azaz csak porosodnak a raktárban? (4 pont)

SELECT * FROM termek
LEFT JOIN tetel ON termek.id = tetel.termek_id
WHERE termek.id NOT IN (SELECT DISTINCT termek_id FROM tetel);