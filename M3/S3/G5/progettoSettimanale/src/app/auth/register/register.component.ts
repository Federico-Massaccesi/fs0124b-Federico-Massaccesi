import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { iUser } from '../../Models/i-user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

  constructor(private authSvc:AuthService,private router:Router){}

  newUser:Partial<iUser> = {}

  alertAppear:boolean=false

  mandaDati(){

      this.authSvc.register(this.newUser)
      .subscribe(data=>{



        this.router.navigate(['auth/login'])
      })
  }

}
