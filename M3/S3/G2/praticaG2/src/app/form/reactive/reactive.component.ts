import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrl: './reactive.component.scss'
})
export class ReactiveComponent {

  dati!:FormGroup



  constructor(private fb:FormBuilder){}

  ngOnInit(){

    this.dati = this.fb.group({

      nome:this.fb.control(null),
      cognome:this.fb.control(null),
      password:this.fb.control(null),
      confermaPassword:this.fb.control(null),
      genre:this.fb.control(null),
      imgProfile:this.fb.control(null),
      bio:this.fb.control(null),
      username:this.fb.control(null)


    })

  }


}
