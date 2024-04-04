import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ReactiveComponent } from './form/reactive/reactive.component';
import { LoginComponent } from './form/login/login.component';

const routes: Routes = [
  {
    path:"reactive",
    component:ReactiveComponent
  },
  {
    path:"login",
    component:LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
