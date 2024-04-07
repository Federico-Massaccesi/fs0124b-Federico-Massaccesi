import { Component } from '@angular/core';
import { AuthService } from '../../auth/auth.service';
import { Router } from '@angular/router';
import { iMovies } from '../../Models/movie';
import { SpawnService } from '../spawn.service';

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

  ngOnInit(){

   this.loggedOrNot =  this.authSvc.getAccessToken()

    // this.authSvc.isLoggedIn = this.authSvc.getAccessToken()

    this.spawnSvc.getMovies().subscribe(data =>{

      this.moviesArr = data
    })

  }

  aggiungiPreferiti(el:iMovies){

    this.spawnSvc.pushFavorites(el).subscribe()

  }

}
