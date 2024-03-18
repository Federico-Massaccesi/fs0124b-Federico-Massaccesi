interface sim {

    credito:number;
    
    numeroChiamate:number

}
let costoMinuto:number= 0.20

class User implements sim{
    nome:string
    cognome:string

    credito= 0
    numeroChiamate= 0
    constructor(_nome:string,_cognome:string){

        this.nome= _nome
        this.cognome= _cognome
        
    }

    ricarica(ammontare:number):void{

        this.credito+=ammontare

      console.log(this.credito)
       
    }

    chiamata(minutiChiamata:number):void{

       let daScalare= minutiChiamata*costoMinuto
       
       console.log(this.credito - daScalare) 
    }
    
    chiama404():number{

        return this.credito
    }

    azzeraChiamate():void{

        this.numeroChiamate = 0 
    }
}

let user1 = new User('Mario','Rossi') 


user1.ricarica(7),user1.chiamata(5)

console.log(user1.chiama404());

