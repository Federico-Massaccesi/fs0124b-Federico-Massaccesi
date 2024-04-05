import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoggedComponent } from './logged.component';
import { MoviesComponent } from './movies/movies.component';
import { ProfileComponent } from './profile/profile.component';
import { UsersComponent } from './users/users.component';

const routes: Routes = [
  {
    path: '',
     component: LoggedComponent
     },
     {
      path:'movies',
      component: MoviesComponent
     },
     {
      path:'profile',
      component:ProfileComponent
     },
     {
      path:'users',
      component: UsersComponent
     }
    ];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class LoggedRoutingModule {}
