import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { iMovies } from '../Models/movie';
import { iUser } from '../Models/i-user';

@Injectable({
  providedIn: 'root'
})
export class SpawnService {

  constructor(private http:HttpClient) { }

  moviesUrl = 'http://localhost:3000/popularMovies'

  userUrl ='http://localhost:3000/users'

  favoritesUrl= 'http://localhost:3000/favorites'

  getMovies(){

    return this.http.get<iMovies[]>(this.moviesUrl)

  }

  getUsers(){

    return this.http.get<iUser[]>(this.userUrl)
  }
  getFavorites(){

    return this.http.get<iMovies[]>(this.favoritesUrl)
  }

  pushFavorites(el:iMovies){

   return this.http.post(this.favoritesUrl, el)


  }



}
