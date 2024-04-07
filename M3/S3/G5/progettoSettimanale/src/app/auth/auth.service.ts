import { iAccessData, iLoginData, iUser } from './../Models/i-user';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, Observable, Subject, map, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http:HttpClient,
    private router:Router
  ) {

    this.restoreUser()

   }

  jwtHelper:JwtHelperService = new JwtHelperService()

  isLoggedIn:boolean= false

  authSubject = new BehaviorSubject<iUser|null>(null)

  $user = this.authSubject.asObservable()


  registerUrl:string = 'http://localhost:3000/register'
  loginUrl:string = 'http://localhost:3000/login'

  register(newUser:Partial<iUser>){

     return this.http.post(this.registerUrl,newUser)
  }

  login(newUser:Partial<iLoginData>):Observable<iAccessData>{



    return this.http.post<iAccessData>(this.loginUrl,newUser)
    .pipe(tap(data=>{

      this.authSubject.next(data.user)
      localStorage.setItem('accessData',JSON.stringify(data))

      localStorage.setItem('infoUser',JSON.stringify(data.user))


    }))
  }

  logout(){



    this.authSubject.next(null)

    localStorage.removeItem('accessData')



    this.router.navigate(['/auth/login'])


  }


  autoLogout(jwt:string){

    let expDate = this.jwtHelper.getTokenExpirationDate(jwt) as Date

    let expMs = expDate.getTime() - new Date().getTime()

    setTimeout(()=>{

      this.logout()

    },expMs)



  }

  restoreUser(){

    let user = localStorage.getItem('accessData')

    if(!user) return

    let accessData:iAccessData = JSON.parse(user)

    if(this.jwtHelper.isTokenExpired(accessData.accessToken)) return

    this.authSubject.next(accessData.user)

    this.autoLogout(accessData.accessToken)

  }

  getAccessToken():boolean{

   let token = localStorage.getItem('accessData')

    if(!token){
      return false
    }else{

      return true
    }

  }

}
