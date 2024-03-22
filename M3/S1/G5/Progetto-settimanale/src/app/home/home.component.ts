import { Component } from '@angular/core';
import { iSingolaAuto } from '../Models/interface';
import { FetchMetodiService } from '../fetch-metodi.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})

export class HomeComponent {


  tutteLeAuto: iSingolaAuto[]= []

  autoEsposizioneHome: iSingolaAuto[]= []

  onlyBrand:string[]=[]


  constructor(private carsService:FetchMetodiService){}

  ngOnInit(){

    this.carsService.getAllCars().then(res=>{

      this.tutteLeAuto = res


      for (let i = 0; i < 2; i++) {

          this.autoEsposizioneHome.push
          (this.tutteLeAuto[this.carsService.randomIndex(this.tutteLeAuto.length)])





      }

      // for (const auto of this.tutteLeAuto) {


      //   if(!this.onlyBrand.includes(auto.brandLogo))

      //   this.onlyBrand.push(auto.brandLogo)


      // }
    })
  }


}
