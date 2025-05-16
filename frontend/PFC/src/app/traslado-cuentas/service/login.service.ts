import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private endpoint = 'http://localhost:8080/mockLoginService/validarCredenciales';

  constructor(private http: HttpClient) { }

  validarCredenciales(dni: string, pin: string): Observable<any> {
    const requestBody = {
      dni: dni,
      pin: pin
    };

    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });

    return this.http.post(this.endpoint, requestBody, { headers });
    }
}