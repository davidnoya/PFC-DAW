import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Cuenta {
  tipo: string;
  numero: string;
  saldo: number;
}

export interface Tarjeta {
  tipo: string;
  numero: string;
  disponible: number;
}

export interface Movimiento {
  descripcion: string;
  cantidad: number;
}

export interface Banca {
  cuentas: Cuenta[];
  tarjetas: Tarjeta[];
  movimientos: Movimiento[];
}

@Injectable({
  providedIn: 'root'
})
export class BancaElectronicaService {

  private apiUrl = 'http://localhost:8082/api/banca';

  constructor(private http: HttpClient) { }

  obtenerResumenBanca(): Observable<Banca> {
    return this.http.get<Banca>(this.apiUrl, { withCredentials: true });
  }
}