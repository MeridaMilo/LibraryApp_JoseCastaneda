# 📚 GLOSARIO.md

## 1. Clase

* **Definición:** Molde que define atributos y métodos de los objetos.
* **Mis palabras:** Plantilla para crear objetos.
* **Ubicación:** `model/Cliente.java`
* **Ejemplo:** `public class Cliente {}` — Organiza los datos de un cliente.

## 2. Objeto

* **Definición:** Instancia de una clase.
* **Mis palabras:** Elemento creado a partir de una clase.
* **Ubicación:** Controller/DAO.
* **Ejemplo:** `Cliente c = new Cliente();`

## 3. Método

* **Definición:** Bloque de código que realiza una tarea.
* **Mis palabras:** Acción que puede ejecutar una clase.
* **Ubicación:** Clases Java.
* **Ejemplo:** `guardar()` — Guarda información.

## 4. Encapsulamiento

* **Definición:** Protección de los atributos de una clase.
* **Mis palabras:** Evita modificar datos directamente.
* **Ubicación:** `model/`
* **Ejemplo:** `private String nombre;`

## 5. Herencia

* **Definición:** Permite reutilizar atributos y métodos de otra clase.
* **Mis palabras:** Una clase hereda características de otra.
* **Ubicación:** Clases con `extends`.
* **Ejemplo:** `Empleado extends Persona`.

## 6. Polimorfismo

* **Definición:** Un método puede tener diferentes comportamientos.
* **Mis palabras:** Una misma acción puede funcionar de distintas formas.
* **Ubicación:** Clases relacionadas.
* **Ejemplo:** `@Override`.

## 7. Abstracción

* **Definición:** Oculta detalles y muestra solo lo necesario.
* **Mis palabras:** Mostrar lo importante y ocultar la complejidad.
* **Ubicación:** Interfaces/clases abstractas.
* **Ejemplo:** `ClienteDAO`.

## 8. Interfaz

* **Definición:** Define métodos que una clase debe implementar.
* **Mis palabras:** Es un contrato o conjunto de reglas.
* **Ubicación:** `dao/`
* **Ejemplo:** `interface ClienteDAO`.

## 9. DAO

* **Definición:** Patrón para acceder a la base de datos.
* **Mis palabras:** Se encarga de las operaciones con datos.
* **Ubicación:** `dao/`
* **Ejemplo:** `guardar(cliente)`.

## 10. Controller

* **Definición:** Controla las acciones de la interfaz.
* **Mis palabras:** Recibe las acciones del usuario y las procesa.
* **Ubicación:** `controller/`
* **Ejemplo:** `guardarCliente()`.

## 11. Vista

* **Definición:** Parte que muestra la información al usuario.
* **Mis palabras:** Es la pantalla del programa.
* **Ubicación:** Archivos `.fxml`.
* **Ejemplo:** Formularios y botones.

## 12. JavaFX

* **Definición:** Tecnología para crear interfaces gráficas en Java.
* **Mis palabras:** Permite crear las ventanas del programa.
* **Ubicación:** Clases JavaFX.
* **Ejemplo:** Botones, tablas y ventanas.

## 13. FXML

* **Definición:** Lenguaje XML para definir interfaces JavaFX.
* **Mis palabras:** Archivo donde se diseña una pantalla.
* **Ubicación:** Archivos `.fxml`.
* **Ejemplo:** `<Button text="Guardar"/>`.

## 14. SceneBuilder

* **Definición:** Herramienta visual para diseñar interfaces JavaFX.
* **Mis palabras:** Permite diseñar pantallas arrastrando componentes.
* **Ubicación:** Genera archivos FXML.
* **Ejemplo:** Crear formularios visualmente.

## 15. Clave primaria

* **Definición:** Identifica de forma única un registro.
* **Mis palabras:** Identificador único de una fila.
* **Ubicación:** Base de datos.
* **Ejemplo:** `id INT PRIMARY KEY`.

## 16. Clave foránea

* **Definición:** Relaciona una tabla con otra.
* **Mis palabras:** Conecta dos tablas.
* **Ubicación:** Base de datos.
* **Ejemplo:** `FOREIGN KEY (id_cliente)`.

## 17. SQL

* **Definición:** Lenguaje para administrar bases de datos.
* **Mis palabras:** Lenguaje usado para comunicarse con la BD.
* **Ubicación:** DAO.
* **Ejemplo:** `SELECT * FROM cliente`.

## 18. INSERT

* **Definición:** Agrega registros a una tabla.
* **Mis palabras:** Sirve para guardar datos.
* **Ubicación:** DAO.
* **Ejemplo:** `INSERT INTO cliente`.

## 19. SELECT

* **Definición:** Consulta información de una tabla.
* **Mis palabras:** Sirve para buscar datos.
* **Ubicación:** DAO.
* **Ejemplo:** `SELECT * FROM cliente`.

## 20. UPDATE

* **Definición:** Modifica registros existentes.
* **Mis palabras:** Sirve para actualizar datos.
* **Ubicación:** DAO.
* **Ejemplo:** `UPDATE cliente SET nombre = ...`.

## 21. DELETE

* **Definición:** Elimina registros.
* **Mis palabras:** Sirve para borrar datos.
* **Ubicación:** DAO.
* **Ejemplo:** `DELETE FROM cliente`.

## 22. PreparedStatement

* **Definición:** Ejecuta SQL utilizando parámetros.
* **Mis palabras:** Permite enviar datos de forma segura al SQL.
* **Ubicación:** DAO.
* **Ejemplo:** `PreparedStatement ps`.

## 23. JDBC

* **Definición:** API de Java para conectarse a bases de datos.
* **Mis palabras:** Permite que Java se comunique con la BD.
* **Ubicación:** Clase de conexión.
* **Ejemplo:** `DriverManager`.

## 24. Connection

* **Definición:** Representa la conexión con la base de datos.
* **Mis palabras:** Es el enlace entre Java y la BD.
* **Ubicación:** `Conexion.java`
* **Ejemplo:** `Connection conn`.

## 25. Procedimiento almacenado

* **Definición:** Conjunto de instrucciones SQL guardadas en la BD.
* **Mis palabras:** SQL guardado para realizar una tarea.
* **Ubicación:** Base de datos.
* **Ejemplo:** `CREATE PROCEDURE listar_clientes`.
