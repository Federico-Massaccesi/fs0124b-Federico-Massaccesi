"use strict";
let costoMinuto = 0.20;
class User {
    constructor(_nome, _cognome) {
        this.credito = 0;
        this.numeroChiamate = 0;
        this.nome = _nome;
        this.cognome = _cognome;
    }
    ricarica(ammontare) {
        this.credito += ammontare;
        console.log(this.credito);
    }
    chiamata(minutiChiamata) {
        let daScalare = minutiChiamata * costoMinuto;
        console.log(this.credito - daScalare);
    }
    chiama404() {
        return this.credito;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let user1 = new User('Mario', 'Rossi');
user1.ricarica(7), user1.chiamata(5);
console.log(user1.chiama404());
//# sourceMappingURL=script.js.map