import { Component } from '@angular/core';
import { iInterface, iTotal } from '../Models/iInterface';
import { ServiceFetchService } from '../service-fetch.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  candidati: iInterface[] = [];
  fourPosts: iInterface[] = [];

  constructor(private postsSvc: ServiceFetchService) {}
  ngOnInit() {
    this.candidati = this.postsSvc.getPosts();

    this.postsSvc.randomIndex(this.candidati.length);

    for (let x = 0; x < 4; x++) {
      this.fourPosts.push(this.candidati[this.postsSvc.randomIndex(this.candidati.length)]);
    }
  }
}
