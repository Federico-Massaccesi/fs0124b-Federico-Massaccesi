import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoggedRoutingModule } from './logged-routing.module';
import { LoggedComponent } from './logged.component';
import { MoviesComponent } from './movies/movies.component';
import { UsersComponent } from './users/users.component';
import { ProfileComponent } from './profile/profile.component';


@NgModule({
  declarations: [
    LoggedComponent,
    MoviesComponent,
    UsersComponent,
    ProfileComponent
  ],
  imports: [
    CommonModule,
    LoggedRoutingModule
  ]
})
export class LoggedModule { }
