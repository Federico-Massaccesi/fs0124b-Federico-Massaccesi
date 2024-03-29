import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.scss'
})
export class HeaderComponent {

  foundUser!:string


  @Output() onUserName = new EventEmitter<string>();

  findUserName(value:string){

    console.log(value)

    this.onUserName.emit(value)
  }

}
