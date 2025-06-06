export interface SolicitudTraslado {
  id: number;
  fecha: string;
  hora: string;
  estado: 'Pendiente' | 'Completada';
  referencia: string;
  ibanNuevo: string;
  entidadSolicitante: string;
  entidadDestinataria: string;
  cuentaAntigua: string;
  titulares: string[];
}