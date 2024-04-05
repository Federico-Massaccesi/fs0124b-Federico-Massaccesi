import { iAccessData, iLoginData, iUser } from './../Models/i-user';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, Observable, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpClient) { }

  jwtHelper:JwtHelperService = new JwtHelperService()

  isLoggedIn:boolean= false

  authSubject = new BehaviorSubject<iUser|null>(null)

  $user = this.authSubject.asObservable()

  registerUrl:string = 'http://localhost:3000/register'
  loginUrl:string = 'http://localhost:3000/login'

  register(newUser:Partial<iUser>){

     return this.http.post(this.registerUrl,newUser)
  }

  login(newUser:iLoginData):Observable<iAccessData>{

    return this.http.post<iAccessData>(this.loginUrl,newUser)
    .pipe(tap(data=>{

      this.authSubject.next(data.user)
      localStorage.setItem('accessData',JSON.stringify(data))

    }))
  }

}
