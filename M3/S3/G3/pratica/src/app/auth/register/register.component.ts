import { iUser } from './../../Models/user';
import { Component } from '@angular/core';
import { ServiceService } from '../auth.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

 constructor(private authSvc:ServiceService,
  private router:Router
  ){}

  registerData:Partial<iUser> = {}

  mandaDati(){

    this.authSvc.register(this.registerData).subscribe(dati=>{

      this.router.navigate(['login'])
    })



  }

}

