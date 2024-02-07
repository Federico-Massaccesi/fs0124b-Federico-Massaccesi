/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
    Dato il seguente array, scrivi del codice per stampare ogni elemento dell'array in console.
*/
const pets = ['dog', 'cat', 'hamster', 'redfish']

for(let i = 0;i< pets.length; i++){
  let ogniAnimale = pets[i]

  console.log(ogniAnimale);
}




/* ESERCIZIO 2
    Scrivi del codice per ordinare alfabeticamente gli elementi dell'array "pets".
*/

  let petAlpha = pets.sort()
     
    console.log(petAlpha)

/* ESERCIZIO 3
    Scrivi del codice per stampare nuovamente in console gli elementi dell'array "pets", questa volta in ordine invertito.
*/

let petReverse = pets.reverse()
console.log(petReverse)


/* ESERCIZIO 4
    Scrivi del codice per spostare il primo elemento dall'array "pets" in ultima posizione.
*/

  pets.push(pets.shift())

  console.log(pets);

/* ESERCIZIO 5
    Dato il seguente array di oggetti, scrivi del codice per aggiungere ad ognuno di essi una proprietà "licensePlate" con valore a tua scelta.
*/
const cars = [
  {
    brand: 'Ford',
    model: 'Fiesta',
    color: 'red',
    trims: ['titanium', 'st', 'active'],
  },
  {
    brand: 'Peugeot',
    model: '208',
    color: 'blue',
    trims: ['allure', 'GT'],
  },
  {
    brand: 'Volkswagen',
    model: 'Polo',
    color: 'black',
    trims: ['life', 'style', 'r-line'],
  },
]

  
 
for(let i =0;i<cars.length;i++){
 
  function minMax(min, max) {
    return Math.floor(Math.random() * (100000 , 999999) );
    
  }
  let licensePlate = minMax()
  cars[i].licensePlate = licensePlate
  

}
console.log(cars);



  

/* ESERCIZIO 6
    Scrivi del codice per aggiungere un nuovo oggetto in ultima posizione nell'array
     "cars",
    rispettando la struttura degli altri elementi.
    Successivamente, rimuovi l'ultimo elemento della proprietà "trims" da ogni auto.
*/

let newCar = {
  brand: 'Fiat' ,
  model: 'Panda' ,
  color: 'white',
  trims:['life','GT','st']
}

cars.push(newCar)

function x(){
for(let i = 0; i<cars.length;i++){

  cars[i].trims.splice(-1)
  
}
return cars
}
console.log(x())
/* ESERCIZIO 7
    Scrivi del codice per salvare il primo elemento della proprietà "trims" di ogni auto nel nuovo array "justTrims", sotto definito.
*/
const justTrims = []

for(let i = 0;i<cars.length;i++){

  const firstTrim= cars[i].trims.shift(0)
  justTrims.push(firstTrim)
  console.log(justTrims);
}

/* ESERCIZIO 8
    Cicla l'array "cars" e costruisci un if/else statament per mostrare due diversi messaggi in console. Se la prima lettera della proprietà
    "color" ha valore "b", mostra in console "Fizz". Altrimenti, mostra in console "Buzz".
*/

for (let i =0; i<cars.length;i++){

if(cars[i].color.charAt() === 'b'){
  console.log('Fizz');
}else{
  console.log('Buzz');
}

}

/* ESERCIZIO 9
    Utilizza un ciclo while per stampare in console i valori del seguente array numerico fino al raggiungimento del numero 32.
*/



const numericArray = [
  6, 90, 45, 75, 84, 98, 35, 74, 31, 2, 8, 23, 100, 32, 66, 313, 321, 105,
]

  let i = 0

while(numericArray[i] !== 32){

  console.log(numericArray[i]);
i++

}

/* ESERCIZIO 10
    Partendo dall'array fornito e utilizzando un costrutto switch, genera un nuovo array composto dalle posizioni di ogni carattere all'interno
    dell'alfabeto italiano.
    es. [f, b, e] --> [6, 2, 5]
*/
const charactersArray = ['g', 'n', 'u', 'z', 'd']


  let alphabet = 'abcdefghijklmnopqrstuvwxyz'

  let alphaArray=alphabet.split('')

 for(let i =0;i<alphaArray.length;i++){

  switch(alphaArray[i]){

    case alphaArray[i] === charactersArray[0]:
    console.log(alphaArray[i]);
    break 
  }

 }
 
 //26 case 






