import { Component, OnInit } from '@angular/core';
import { SolicitudTraslado } from '../../model/traslados.model';
import { trasladosMock } from './traslados.mock';

@Component({
  selector: 'app-traslados',
  templateUrl: './traslados.component.html',
  styleUrls: ['./traslados.component.css']
})
export class TrasladosComponent {
  solicitudes: SolicitudTraslado[] = trasladosMock;
  filtro: string = 'todas';
  solicitudSeleccionada: SolicitudTraslado | null = null;

  get solicitudesFiltradas(): SolicitudTraslado[] {
    if (this.filtro === 'pendientes') {
      return this.solicitudes.filter(s => s.estado.toLowerCase() === 'pendiente');
    } else if (this.filtro === 'completadas') {
      return this.solicitudes.filter(s => s.estado.toLowerCase() === 'completada');
    }
    return this.solicitudes;
  }

  verDetalles(solicitud: SolicitudTraslado) {
    this.solicitudSeleccionada = solicitud;
  }

  cerrarDetalles() {
    this.solicitudSeleccionada = null;
  }
}