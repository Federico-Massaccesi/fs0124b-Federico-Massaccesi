import { Component } from '@angular/core';
import { iInterface } from '../Models/iInterface';
import { ServiceFetchService } from '../service-fetch.service';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrl: './inactive-posts.component.scss'
})
export class InactivePostsComponent {


  inactive:iInterface[]= []

  constructor(private postsSvc:ServiceFetchService){}

  ngOnInit(){

    this.postsSvc.getInactivePosts()
    .then(res => this.inactive = res)
  }
}
