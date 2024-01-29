/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/*  All'interno di JavaScript si possono identificare diversi tipi di datatypes. Il primo è la stringa: un datatype che
  descrive un contenuto di testo o numeri all'interno del testo.
  Il contenuto di questa variabile deve essere delimitato da 2 apici.
    Un altro datatype è quello che riguarda i numeri. Deve contenere solo ed esclusivamente numeri. Il contenuto della variabile 
  non deve essere delimitato da nessun elemento.
    Il datatype boolean invece viene usato per definire quelle variabili che avranno come risposta vero o falso. 
    Infine gli array definiscono una lista di elementi (racchiusi tra le parentesi quadre []) e
      gli oggetti si riferiscono a quelle coppie di elementi che sono legate da un legame chiave-valore.
  */

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

let myName = 'Federico'
console.log(myName)

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

let number1 = 12
let number2 = 20
console.log(number1 + number2)
console.log(12+20)

/* Ho scritto entrambi perchè non avevo capito se l'esercizio si riferisse a uno o l'altro*/


/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x = 12 

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

 myName = 'Massaccesi'
 console.log(myName)
 
 /* Al tentativo di sovrascrivere un valore ad una variabile dichiarata con const 
 const myTown = 'Osimo'
 myTown = 'Sirolo'
 Nella console del browser ci verrà presentato questo errore:
 Assignment to constant variable.
 in quanto il costrutto const non può essere riassegnato, tranne nel caso in cui il valore sia contenuto in un blocco {} 
 */



/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

console.log( 4 - x )

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

let name1 = 'john'
let name2 = 'John'
console.log( name1 == name2 )
console.log( name1 == name2.toLowerCase() )

