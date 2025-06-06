import { Component } from '@angular/core';
import { FormSolicitudService } from '../../service/form-solicitud.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-solicitud',
  templateUrl: './form-solicitud.component.html',
  styleUrls: ['./form-solicitud.component.css']
})
export class FormSolicitudComponent {

  constructor(private solicitudService: FormSolicitudService, private router: Router) {}

  enviarSolicitud(event: Event): void {
    event.preventDefault();

    const form = event.target as HTMLFormElement;
    const formData = new FormData(form);

    const ibanAntiguo = formData.get('iban-antiguo') as string;
    const entidadDestinataria = formData.get('entidad-antigua') as string;
    const ibanNuevo = formData.get('iban-nuevo') as string;
    const fechaTraslado = formData.get('fecha-traslado') as string;
    const titular = formData.get('titular') as string;
    const nif = formData.get('nif') as string;
    const entidadSolicitante = "ABANCA" //como la opción de traslado de cuentas es de ABANCA, siempre van a ser traslados de cuentas a su banco/

    if (!ibanAntiguo || !entidadDestinataria || !ibanNuevo || !fechaTraslado || !titular || !nif) {
      alert('Por favor, completa todos los campos obligatorios.');
      return;
    }

    const peticiones: string[] = [];
    form.querySelectorAll('input[name="peticiones"]:checked').forEach((input) => {
      peticiones.push((input as HTMLInputElement).value);
    });

    const actuaciones: string[] = [];
    form.querySelectorAll('input[name="actuaciones"]:checked').forEach((input) => {
      actuaciones.push((input as HTMLInputElement).value);
    });

    const representante = formData.get('representante') as string;

    const solicitud = {
      ibanAntiguo: ibanAntiguo.trim(),
      entidadSolicitante: entidadSolicitante,
      entidadDestinataria: entidadDestinataria,
      ibanNuevo: ibanNuevo.trim(),
      titular: titular.trim(),
      representante: representante ? representante.trim() : null,
      peticiones: peticiones,
      actuaciones: actuaciones
    };

    this.solicitudService.crearSolicitud(solicitud).subscribe({
      next: (response) => {
        console.log('Solicitud enviada correctamente:', response);
        this.mostrarAlertaExito();
      },
      error: (error) => {
        console.error('Error al enviar la solicitud:', error);
        alert('Hubo un error al enviar la solicitud.');
      }
    });
  }

  alertaVisible: boolean = false;
  
  mostrarAlertaExito() {
    this.alertaVisible = true;
  }

  cerrarAlerta() {
    this.alertaVisible = false;
    this.router.navigate(['/traslados']);
  }
}