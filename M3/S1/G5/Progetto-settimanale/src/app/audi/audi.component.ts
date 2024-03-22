import { Component } from '@angular/core';
import { iSingolaAuto } from '../Models/interface';
import { FetchMetodiService } from '../fetch-metodi.service';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrl: './audi.component.scss'
})
export class AudiComponent {


  allAudi:iSingolaAuto[]= []


  constructor(private carsService:FetchMetodiService){}

  ngOnInit(){

    this.carsService.getAudi()
    .then(res=> this.allAudi = res)
  }
}
