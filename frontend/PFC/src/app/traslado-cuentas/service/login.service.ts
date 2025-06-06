import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

interface LoginRequest {
  dni: string;
  password: string;
}

@Injectable({
  providedIn: 'root'
})

export class LoginService {

  private apiUrl = "http://localhost:8082/api/login";

  constructor(private http: HttpClient) { }

login(dni: string, password: string): Observable<string> {
  const body: LoginRequest = { dni, password };
  return this.http.post(this.apiUrl, body, { responseType: 'text', withCredentials: true }).pipe(
    catchError(this.handleError)
  );
}
  private handleError(error: HttpErrorResponse) {
    return throwError(() => error);
  }
}