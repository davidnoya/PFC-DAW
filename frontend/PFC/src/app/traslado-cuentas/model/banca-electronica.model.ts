export interface Cuenta{
    tipo: string;
    numero: string;
    saldo: number;
}

export interface Tarjeta{
    tipo: string;
    numero: string;
    disponible: number;
}

export interface Movimiento{
    descripcion: string;
    cantidad: number;
}