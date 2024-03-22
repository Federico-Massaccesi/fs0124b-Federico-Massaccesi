import { Component } from '@angular/core';
import { iSingolaAuto } from '../Models/interface';
import { FetchMetodiService } from '../fetch-metodi.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrl: './ford.component.scss'
})
export class FordComponent {

  allFord:iSingolaAuto[]= []


  constructor(private carsService:FetchMetodiService){}

  ngOnInit(){

    this.carsService.getFord()
    .then(res=> this.allFord = res)
  }

}
