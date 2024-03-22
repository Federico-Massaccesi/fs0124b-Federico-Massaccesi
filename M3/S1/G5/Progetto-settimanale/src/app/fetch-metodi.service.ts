import { Injectable } from '@angular/core';
import { iSingolaAuto } from './Models/interface';

@Injectable({
  providedIn: 'root'
})
export class FetchMetodiService {



    getAllCars(): Promise <iSingolaAuto[]>{

      return fetch('../assets/db.json')
      .then(res=> res.json())
      .then((res:iSingolaAuto[]) => res);

    }


    randomIndex(x:number): number {
      let randomNumber: number = Math.floor(Math.random() * x);
      return randomNumber;
    }

    getFord(){

      return this.getAllCars()
      .then(res=> res.filter(res => res.brand == 'Ford'))
    }
    getAudi(){

      return this.getAllCars()
      .then(res=> res.filter(res => res.brand == 'Audi'))
    }
    getFiat(){

      return this.getAllCars()
      .then(res=> res.filter(res => res.brand == 'Fiat'))
    }

    getCarByModel(modelId:string):Promise<iSingolaAuto | undefined>{

      return this.getAllCars()
      .then(res => res.find(auto => auto.model == modelId))
    }
  }


