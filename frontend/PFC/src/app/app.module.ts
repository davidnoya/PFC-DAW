import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PieComponent } from './shared/pie/pie.component';
import { BienvenidaComponent } from './traslado-cuentas/component/bienvenida/bienvenida.component';
import { LoginComponent } from './traslado-cuentas/component/login/login.component';
import { FormSolicitudComponent } from './traslado-cuentas/component/form-solicitud/form-solicitud.component';
import { BancaElectronicaComponent } from './traslado-cuentas/component/banca-electronica/banca-electronica.component';
import { TrasladosComponent } from './traslado-cuentas/component/traslados/traslados.component';
import { PageNotFoundComponent } from './layout/page-not-found/page-not-found.component';
import { RegistroComponent } from './traslado-cuentas/component/registro/registro.component';

@NgModule({
  declarations: [
    AppComponent,
    PieComponent,
    BienvenidaComponent,
    LoginComponent,
    FormSolicitudComponent,
    BancaElectronicaComponent,
    TrasladosComponent,
    PageNotFoundComponent,
    RegistroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
