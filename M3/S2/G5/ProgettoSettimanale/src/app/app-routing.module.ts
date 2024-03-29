import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllListComponent } from './all-list/all-list.component';
import { CompletedComponent } from './completed/completed.component';
import { UncompletedComponent } from './uncompleted/uncompleted.component';
import { ByUserComponent } from './by-user/by-user.component';
import { SingleUserComponent } from './single-user/single-user.component';

const routes: Routes = [
  {
    path:"",
    component: AllListComponent
  },
  {
    path:"completed",
    component:CompletedComponent
  },
  {
    path:"uncompleted",
    component:UncompletedComponent
  },
  {
    path:"byUser",
    component: ByUserComponent
  },
  {
    path:"singleUser/:firstName",
    component: SingleUserComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
