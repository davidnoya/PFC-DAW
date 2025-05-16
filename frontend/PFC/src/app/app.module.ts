import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PieComponent } from './shared/pie/pie.component';
import { BienvenidaComponent } from './traslado-cuentas/component/bienvenida/bienvenida.component';
import { LoginComponent } from './traslado-cuentas/component/login/login.component';
import { FormSolicitudComponent } from './traslado-cuentas/component/form-solicitud/form-solicitud.component';

@NgModule({
  declarations: [
    AppComponent,
    PieComponent,
    BienvenidaComponent,
    LoginComponent,
    FormSolicitudComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
