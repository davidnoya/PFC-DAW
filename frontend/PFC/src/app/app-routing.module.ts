import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BienvenidaComponent } from './traslado-cuentas/component/bienvenida/bienvenida.component';
import { LoginComponent } from './traslado-cuentas/component/login/login.component';
import { FormSolicitudComponent } from './traslado-cuentas/component/form-solicitud/form-solicitud.component';

const routes: Routes = [
  {path: '', redirectTo: '/bienvenida', pathMatch: 'full'},
  {path: 'bienvenida', component: BienvenidaComponent},
  {path: 'login1', component: LoginComponent, data: {texto: 'Todo listo para que accedas con confianza y seguridad'}},
  {path: 'login2', component: LoginComponent, data: {texto: 'Antes de nada, debes acceder a tu banca electrónica'}},
  {path: 'solicitud', component: FormSolicitudComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
