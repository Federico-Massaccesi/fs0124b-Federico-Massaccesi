import { Component } from '@angular/core';
import { TodoService } from '../todo.service';
import { UsersService } from '../users.service';
import { iTodo } from '../Models/todo';
import { iUsers } from '../Models/users';

@Component({
  selector: 'app-by-user',
  templateUrl: './by-user.component.html',
  styleUrl: './by-user.component.scss'
})
export class ByUserComponent {

  todoArr:iTodo[]=[]

  userArr:iUsers[]=[]

  todoOfUser:iTodo[]=[]

  constructor(private todoSvc:TodoService, private userSvc:UsersService){}


  ngOnInit(){
    this.todoArr = this.todoSvc.todos

    this.userArr = this.userSvc.user

  }
  getTDofUser(id:number){

    this.todoOfUser=[]

    let ownTodo:iTodo[] =this.todoArr.filter(el=> el.userId == id)

   return ownTodo

  }



}
