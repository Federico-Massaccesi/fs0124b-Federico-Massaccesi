import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AllListComponent } from './all-list/all-list.component';
import { CompletedComponent } from './completed/completed.component';
import { UncompletedComponent } from './uncompleted/uncompleted.component';
import { ByUserComponent } from './by-user/by-user.component';
import { FormsModule } from '@angular/forms';
import { SingleUserComponent } from './single-user/single-user.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AllListComponent,
    CompletedComponent,
    UncompletedComponent,
    ByUserComponent,
    SingleUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
