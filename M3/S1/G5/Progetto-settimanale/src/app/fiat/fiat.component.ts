import { Component } from '@angular/core';
import { FetchMetodiService } from '../fetch-metodi.service';
import { iSingolaAuto } from '../Models/interface';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrl: './fiat.component.scss'
})
export class FiatComponent {

  allFiat:iSingolaAuto[]= []


  constructor(private carsService:FetchMetodiService){}

  ngOnInit(){

    this.carsService.getFiat()
    .then(res=> this.allFiat = res)
  }
}
