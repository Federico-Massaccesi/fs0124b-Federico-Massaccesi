import { Component, Input } from '@angular/core';
import { UsersService } from '../users.service';
import { iUsers } from '../Models/users';

@Component({
  selector: 'app-single-user',
  templateUrl: './single-user.component.html',
  styleUrl: './single-user.component.scss'
})
export class SingleUserComponent {

  singleUser!:iUsers|undefined

nomeRicevuto!:string

foundOrNot!:boolean

onUserName(data:string){



  this.nomeRicevuto = data
}

constructor(private userSvc: UsersService){}

ngOnInit(){

  console.log(this.nomeRicevuto);

  this.singleUser = this.userSvc.user.find(p=> p.firstName == this.nomeRicevuto)

  if(this.singleUser == undefined){

    this.foundOrNot = true

  }else{

    console.log(this);

    this.foundOrNot= false

  }

}

}
