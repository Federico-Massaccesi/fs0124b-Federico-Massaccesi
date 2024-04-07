import { Component } from '@angular/core';
import { AuthService } from '../../auth/auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.scss'
})
export class HeaderComponent {



  constructor(private authSvc: AuthService){}

  logout(){


    this.authSvc.logout()

  }




  // ngOnInit(){

  //   this.authSvc.$valid.subscribe(data=> {

  //     this.loggedOrNot = data
  //   })



  }





