import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TrasladosService } from '../../service/traslados.service';
import { SolicitudTraslado } from '../../service/traslados.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-traslados',
  templateUrl: './traslados.component.html',
  styleUrls: ['./traslados.component.css']
})
export class TrasladosComponent implements OnInit {

  solicitudes: SolicitudTraslado[] = [];
  filtro: string = 'todas';
  solicitudSeleccionada: SolicitudTraslado | null = null;

  constructor(private trasladosService: TrasladosService, private http: HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.cargarSolicitudes();
  }

  cargarSolicitudes(): void {
    this.trasladosService.getSolicitudes().subscribe(data => {
      this.solicitudes = data;
    });
  }

  get solicitudesFiltradas(): SolicitudTraslado[] {
    if (this.filtro === 'pendientes') {
      return this.solicitudes.filter(s => s.estado.toLowerCase() === 'pendiente');
    } else if (this.filtro === 'completadas') {
      return this.solicitudes.filter(s => s.estado.toLowerCase() === 'completada');
    }
    return this.solicitudes;
  }

  verDetalles(solicitud: SolicitudTraslado): void {
    this.solicitudSeleccionada = solicitud;
  }

  cerrarDetalles(): void {
    this.solicitudSeleccionada = null;
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