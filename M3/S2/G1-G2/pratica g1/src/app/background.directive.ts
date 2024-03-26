import { Directive, ElementRef, Input } from '@angular/core';
import { ServiceFetchService } from './service-fetch.service';

@Directive({
  selector: '[appBackground]'
})
export class BackgroundDirective {

  constructor(private ref:ElementRef, private postSvc: ServiceFetchService) { }

@Input() colori:string[]= ['red','yellow','blue','green']

ngOnInit(){

  console.log(this.ref);


  this.ref.nativeElement.style.backgroundColor = this.colori[this.postSvc.randomIndex(3)]

}

}
