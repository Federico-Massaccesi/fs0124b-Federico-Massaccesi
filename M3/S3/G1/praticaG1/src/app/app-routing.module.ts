import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GuardGuard } from './page/authentication/guard.guard';

const routes: Routes = [
  {
    path: '',
    loadChildren: () =>
      import('./page/home/home.module').then((m) => m.HomeModule),
  },
  {
    path: 'chi-siamo',
    loadChildren: () => import('./page/chi-siamo/chi-siamo.module').then((m) => m.ChiSiamoModule),
    canActivate:[GuardGuard],
    canActivateChild:[GuardGuard]
  },
  {
    path: 'contatti',
    loadChildren: () => import('./page/contatti/contatti.module').then((m) => m.ContattiModule),
  },
  {
    path: 'authentication',
    loadChildren: () => import('./page/authentication/authentication.module').then(
        (m) => m.AuthenticationModule
      ),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
