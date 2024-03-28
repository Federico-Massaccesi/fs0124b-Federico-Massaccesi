import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { iPosts } from './Models/posts';
import { Observable, Subject, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  apiUrl:string = 'http://localhost:3000/posts'

  picsArr:iPosts[]= []

  postsSubject = new Subject<iPosts[]>();

  $posts= this.postsSubject.asObservable()

  constructor(private http:HttpClient) {

    this.getAll().subscribe(data=>{

      this.postsSubject.next(data)
    })
   }


  getAll(){

    return this.http.get<iPosts[]>(this.apiUrl)

  }

  delete(id:number){

    return this.http.delete<iPosts>(this.apiUrl+'/'+id)
    .pipe(tap(()=>{

      this.picsArr = this.picsArr.filter(p => p.id !== id)
      this.postsSubject.next(this.picsArr)
    }))
  }


}
