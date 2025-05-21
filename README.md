# 🎓​ Traslado de Cuentas

Este proyecto es una aplicación web que digitaliza el proceso de traslado de cuentas bancarias entre entidades, proporcionando una solución moderna, accesible y realista inspirada en un entorno financiero real.

<img src="https://cdn.businessinsider.es/sites/navi.axelspringer.es/public/media/image/2024/09/gestionar-dinero-4091721.jpg?tf=1200x" width="600">

---

## 📌 Índice

- [Descripción](#descripción)
- [Tecnologías](#tecnologías)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estado del Proyecto](#estado-del-proyecto)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Licencia](#licencia)
- [Contacto](#contacto)

---

## 🧾 Descripción

La aplicación simula el proceso completo de traslado de una cuenta bancaria por parte de un cliente. Permite:

- Autenticación del cliente (login simulado, por ahora).
- Envío de solicitudes de traslado de cuenta mediante formularios dinámicos.
- Seguimiento del estado de las solicitudes desde un panel visual tipo dashboard.

Este proyecto nace con el objetivo de aplicar conocimientos adquiridos en desarrollo web a un escenario realista y con valor funcional más allá del ámbito académico.

---

## 🛠️ Tecnologías

### Frontend

- [Angular 12](https://angular.io/)
- TypeScript
- HTML5 & CSS3
- JavaScript
- Visual Studio Code

### Backend (en desarrollo)

- Java 11
- Spring Boot
- Maven
- Eclipse IDE

### Herramientas de prueba

- Postman
- SOAP UI
- Chrome DevTools

### Control de versiones

- Git
- GitHub ([Repositorio](https://github.com/davidnoya/PFC-DAW))

---

## 💻 Instalación

### Requisitos previos

- Node.js y npm instalados
- Angular CLI instalado
- Java 11 y Maven para el backend

---

## 🚀 Uso

1. Accede a la página de bienvenida.
2. Inicia sesión (a través de un login no funcional. por ahora).
3. Navega al panel de banca electrónica.
4. Explora las cuentas, tarjetas y movimientos (simulados, por ahora).
5. Accede a “Traslado de cuentas”.
6. Crea nuevas solicitudes desde el formulario y sigue su estado en tiempo real.

---

## 🔧 Estado del Proyecto - ![STATUS](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green)

---

## 🗂️ Estructura del Proyecto

```
PFC-DAW/
├── api/                             # Carpeta reservada (vacía actualmente)
├── frontend/                       
│   └── PFC/                         # Aplicación Angular
│       └── traslado-cuentas/
│       ├── app/
│       │   ├── core/
│       │   ├── shared/
│       │   │   └── pie/
│       │   ├── component/
│       │   │   ├── banca-electronica/
│       │   │   ├── bienvenida/
│       │   │   ├── form-solicitud/
│       │   │   ├── login/
│       │   │   ├── traslados/
│       │   ├── model/
│       │   └── service/
├── service/                         # Backend Java - Spring Boot
│   └── trasladoCuentas/
│       ├── src/
│       │   └── main/
│       │       └── java/com/pfc/trasladoCuentas/
│       │           ├── aplicacion/
│       │           │   ├── factoria/
│       │           │   ├── mapper/
│       │           │   └── negocio/
│       │           ├── dominio/
│       │           │   ├── excepciones/
│       │           │   ├── modelo/
│       │           │   └── repositorio/
│       │           ├── interfaz/
│       │           │   ├── dto/
│       │           │   └── rest/
│       │           ├── repositorio/
│       │           │   └── persistencia/
│       │           │       ├── component/
│       │           │       ├── engine/
│       │           │       └── transform/
│       │           ├── ServletInitializer.java
│       │           └── TrasladoCuentasApplication.java
│       ├── resources/
│       │   ├── static/
│       │   ├── templates/
│       │   └── application.properties
│       └── test/
│           └── java/com/pfc/trasladoCuentas/
│               └── TrasladoCuentasApplicationTests.java
├── pom.xml
└── mvnw, mvnw.cmd, HELP.md
```

---

## 📄 Licencia

Este proyecto se entrega como parte del Proyecto Final de Ciclo (2º DAW) y no tiene licencia específica de momento.

---

## 📬 Personas desarrolladoras del proyecto

- **David Noya Vázquez**  
  📧 *dnoyav23@fpcoruna.afundacion.org*  
  🔗 [GitHub](https://github.com/davidnoya)
