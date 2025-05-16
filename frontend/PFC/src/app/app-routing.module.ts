import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BienvenidaComponent } from './traslado-cuentas/component/bienvenida/bienvenida.component';

const routes: Routes = [
  {path: '', redirectTo: '/bienvenida', pathMatch: 'full'},
  {path: 'bienvenida', component: BienvenidaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
