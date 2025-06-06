import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface SolicitudTraslado {
  referencia: string;
  fechaHora: string;
  estado: string;
  entidadSolicitante: string;
  entidadDestinataria: string;
  ibanAntiguo: string;
  ibanNuevo: string;
  titular: string;
  representante?: string;
}

@Injectable({
  providedIn: 'root'
})
export class TrasladosService {

  private apiUrl = 'http://localhost:8082/api/traslados'; 

  constructor(private http: HttpClient) {}

  getSolicitudes(): Observable<SolicitudTraslado[]> {
    return this.http.get<SolicitudTraslado[]>(this.apiUrl, { withCredentials: true });
  }
}