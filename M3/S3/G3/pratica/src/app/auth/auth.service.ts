import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import { iLoginData, iUser } from '../Models/user';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  helper:JwtHelperService = new JwtHelperService()

  subject:iLoginData

  urlRegister:string = 'http://localhost:3000/register'

  urlLogin:string = 'http://localhost:3000/login'

  constructor(private http:HttpClient){}

  register(user:Partial<iUser>){

    return this.http.post(this.urlRegister,user)

  }

  login(loginData:iLoginData){

    return this.http.post(this.urlLogin,loginData).pipe(tap(data=>{




    }))

  }


}
