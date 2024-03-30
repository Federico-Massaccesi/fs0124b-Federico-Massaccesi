import { Component, Input } from '@angular/core';
import { UsersService } from '../users.service';
import { iUsers } from '../Models/users';
import { iTodo } from '../Models/todo';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-single-user',
  templateUrl: './single-user.component.html',
  styleUrl: './single-user.component.scss'
})
export class SingleUserComponent {
  //C'HO PROVATO

  singleUser!:iUsers

  userArr:iUsers[]= []

  todoArr:iTodo[]=[]

nomeRicevuto!:string

foundOrNot!:boolean

onUserName(data:string){

  this.nomeRicevuto = data
}

constructor(private userSvc: UsersService,private todoSvc:TodoService){}

ngOnInit(){

this.todoArr = this.todoSvc.todos

this.userArr = this.userSvc.user

if(this.nomeRicevuto == undefined){

  this.foundOrNot = true
}else{

  // this.singleUser = this.getUser()

  this.foundOrNot= false
}

}

getUser(){

  let found = this.userArr.find(p=> p.firstName == this.nomeRicevuto)

if(found){

  return found
}else{
  return
}

}


getTDofUser(id:number){

  let ownTodo:iTodo[] =this.todoArr.filter(el=> el.userId == id)

 return ownTodo

}

}
