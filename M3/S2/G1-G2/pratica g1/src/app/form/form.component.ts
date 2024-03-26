import { Component, EventEmitter, Input, Output, output } from '@angular/core';
import { iInterface } from '../Models/iInterface';

@Component({
  selector: '.app-form',
  templateUrl: './form.component.html',
  styleUrl: './form.component.scss',
})
export class FormComponent {
  @Output() onChangePost: EventEmitter<iInterface> = new EventEmitter();

  @Input() post!: iInterface


  invia() {

    this.onChangePost.emit(this.post)



  }
}
