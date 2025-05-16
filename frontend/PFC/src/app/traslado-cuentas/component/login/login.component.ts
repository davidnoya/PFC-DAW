import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
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

  constructor(private route: ActivatedRoute, private loginService: LoginService) { }

  ngOnInit(): void {
    this.texto = this.route.snapshot.data['texto']
  }

  onSubmit(): void {
    this.loginService.validarCredenciales(this.dni, this.pin).subscribe({
      next: (response) => {
        if (response.valido) {
          alert('Credenciales válidas');
        } else {
          this.errorMessage = 'Credenciales inválidas';
        }
      },
      error: (err) => {
        this.errorMessage = 'Error al conectar con el servidor'; 
      }
    });
  }
}