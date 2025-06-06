import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FormSolicitudService {
  private apiUrl = 'http://localhost:8082/api/traslados';

  constructor(private http: HttpClient) { }

  crearSolicitud(solicitud: any): Observable<any>{
    return this.http.post(this.apiUrl, solicitud, { withCredentials: true });
  }
}