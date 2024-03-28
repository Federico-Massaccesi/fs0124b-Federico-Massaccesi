import { Component } from '@angular/core';
import { PostsService } from '../posts.service';
import { iPosts } from '../Models/posts';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  postsArr:iPosts[]=[]

  likedPosts:iPosts[]= []

constructor(private postSvc:PostsService){}

ngOnInit(){

  this.postSvc.$posts.subscribe(post=>{

    this.postsArr= post
  })

}

  deleteCard(id:number){

    this.postSvc.delete(id).subscribe()
  }

like(id:number){

  let likedPost:iPosts |undefined =this.postsArr.find(p=> p.id == id)


  if(likedPost != undefined && !this.likedPosts.includes(likedPost)){


   this.likedPosts.push(likedPost)


  }



}
}
