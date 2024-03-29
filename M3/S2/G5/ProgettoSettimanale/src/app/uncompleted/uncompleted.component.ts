import { Component } from '@angular/core';
import { TodoService } from '../todo.service';
import { UsersService } from '../users.service';
import { iTodo } from '../Models/todo';
import { iUsers } from '../Models/users';

@Component({
  selector: 'app-uncompleted',
  templateUrl: './uncompleted.component.html',
  styleUrl: './uncompleted.component.scss'
})
export class UncompletedComponent {


  uncompletedArr:iTodo[]=[]
  userArr:iUsers[]=[]

  constructor(private todoSvc:TodoService, private userSvc:UsersService){}

  ngOnInit(){

  this.uncompletedArr = this.todoSvc.getUncompleted()

  }

  findUser(userId:number):string | undefined{

    let user:iUsers | undefined= this.userArr.find(el => {el.id == userId})

    return user?.firstName


  }
}
