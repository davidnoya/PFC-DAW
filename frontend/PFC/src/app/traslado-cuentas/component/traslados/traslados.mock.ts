import { SolicitudTraslado } from "../../model/traslados.model";
export const trasladosMock: SolicitudTraslado[] = [
  {
    id: 1,
    fecha: '2025-05-10',
    hora: '10:30',
    estado: 'Pendiente',
    referencia: 'REF123456',
    ibanNuevo: 'ES12 3456 7890 1234 5678 9012',
    entidadSolicitante: 'Banco ABANCA',
    entidadDestinataria: 'Banco BBVA',
    cuentaAntigua: 'ES98 7654 3210 9876 5432 1098',
    titulares: ['Juan Pérez', 'María López']
  },
  {
    id: 2,
    fecha: '2024-12-10',
    hora: '15:45',
    estado: 'Completada',
    referencia: 'REF789012',
    ibanNuevo: 'ES45 1234 5678 9101 1121 3141',
    entidadSolicitante: 'Banco ABANCA',
    entidadDestinataria: 'Banco Santander',
    cuentaAntigua: 'ES22 3344 5566 7788 9900 1122',
    titulares: ['Carlos García']
  },
  {
    id: 3,
    fecha: '2021-11-25',
    hora: '09:10',
    estado: 'Completada',
    referencia: 'REF345678',
    ibanNuevo: 'ES66 1111 2222 3333 4444 5555',
    entidadSolicitante: 'Banco ABANCA',
    entidadDestinataria: 'CaixaBank',
    cuentaAntigua: 'ES77 8888 9999 0000 1111 2222',
    titulares: ['Lucía Martínez', 'Pedro Díaz']
  }
];