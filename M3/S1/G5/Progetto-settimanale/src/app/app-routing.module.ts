import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DettagliComponent } from './dettagli/dettagli.component';
import { ErrorComponent } from './error/error.component';
import { AudiComponent } from './audi/audi.component';
import { FiatComponent } from './fiat/fiat.component';
import { FordComponent } from './ford/ford.component';

const routes: Routes = [
  {
    path:"",
    component: HomeComponent
  },
  {
    path:"Audi",
    component: AudiComponent
  },
  {
      path:"Fiat",
      component: FiatComponent

  },
    {
      path:"Ford",
      component: FordComponent
    }
  ,
  {
    path:"dettagli/:id",
    component: DettagliComponent
  },
  {
    path:"**",
    component: ErrorComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
