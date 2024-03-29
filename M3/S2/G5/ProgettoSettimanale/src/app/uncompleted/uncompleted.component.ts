import { Component } from '@angular/core';
import { TodoService } from '../todo.service';
import { UsersService } from '../users.service';
import { iTodo } from '../Models/todo';

@Component({
  selector: 'app-uncompleted',
  templateUrl: './uncompleted.component.html',
  styleUrl: './uncompleted.component.scss'
})
export class UncompletedComponent {


  uncompletedArr:iTodo[]=[]

  constructor(private todoSvc:TodoService, private userSvc:UsersService){}

  ngOnInit(){

  this.uncompletedArr = this.todoSvc.getUncompleted()

  }
}
