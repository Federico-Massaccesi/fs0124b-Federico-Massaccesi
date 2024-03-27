import { Component, Input, input } from '@angular/core';
import { ProductsService } from '../products.service';
import { iProducts } from '../Models/products';

@Component({
  selector: 'app-preferiti',
  templateUrl: './preferiti.component.html',
  styleUrl: './preferiti.component.scss'
})
export class PreferitiComponent {

  favorites:iProducts[]= []

  constructor(private prodSvc: ProductsService){}




}
