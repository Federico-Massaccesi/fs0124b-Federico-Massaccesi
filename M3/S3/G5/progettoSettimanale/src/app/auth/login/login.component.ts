import { Component } from '@angular/core';
import { iLoginData } from '../../Models/i-user';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  loginData:Partial<iLoginData> = {}

  constructor(
    private authSvc:AuthService,
    private router:Router
  ){}

  ngOnInit(){

    this.authSvc.isLoggedIn = this.authSvc.getAccessToken()

  }

  signIn(){

    this.authSvc.login(this.loginData)
    .subscribe(data=>{

      this.router.navigate(['/'])
    })

  }

}
