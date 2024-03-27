import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ProductsService } from '../products.service';
import { iObj, iProducts } from '../Models/products';

@Component({
  selector: 'app-all-products',
  templateUrl: './all-products.component.html',
  styleUrl: './all-products.component.scss'
})
export class AllProductsComponent {

  products:iProducts[]= []

  singleProd!:iProducts

  prod!:iProducts

  constructor(private prodSvs: ProductsService){}

  ngOnInit(){


    this.prodSvs.getAll().subscribe(prods =>{
      this.products = prods.products

      console.log(this.prodSvs.$product);

      addFavorite(this.prod){

        this.prodSvs.add(this.prod)
      }


    })




  }
}
function addFavorite(prod: iProducts) {

}

