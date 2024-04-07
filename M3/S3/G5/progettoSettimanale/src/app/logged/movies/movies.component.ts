import { Component } from '@angular/core';
import { AuthService } from '../../auth/auth.service';
import { Router } from '@angular/router';
import { iMovies } from '../../Models/movie';
import { SpawnService } from '../spawn.service';
import { iUser } from '../../Models/i-user';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.scss'
})
export class MoviesComponent {

  constructor(private authSvc:AuthService,
    private router:Router,
  private spawnSvc: SpawnService
  ){}

  loggedOrNot!:boolean

  moviesArr:iMovies[] =[]

  user!:iUser


  ngOnInit(){

   this.loggedOrNot =  this.authSvc.getAccessToken()

    // this.authSvc.isLoggedIn = this.authSvc.getAccessToken()

    this.spawnSvc.getMovies().subscribe(data =>{

      this.moviesArr = data
    })

    let userString = localStorage.getItem('infoUser')

   if(userString !== null){

     this.user = JSON.parse(userString)

   }else{

    return

   }

  }

  aggiungiPreferiti(el:iMovies){


    if(!el.userId){

      el.userId = []

    el.userId.push(this.user.id)
    }else{
      el.userId.push(this.user.id)
    }

    this.spawnSvc.pushFavorites(el).subscribe()

  }



}
