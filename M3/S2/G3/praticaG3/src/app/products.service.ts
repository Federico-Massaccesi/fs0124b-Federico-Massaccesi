import { iObj, iProducts } from './Models/products';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  subject= new Subject<iProducts>();

  $product = this.subject.asObservable()



  constructor(private http:HttpClient) {}

  urlAPI:string= 'https://dummyjson.com/products'



  getAll(){

    return this.http.get<iObj>(this.urlAPI)

  }

  add(singleProd:iProducts){

    this.subject.next(singleProd)
  }



}

//https://dummyjson.com/products
