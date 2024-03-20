import { Component } from '@angular/core';
import { iInterface } from './Models/iInterface';
import { iTotal } from './Models/iInterface';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent {
  candidati: iInterface[] = [];
  fourPosts: iInterface[] = [];

  ngOnInit() {
    fetch('../assets/db.json')
      .then((res) => res.json())
      .then((res: iTotal) =>{ (this.candidati = res.posts)
      this.genera()
  });


  }
  genera() {
    for (let x = 0; x < 4; x++) {
      console.log(this.candidati);

      this.fourPosts.push(this.candidati[this.randomIndex()]);
      console.log(this.fourPosts);
    }
  }

  randomIndex(): number {
    let randomNumber: number = Math.floor(Math.random() * 30);
    return randomNumber;
  }
}
