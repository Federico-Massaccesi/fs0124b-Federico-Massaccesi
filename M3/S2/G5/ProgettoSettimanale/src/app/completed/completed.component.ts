import { Component } from '@angular/core';
import { TodoService } from '../todo.service';
import { UsersService } from '../users.service';
import { iTodo } from '../Models/todo';
import { iUsers } from '../Models/users';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrl: './completed.component.scss'
})
export class CompletedComponent {

  completedArr:iTodo[]=[]

  userArr:iUsers[]=[]

  constructor(private todoSvc:TodoService, private userSvc:UsersService){}

  ngOnInit(){

  this.completedArr = this.todoSvc.getCompleted()

  }

  findUser(userId:number):string | undefined{

    let user:iUsers | undefined= this.userArr.find(el => {el.id == userId})

    return user?.firstName


  }

}
