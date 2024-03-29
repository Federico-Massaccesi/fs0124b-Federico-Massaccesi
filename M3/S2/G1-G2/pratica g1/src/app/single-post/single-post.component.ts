import { Component, Input } from '@angular/core';
import { iInterface } from '../Models/iInterface';
import { ServiceFetchService } from '../service-fetch.service';

@Component({
  selector: 'app-single-post',
  templateUrl: './single-post.component.html',
  styleUrl: './single-post.component.scss'
})
export class SinglePostComponent {

  candidati: iInterface[] = [];

  arrAllTags: string[]= []

  constructor(private postsSvc:ServiceFetchService){}
    ngOnInit(){

      this.candidati =  this.postsSvc.getPosts()

      this.arrAllTags= this.postsSvc.getAllTags()

      // this.postsSvc.postPerTag(item:string)
    }


}
