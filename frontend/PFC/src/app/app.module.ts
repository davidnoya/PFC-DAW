import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PieComponent } from './shared/pie/pie.component';
import { BienvenidaComponent } from './traslado-cuentas/component/bienvenida/bienvenida.component';

@NgModule({
  declarations: [
    AppComponent,
    PieComponent,
    BienvenidaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
