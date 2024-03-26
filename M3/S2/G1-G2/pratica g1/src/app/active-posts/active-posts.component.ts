import { Component } from '@angular/core';
import { ServiceFetchService } from '../service-fetch.service';
import { iInterface } from '../Models/iInterface';

@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrl: './active-posts.component.scss'
})
export class ActivePostsComponent {

  active:iInterface[]= []

  constructor(private postsSvc:ServiceFetchService){}

  ngOnInit(){

   this.active = this.postsSvc.getActivePosts()

  }
}
