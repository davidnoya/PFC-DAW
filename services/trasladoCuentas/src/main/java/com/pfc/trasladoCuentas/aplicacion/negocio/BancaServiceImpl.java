package com.pfc.trasladoCuentas.aplicacion.negocio;

import com.pfc.trasladoCuentas.aplicacion.BancaService;
import com.pfc.trasladoCuentas.dominio.modelo.Cuenta;
import com.pfc.trasladoCuentas.dominio.modelo.Tarjeta;
import com.pfc.trasladoCuentas.dominio.modelo.Movimiento;
import com.pfc.trasladoCuentas.dominio.modelo.Banca;
import com.pfc.trasladoCuentas.dominio.repositorio.CuentasRepository;
import com.pfc.trasladoCuentas.dominio.repositorio.TarjetasRepository;
import com.pfc.trasladoCuentas.dominio.repositorio.MovimientosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BancaServiceImpl implements BancaService {

    private final CuentasRepository cuentasRepository;
    private final TarjetasRepository tarjetasRepository;
    private final MovimientosRepository movimientosRepository;

    public BancaServiceImpl(CuentasRepository cuentasRepository, TarjetasRepository tarjetasRepository, MovimientosRepository movimientosRepository) {
        this.cuentasRepository = cuentasRepository;
        this.tarjetasRepository = tarjetasRepository;
        this.movimientosRepository = movimientosRepository;
    }

    @Override
    public Banca obtenerResumenBanca() {
        List<Cuenta> cuentas = obtenerCuentas();
        List<Tarjeta> tarjetas = obtenerTarjetas();
        List<Movimiento> movimientos = obtenerMovimientos();

        return new Banca(cuentas, tarjetas, movimientos);
    }

    private List<Cuenta> obtenerCuentas() {
        return cuentasRepository.findAll().stream()
                .map(entity -> new Cuenta(entity.getTipo(), entity.getNumero(), entity.getSaldo()))
                .collect(Collectors.toList());
    }

    private List<Tarjeta> obtenerTarjetas() {
        return tarjetasRepository.findAll().stream()
                .map(entity -> new Tarjeta(entity.getTipo(), entity.getNumero(), entity.getDisponible()))
                .collect(Collectors.toList());
    }

    private List<Movimiento> obtenerMovimientos() {
        return movimientosRepository.findAll().stream()
                .map(entity -> new Movimiento(entity.getDescripcion(), entity.getCantidad()))
                .collect(Collectors.toList());
    }
}