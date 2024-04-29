--SELECT * FROM "EsercizioG1"."Clienti"

--SELECT * FROM "EsercizioG1"."Clienti"
--WHERE nome = 'Mario'

--SELECT nome,cognome FROM "EsercizioG1"."Clienti"
--WHERE anno_di_nascita = 1982

--SELECT * FROM "EsercizioG1"."Fatture"

--WHERE iva = 22

--SELECT * FROM "EsercizioG1"."Prodotti"
--WHERE extract (year FROM data_attivazione) = 2017 AND (in_produzione = true OR in_commercio = true)

--SELECT *
--FROM "EsercizioG1"."Clienti" c
--JOIN "EsercizioG1"."Fatture" f

--ON c.numero_clienti = f.id_cliente
--WHERE f.importo < 1000


--SELECT numero_fattura, importo, iva, data_fattura, denominazione 
--FROM "EsercizioG1"."Fatture" fat
--JOIN "EsercizioG1"."Fornitori" forn
--ON fat.numero_fornitore = forn.numero_fornitore


--SELECT extract(year from data_fattura) anno, count (*) count_fatture

--FROM "EsercizioG1"."Fatture" fat

--WHERE fat.iva = 20
--GROUP BY anno

--SELECT extract(year from data_fattura) anno, count (*) count_fatture, sum(importo)
--FROM "EsercizioG1"."Fatture" fat
--GROUP BY anno


SELECT extract(year from data_fattura) AS anno
FROM "EsercizioG1"."Fatture" fat
WHERE tipologia = 'A'
HAVING count(*) > 2
GROUP BY extract(year from data_fattura)


GROUP BY anno 