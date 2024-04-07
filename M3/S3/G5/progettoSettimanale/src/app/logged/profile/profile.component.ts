import { Component } from '@angular/core';
import { SpawnService } from '../spawn.service';
import { iUser } from '../../Models/i-user';
import { iMovies } from '../../Models/movie';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.scss'
})
export class ProfileComponent {

  constructor(private spawnSvc: SpawnService){}

  user!:iUser

  favoritesArr:iMovies[]=[]

  ngOnInit(){

    let userString = localStorage.getItem('infoUser')

   if(userString !== null){

     this.user = JSON.parse(userString)

   }else{

    return

   }

  //  this.spawnSvc.getFavorites().subscribe(data=>{

  //   this.favoritesArr = data.filter(el=>{

  //     el.userId.includes(this.user.id)

  //   })

    //stavo provando a prendere solo i film messi tra i preferiti dallo specifico utente
    //collegandomi con la funzione nel modulo movies ma niente. se riesci a spiegarmelo
    //e lasciarmelo negli annotamenti quando metti il voto ti ringrazio tanto.

  //  })

  this.spawnSvc.getFavorites().subscribe(data=>{

    this.favoritesArr = data
  })

  }





}
