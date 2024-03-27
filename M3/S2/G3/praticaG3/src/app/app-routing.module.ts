import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllProductsComponent } from './all-products/all-products.component';
import { PreferitiComponent } from './preferiti/preferiti.component';
import { CarrelloComponent } from './carrello/carrello.component';

const routes: Routes = [
  {
    path:"",
    component: AllProductsComponent
  },
  {
    path:"preferiti",
    component: PreferitiComponent
  },
  {
    path:"carrello",
    component:CarrelloComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
