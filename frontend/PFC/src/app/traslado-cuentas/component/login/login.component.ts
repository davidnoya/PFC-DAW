import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from '../../service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  texto: string = '';
  dni: string = '';
  pin: string = '';
  errorMessage: string = '';

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private loginService: LoginService
  ) { }

  ngOnInit(): void {
    this.texto = this.route.snapshot.data['texto'];
  }

  onSubmit(): void {
    this.errorMessage = '';
    this.loginService.login(this.dni, this.pin).subscribe({
      next: (response) => {
        if (response === 'Login correcto') {
          this.router.navigate(['/banca-electronica']);
        } else {
          this.errorMessage = 'Credenciales inválidas';
        }
      },
      error: (error) => {
        if (error.status = 401) {
          this.errorMessage = 'Credenciales inválidas';
        } else {
          this.errorMessage = 'Error al conectar con el servidor';
        }
      }
    });
  }
}