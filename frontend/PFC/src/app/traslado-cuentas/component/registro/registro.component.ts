import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RegistroService } from '../../service/registro.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent {
  registroForm: FormGroup;
  errorMessage: string = '';

  constructor(
    private fb: FormBuilder,
    private registroService: RegistroService,
    private router: Router
  ) {
    this.registroForm = this.fb.group({
      nombre: ['', Validators.required],
      dni: ['', [Validators.required, Validators.minLength(9), Validators.maxLength(9)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  onSubmit(): void {
    this.errorMessage = '';
    const usuario = this.registroForm.value;

    this.registroService.registrarUsuario(usuario).subscribe({
      next: (response) => {
        if (response === 'Usuario registrado correctamente') {
          this.router.navigate(['/login1']);
        } else {
          this.errorMessage = response;
        }
      },
      error: (error) => {
        if (error.status === 400) {
          this.errorMessage = error.error;
        } else {
          this.errorMessage = 'Error al conectar con el servidor';
        }
      }
    });
  }
}