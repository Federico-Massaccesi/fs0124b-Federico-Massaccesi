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

  singleUser!:iUsers|undefined



  todoArr:iTodo[]=[]

nomeRicevuto!:string

foundOrNot!:boolean

onUserName(data:string){



  this.nomeRicevuto = data
}

constructor(private userSvc: UsersService,private todoSvc:TodoService){}

ngOnInit(){

this.todoArr = this.todoSvc.todos

  let found = this.userSvc.user.find(p=> p.firstName == this.nomeRicevuto)

  if(found == undefined){

    this.foundOrNot = true

  }else{

    this.singleUser = found

    this.foundOrNot= false

  }

}

//C'HO PROVATO

getTDofUser(id:number){



  let ownTodo:iTodo[] =this.todoArr.filter(el=> el.userId == id)

 return ownTodo

}

}
