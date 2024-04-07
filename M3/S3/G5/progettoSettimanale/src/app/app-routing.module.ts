import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogGuard } from './log.guard';

const routes: Routes = [
  {
    path: 'auth',
    loadChildren: () => import('./auth/auth.module').then((m) => m.AuthModule),
  },
  { path: 'logged/users',
   loadChildren: () => import('./logged/users/users.module').then(m => m.UsersModule),
    canActivate:[LogGuard],
    canActivateChild:[LogGuard]
  },
  { path: 'logged/movies',
   loadChildren: () => import('./logged/movies/movies.module').then(m => m.MoviesModule)},
  { path: 'logged/profile',
   loadChildren: () => import('./logged/profile/profile.module').then(m => m.ProfileModule),
   canActivate:[LogGuard],
    canActivateChild:[LogGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
