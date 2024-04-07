import { Component } from '@angular/core';
import { SpawnService } from '../spawn.service';
import { iUser } from '../../Models/i-user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.scss'
})
export class UsersComponent {

  constructor(private spawnSvc:SpawnService){}

  usersArr:iUser[]=[]

  ngOnInit(){

    this.spawnSvc.getUsers().subscribe(data=>{


      this.usersArr = data

    })



  }

}
