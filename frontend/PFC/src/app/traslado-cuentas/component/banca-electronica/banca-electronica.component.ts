import { Component, OnInit } from '@angular/core';
import { Cuenta, Tarjeta, Movimiento } from '../../model/banca-electronica.model';
import { cuentasMock, tarjetasMock, movimientosMock } from './banca-electronica.mock';

@Component({
  selector: 'app-banca-electronica',
  templateUrl: './banca-electronica.component.html',
  styleUrls: ['./banca-electronica.component.css']
})
export class BancaElectronicaComponent implements OnInit {
  cuentas: Cuenta[] = [];
  tarjetas: Tarjeta[] = [];
  movimientos: Movimiento[] = [];
  menuAbierto = false;

  ngOnInit() {
    this.cuentas = cuentasMock;
    this.tarjetas = tarjetasMock;
    this.movimientos = movimientosMock;
  }

  toggleMenu() {
    this.menuAbierto = !this.menuAbierto;
  }

  getTotalCuentas(): number {
    return this.cuentas.reduce((total, cuenta) => total + cuenta.saldo, 0);
  }
}