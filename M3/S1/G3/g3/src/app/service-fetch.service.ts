import { Injectable } from '@angular/core';
import { iInterface, iTotal } from './Models/iInterface';

@Injectable({
  providedIn: 'root'
})
export class ServiceFetchService {

candidati:iInterface[]= []
fourPosts:iInterface[]= []

  getPosts():Promise<iInterface[]>{
    return fetch('../assets/db.json')
    .then(res=> res.json())
    .then((res:iTotal) => res.posts)

  }

  randomIndex(): number {
    let randomNumber: number = Math.floor(Math.random() * 30);
    return randomNumber;
  }

  getActivePosts(){

    return this.getPosts()
    .then(res=> res.filter(post => post.active))
  }


  getInactivePosts(){

    return this.getPosts()
    .then(res=> res.filter(post => !post.active))
  }

   genera() {
      for (let x = 0; x < 4; x++) {
        this.fourPosts.push(this.candidati[this.randomIndex()]);

      }

  }
}




