
# 🎓​ Traslado de Cuentas

Este proyecto es una aplicación web que digitaliza el proceso de traslado de cuentas bancarias entre entidades, proporcionando una solución moderna, accesible y realista inspirada en un entorno financiero real.

<img src="https://cdn.businessinsider.es/sites/navi.axelspringer.es/public/media/image/2024/09/gestionar-dinero-4091721.jpg?tf=1200x" width="600">

---

## 📌 Índice

- [Descripción](#descripción)
- [Tecnologías](#tecnologías)
- [Instalación](#instalación)
- [Cómo iniciar la aplicación](#cómo-iniciar-la-aplicación)
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

## 🏁 Cómo iniciar la aplicación

A continuación se detallan los pasos necesarios para poner en marcha la aplicación, tanto en el lado del cliente (frontend) como en el servidor (backend).

### 📦 1️⃣ Preparar el entorno

Asegúrate de tener instaladas las herramientas necesarias:

- **Node.js** y **npm** (gestor de paquetes)
- **Angular CLI** para el desarrollo con Angular
- **Java 11** o superior
- **Maven** para gestionar dependencias y construir el proyecto

Verifica que las versiones estén instaladas:

```bash
node -v
npm -v
ng version
java -version
mvn -version
```

Si alguna no está instalada, descárgala desde los sitios oficiales antes de continuar.

---

### ⚙️ 2️⃣ Iniciar el backend (Spring Boot)

1️⃣ Abre una terminal y navega a la carpeta del proyecto backend:

```bash
cd service/trasladoCuentas
```

2️⃣ Descarga las dependencias y construye el proyecto con Maven:

```bash
mvn clean install
```

3️⃣ Inicia la aplicación Spring Boot:

```bash
mvn spring-boot:run
```

✅ El backend estará disponible en [http://localhost:8082](http://localhost:8082).

💡 **Consejo**: También puedes arrancarlo desde un IDE (como Eclipse o IntelliJ) ejecutando directamente la clase `TrasladoCuentasApplication.java`.

---

### 💻 3️⃣ Iniciar el frontend (Angular)

1️⃣ Abre una nueva terminal (no cierres la que tiene el backend) y navega a la carpeta del proyecto Angular:

```bash
cd frontend/PFC
```

2️⃣ Instala las dependencias de Angular con npm:

```bash
npm install
```

3️⃣ Lanza el servidor de desarrollo de Angular:

```bash
ng serve
```

✅ El frontend estará disponible en [http://localhost:4200](http://localhost:4200).

---

### 🚀 4️⃣ Acceder a la aplicación

Con ambos servidores funcionando:

✅ Abre tu navegador y visita [http://localhost:4200](http://localhost:4200).  
✅ Desde la interfaz de usuario podrás:

- Iniciar sesión.
- Ver paneles de banca electrónica: cuentas, tarjetas y movimientos.
- Acceder a la sección de traslado de cuentas y crear nuevas solicitudes.

💡 **Importante**: Asegúrate de iniciar **primero el backend** para que el frontend pueda comunicarse correctamente con la API REST y mostrar los datos correctamente.

---

## 🚀 Uso

1. Accede a la página de bienvenida.
2. Inicia sesión (a través de un login no funcional, por ahora).
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
├── api/                             
├── frontend/                       
│   └── PFC/                                                        # Aplicación Angular
│       └── traslado-cuentas/
│       ├── app/
│       │   ├── core/
│       │   ├── shared/
│       │   │   └── pie/
│       │   │   │   ├── pie.component.ts
│       │   │   │   ├── pie.component.html
│       │   │   │   ├── pie.component.css
│       │   │   │   └── pie.component.spec.ts
│       │   ├── component/
│       │   │   ├── banca-electronica/
│       │   │   │   ├── banca-electronica.component.ts
│       │   │   │   ├── banca-electronica.component.html
│       │   │   │   ├── banca-electronica.component.css
│       │   │   │   └── banca-electronica.component.spec.ts
│       │   │   ├── bienvenida/
│       │   │   │   ├── bienvenida.component.ts
│       │   │   │   ├── bienvenida.component.html
│       │   │   │   ├── bienvenida.component.css
│       │   │   │   └── bienvenida.component.spec.ts
│       │   │   ├── form-solicitud/
│       │   │   │   ├── form-solicitud.component.ts
│       │   │   │   ├── form-solicitud.component.html
│       │   │   │   ├── form-solicitud.component.css
│       │   │   │   └── form-solicitud.component.spec.ts
│       │   │   ├── login/
│       │   │   │   ├── login.component.ts
│       │   │   │   ├── login.component.html
│       │   │   │   ├── login.component.css
│       │   │   │   └── login.component.spec.ts
│       │   │   ├── traslados/
│       │   │   │   ├── traslados.component.ts
│       │   │   │   ├── traslados.component.html
│       │   │   │   ├── traslados.component.css
│       │   │   │   └── traslados.component.spec.ts
│       │   ├── model/
│       │   └── service/
│       │   │   ├── traslados.component.ts
│       │   │   ├── traslados.component.html
│       │   │   ├── traslados.component.css
│       │   │   └── traslados.component.spec.ts
├── service/                                                       # Backend Java - Spring Boot
│   └── trasladoCuentas/
│       ├── src/
│       │   └── main/
│       │       └── java/com/pfc/trasladoCuentas/
│       │           ├── aplicacion/
│       │           │   ├── mapper/
│       │           |   │   ├── LoginMapper.java
│       │           |   │   ├── BancaMapper.java
│       │           |   │   ├── SolicitudTrasladoMapper.java
│       │           |   │   └── UsuarioMapper.java
│       │           │   └── negocio/
│       │           |   │   ├── LoginServiceImpl.java
│       │           |   │   ├── BancaServiceImpl.java
│       │           |   │   ├── SolicitudTrasladoServiceImpl.java
│       │           |   │   └── UsuarioServiceImpl.java
│       │           │   ├── BancaService.java
│       │           │   ├── LoginService.java
│       │           │   ├── SolicitudTrasladoService.java
│       │           │   └── UsuarioService.java
│       │           ├── dominio/
│       │           │   ├── excepciones/
│       │           │   ├── modelo/
│       │           |   │   ├── Banca.java
│       │           |   │   ├── Cuenta.java
│       │           |   │   ├── Login.java
│       │           |   │   ├── Movimiento.java
│       │           |   │   ├── SolicitudTraslado.java
│       │           |   │   ├── Tarjeta.java
│       │           |   │   └── Usuario.java
│       │           │   └── repositorio/
│       │           |   │   ├── LoginRepository.java
│       │           |   │   ├── MovimientosRepository.java
│       │           |   │   ├── SolicitudTrasladoRepository.java
│       │           |   │   ├── TarjetasRepository.java
│       │           |   │   └── UsuarioRepository.java
│       │           ├── interfaz/
│       │           │   ├── dto/
│       │           |   │   ├── BancaDTO.java
│       │           |   │   ├── CuentasDTO.java
│       │           |   │   ├── LoginDTO.java
│       │           |   │   ├── MovimientosDTO.java
│       │           |   │   ├── SolicitudTrasladoDTO.java
│       │           |   │   ├── TarjetasDTO.java
│       │           |   │   └── UsuarioDTO.java
│       │           │   └── rest/
│       │           |   │   ├── BancaController.java
│       │           |   │   ├── LoginController.java
│       │           |   │   ├── SolicitudTrasladoController.java
│       │           |   │   └── UsuarioController.java
│       │           ├── repositorio/
│       │           │   └── persistencia/
│       │           │   |   ├── entity/
│       │           |   │   |  ├── CuentasEntity.java
│       │           |   │   |  ├── MovimientosEntity.java
│       │           |   │   |  ├── SolicitudTrasladoEntity.java
│       │           |   │   |  ├── TarjetasEntity.java
│       │           |   │   |  └── UsuarioEntity.java
│       │           ├── ServletInitializer.java
│       │           └── TrasladoCuentasApplication.java
│       ├── resources/
│       │   ├── static/
│       │   ├── templates/
│       │   ├── application.properties
│       │   └── data.sql
│       └── test/
│           └── java/com/pfc/trasladoCuentas/
│               └── TrasladoCuentasApplicationTests.java
├── target/
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
