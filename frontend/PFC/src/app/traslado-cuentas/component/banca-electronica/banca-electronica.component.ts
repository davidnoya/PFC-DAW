import { Component, OnInit } from '@angular/core';
import { BancaElectronicaService } from '../../service/banca-electronica.service';
import { Cuenta, Tarjeta, Movimiento } from '../../service/banca-electronica.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
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

  constructor(private bancaService: BancaElectronicaService, private http: HttpClient, private router: Router) { }

  ngOnInit(): void {
    this.obtenerDatosBanca();
  }

  obtenerDatosBanca(): void {
    this.bancaService.obtenerResumenBanca().subscribe(
      (banca) => {
        this.cuentas = banca.cuentas;
        this.tarjetas = banca.tarjetas;
        this.movimientos = banca.movimientos;
      },
      (error) => {
        console.error('Error al obtener el resumen de banca:', error);
      }
    );
  }

  getTotalCuentas(): number {
    return this.cuentas.reduce((total, cuenta) => total + cuenta.saldo, 0);
  }

  toggleMenu(): void {
    this.menuAbierto = !this.menuAbierto;
  }

  alertaVisible: boolean = false;

  abrirAlerta() {
    this.alertaVisible = true;
  }

  cerrarAlerta() {
    this.alertaVisible = false;
  }

  confirmarLogout() {
    this.alertaVisible = false;
    this.logout();
  }

  logout() {
    this.http.post('http://localhost:8082/logout', {}, { withCredentials: true }).subscribe({
      next: () => {
        this.router.navigate(['/login1']);
      },
      error: err => {
        console.error('Error al cerrar sesión', err);
        this.router.navigate(['/login1']);
      }
    });
   }
  
}