import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BienvenidaComponent } from './traslado-cuentas/component/bienvenida/bienvenida.component';
import { LoginComponent } from './traslado-cuentas/component/login/login.component';
import { FormSolicitudComponent } from './traslado-cuentas/component/form-solicitud/form-solicitud.component';
import { BancaElectronicaComponent } from './traslado-cuentas/component/banca-electronica/banca-electronica.component';
import { TrasladosComponent } from './traslado-cuentas/component/traslados/traslados.component';
import { RegistroComponent } from './traslado-cuentas/component/registro/registro.component';
import { PageNotFoundComponent } from './layout/page-not-found/page-not-found.component';
import { RegistroComponent } from './traslado-cuentas/component/registro/registro.component';

const routes: Routes = [
  {path: '', redirectTo: '/bienvenida', pathMatch: 'full'},
  {path: 'bienvenida', component: BienvenidaComponent},
  {path: 'login1', component: LoginComponent, data: {texto: 'Todo listo para que accedas con confianza y seguridad'}},
  {path: 'login2', component: LoginComponent, data: {texto: 'Antes de nada, debes acceder a tu banca electrónica'}},
  {path: 'solicitud', component: FormSolicitudComponent},
  {path: 'banca-electronica', component: BancaElectronicaComponent},
  {path: 'traslados', component: TrasladosComponent},
  {path: 'registro', component: RegistroComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
