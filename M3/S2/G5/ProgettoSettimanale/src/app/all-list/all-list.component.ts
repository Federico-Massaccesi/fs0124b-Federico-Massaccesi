import { Component } from '@angular/core';
import { TodoService } from '../todo.service';
import { UsersService } from '../users.service';
import { iTodo } from '../Models/todo';
import { iUsers } from '../Models/users';

@Component({
  selector: 'app-all-list',
  templateUrl: './all-list.component.html',
  styleUrl: './all-list.component.scss'
})
export class AllListComponent {

  todoArr:iTodo[]=[]

  userArr:iUsers[]=[]




constructor(private todoSvc:TodoService, private userSvc:UsersService){}

ngOnInit(){


  this.todoArr = this.todoSvc.todos

  this.userArr = this.userSvc.user

}

findUserName(userId:number){

  let user:iUsers|undefined= this.userArr.find(el => el.id == userId)

  if(user){

    return user.firstName + ' ' + user.lastName
  }else{
    return
  }

}
}
