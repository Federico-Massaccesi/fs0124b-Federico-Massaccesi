import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FetchMetodiService } from '../fetch-metodi.service';
import { iSingolaAuto } from '../Models/interface';

@Component({
  selector: 'app-dettagli',
  templateUrl: './dettagli.component.html',
  styleUrl: './dettagli.component.scss'
})
export class DettagliComponent {

  elementoSelezionato!:iSingolaAuto;

  constructor(private router:ActivatedRoute,private carsService:FetchMetodiService){}



  ngOnInit(){

    this.router.params.subscribe((model:any)=>{

      console.log(model)

      this.carsService.getCarByModel(model.id)
      .then(res=> {

        if(res !== undefined){
          this.elementoSelezionato = res
        }

      })








    })
  }

}
