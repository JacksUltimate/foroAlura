Foro Alura: API RESTful 

Foro Alura es una API RESTful desarrollada con Java y Spring Boot que simula un foro de discusión. Los usuarios pueden crear, listar, actualizar y eliminar tópicos, todo protegido por un sistema de autenticación basado en JSON Web Tokens (JWT).

El proyecto está diseñado para ser consumido por un cliente backend (como Insomnia o Postman), ya que no cuenta con una interfaz gráfica. Es el resultado de la aplicación práctica de los conocimientos adquiridos en la especialización de desarrollo back-end de Alura.

Características Principales 

    Autenticación segura: Los usuarios se autentican con un email y una contraseña para recibir un token JWT, que es necesario para acceder a la mayoría de los endpoints.

    Gestión de tópicos:

        Crear: Endpoint POST para que los usuarios registrados puedan crear nuevos tópicos.

        Listar: Endpoint GET para consultar todos los tópicos.

        Actualizar: Endpoint PUT para modificar un tópico existente.

        Eliminar: Endpoint DELETE para borrar un tópico.

    Validaciones: La API previene la creación de tópicos duplicados (mismo título y mensaje) y maneja las excepciones de manera controlada.

Requisitos del Sistema 

Para ejecutar el proyecto, necesitas tener instalado:

    Java 17 o superior

    Maven

    PostgreSQL (u otra base de datos relacional)

    Un IDE (IntelliJ IDEA, Eclipse)

    Un cliente HTTP como Insomnia o Postman para probar los endpoints.

Configuración y Ejecución 

    Clona el repositorio:
    git clone <URL del repositorio>

    Configura la base de datos:

        Crea una base de datos en PostgreSQL llamada foro.

        Edita el archivo src/main/resources/application.properties con tus credenciales:
        Properties

        spring.datasource.url=jdbc:postgresql://localhost:5432/foro
        spring.datasource.username=tu_usuario
        spring.datasource.password=tu_contraseña

    Ejecuta la aplicación:

        Desde tu IDE, ejecuta la clase ForoApplication.java.

        También puedes usar la terminal en el directorio raíz del proyecto:
        mvn spring-boot:run
