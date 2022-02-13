-- Pizzabolt SQL feladatok
-- A feladatot a mellékelt pizzabolt.sql fájl importálásával kell kezdened. A feladatokat az így importált pizzabolt adatbázison kell végrehajtanod.

-- Listázd ki az összes pizzát név szerint csökkenő sorrendben! (2 pont)

SELECT * FROM pizza
ORDER BY nev;



-- Számold meg, hány futár van, akinek a neve nem ’G’ betűvel kezdődik!

SELECT COUNT(nev) AS futarok_szama_akiknek_a_neve_nem_g_betuvel_kezdodik
FROM futar
WHERE nev NOT LIKE 'G%';



-- Számold össze, hogy melyik dátumon hány darab megrendelés történt! (2 pont)

SELECT datum, COUNT(id) AS rendelesek_szama
FROM rendeles
GROUP BY datum;



-- Mely rendelések történtek délelőtt? (2 pont)

SELECT * FROM rendeles
WHERE ido < 12;



-- Átlagosan mennyibe kerül egy pizza? 1 tizedes pontossággal add meg a választ! Az eredményoszlopot nevezd el ’Atlag’ néven! (3 pont)

SELECT ROUND(AVG(ar), 1) AS Atlag
FROM pizza;



-- Listázd ki az összes megrendelés idejét, a megrendelő azonosítóját és a megrendelő nevét is! (3 pont)

SELECT rendeles.id AS rendeles_azonosito, rendeles.datum, rendeles.ido, 
  vevo.id AS vevo_azonosito, vevo.nev
FROM rendeles
JOIN vevo ON rendeles.vevo_id = vevo.id;



-- Szúrj be egy új oszlopot a vevo táblába! Az új mező típusa szöveges legyen, 9 karakter hosszú, a mező neve ’telefon’! (3 pont)

ALTER TABLE  vevo
ADD COLUMN telefon VARCHAR(9);



-- Szúrj be egy új rekordot a módosított vevo táblába! Minden mezőbe kerüljön adat! (3 pont)

SELECT @vevo_id := MAX(id) FROM vevo;
INSERT INTO vevo
VALUES ((@vevo_id + 1), 'Hófehérke', 'Kerekerdő 1.', '145789631');



-- Listázd ki az összes pizzafutárt név szerint csökkenő sorrendben! (2 pont)

SELECT nev FROM futar
ORDER BY nev DESC;



-- Számold meg, mennyi vásárló van, akinek a neve nem ’S’ betűvel kezdődik! (2 pont)

SELECT COUNT(*) AS nem_s_betuvel_kezdodo_nevu_vevok_szama 
FROM vevo
WHERE nev NOT LIKE 'S%';



-- Számold össze, hogy melyik dátumon mennyi darab megrendelés történt! (2 pont)

SELECT datum, COUNT(*) AS rendelesek_szama 
FROM rendeles
GROUP BY datum;


-- Mely rendelések történtek délután? (2 pont)

SELECT * FROM rendeles
WHERE ido > 12;


-- Átlagosan hány órakor rendelnek pizzát? 1 tizedes pontossággal add meg a választ! Az eredményoszlopot nevezd el ’Atlag’ néven! (3 pont)

SELECT ROUND(AVG(ido), 1) AS Atlag
FROM rendeles;


-- Listázd ki az összes megrendeléshez tartozó azonosítót, a megrendelés idejét és a megrendelő nevét is! (3 pont)

SELECT rendeles.id, rendeles.datum, rendeles.ido, vevo.nev
FROM rendeles
JOIN vevo ON rendeles.vevo_id = vevo.id;

 
-- Szúrj be egy új oszlopot a futar táblába! Az új mező típusa szám legyen, 4 karakter hosszú, a mező neve ’szuletesi_ev’! (3 pont)

ALTER TABLE futar
ADD COLUMN szuletesi_ev INT(4);


-- Szúrj be egy új rekordot a futar táblába! Minden mezőbe kerüljön adat! (3 pont)

INSERT INTO futar
VALUES(6, 'Quicksilver', '567891', 1986);


-- Listázd ki az összes vásárlót név szerint csökkenő sorrendben! (2 pont)

SELECT vevo.nev
FROM vevo
ORDER BY nev DESC;


-- Átlagosan mennyi pizzát rendelnek egy alkalommal? 1 tizedes pontossággal add meg a választ! Az eredményoszlopot nevezd el ’Atlag’ néven! (3 pont)

SELECT ROUND(AVG(db), 1) AS Atlag
FROM tetel;


-- Listázd ki az összes megrendeléshez tartozó azonosítót, a megrendelő azonosítóját és a megrendelő nevét is! (3 pont)

SELECT rendeles.id, rendeles.vevo_id, vevo.nev
FROM rendeles
JOIN vevo ON rendeles.vevo_id = vevo.id;


-- Szúrj be egy új oszlopot a pizza táblába! Az új mező típusa szám legyen, 4 karakter hosszú, a mező neve ’atmero’! (3 pont)

ALTER TABLE pizza
ADD COLUMN atmero INT(4);

-- Szúrj be egy új rekordot a pizza táblába! Minden mezőbe kerüljön adat! (3 pont)

INSERT INTO pizza
VALUES(6, 'Margarita', 720, 32);