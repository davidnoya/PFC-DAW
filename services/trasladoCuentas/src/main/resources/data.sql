INSERT INTO usuarios (dni, password, nombre, email) VALUES ('12345678A', '123456', 'David Noya Vázquez', 'dnoyav23@fpcoruna.afundacion.org');
INSERT INTO usuarios (dni, password, nombre, email) VALUES ('98765432Z', '654321', 'Hadrián Romero Abelleira', 'hadri@gmail.com');

INSERT INTO solicitudes (referencia, fecha_hora, iban_antiguo, entidad_solicitante, entidad_destinataria, iban_nuevo, titular, representante, estado) 
VALUES ('REF001', '2025-05-25T10:15:30', 'ES12 3456 7890 1234 5678 9012', 'ABANCA', 'Caixabank', 'ES09 8765 4321 0987 6543 2100', 'Carlos Méndez', 'Iria Castrillón', 'COMPLETADA');

INSERT INTO solicitudes (referencia, fecha_hora, iban_antiguo, entidad_solicitante, entidad_destinataria, iban_nuevo, titular, representante, estado)
VALUES ('REF002', '2025-05-25T16:45:00', 'ES11 2233 4455 6677 8899 0011', 'ABANCA', 'ABANCA', 'ES66 7788 9900 1122 3344 5566', 'David Noya', NULL, 'COMPLETADA');

INSERT INTO solicitud_peticiones (solicitud_traslado_entity_referencia, peticiones)
VALUES ('REF001', 'A'), ('REF001', 'B'), ('REF001', 'D');

INSERT INTO solicitud_actuaciones (solicitud_traslado_entity_referencia, actuaciones)
VALUES  ('REF001', 'A'), ('REF001', 'B'), ('REF001', 'C');

INSERT INTO solicitud_peticiones (solicitud_traslado_entity_referencia, peticiones)
VALUES  ('REF002', 'B');

INSERT INTO solicitud_actuaciones (solicitud_traslado_entity_referencia, actuaciones)
VALUES ('REF002', 'A'), ('REF002', 'B');

INSERT INTO cuentas (tipo, numero, saldo) 
VALUES ('Cuenta Corriente', 'ES12 3456 7890 1234 5678', 2540.75),
('Cuenta de Ahorro', 'ES98 7654 3210 9876 5432', 10450.32);

INSERT INTO tarjetas (tipo, numero, disponible) 
VALUES ('Tarjeta de Crédito', '1234 5678 9012 3456', 1200),
('Tarjeta de Débito', '9876 5432 1098 7654', 500);

INSERT INTO movimientos (id, descripcion, cantidad) 
VALUES (1, 'Nómina', 1800), (2, 'Supermercado', -67.45), (3, 'Gasolina', -50.20), (4, 'Transferencia recibida', 250);