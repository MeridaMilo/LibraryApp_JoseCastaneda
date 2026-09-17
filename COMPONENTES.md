# COMPONENTES.md

## 1. Modelo – Cliente

* **Nombre:** `Cliente.java`
* **Capa:** Modelo (MVC)
* **Responsabilidad:** Representar los datos del cliente.
* **Dependencias:** Java.
* **Flujo:** Usuario → Controller → Cliente → DAO → Base de datos.

## 2. Modelo – Producto

* **Nombre:** `Producto.java`
* **Capa:** Modelo (MVC)
* **Responsabilidad:** Representar los datos del producto.
* **Dependencias:** Java.
* **Flujo:** Usuario → Controller → Producto → DAO → BD.

## 3. DAO – ClienteDAO

* **Nombre:** `ClienteDAO.java`
* **Capa:** DAO
* **Responsabilidad:** Guardar, consultar, actualizar y eliminar clientes.
* **Dependencias:** JDBC, `Cliente`.
* **Flujo:** Controller → ClienteDAO → SQL → BD.

## 4. DAO – ProductoDAO

* **Nombre:** `ProductoDAO.java`
* **Capa:** DAO
* **Responsabilidad:** Administrar los productos en la BD.
* **Dependencias:** JDBC, `Producto`.
* **Flujo:** Controller → ProductoDAO → SQL → BD.

## 5. Conexión

* **Nombre:** `Conexion.java`
* **Capa:** DAO
* **Responsabilidad:** Crear la conexión con la base de datos.
* **Dependencias:** JDBC, Driver de BD.
* **Flujo:** DAO → Conexion → Base de datos.

## 6. Controller

* **Nombre:** `ClienteController.java`
* **Capa:** Controller (MVC)
* **Responsabilidad:** Gestionar las acciones del usuario.
* **Dependencias:** JavaFX, FXML, ClienteDAO.
* **Flujo:** Vista → Controller → DAO → BD.

## 7. Vista Cliente

* **Nombre:** `cliente.fxml`
* **Capa:** Vista (MVC)
* **Responsabilidad:** Mostrar el formulario de clientes.
* **Dependencias:** JavaFX, Controller.
* **Flujo:** Usuario → FXML → Controller.

## 8. Vista Producto

* **Nombre:** `producto.fxml`
* **Capa:** Vista (MVC)
* **Responsabilidad:** Mostrar el formulario de productos.
* **Dependencias:** JavaFX, Controller.
* **Flujo:** Usuario → FXML → Controller.

## 9. Interfaz DAO

* **Nombre:** `IDAO.java`
* **Capa:** DAO
* **Responsabilidad:** Definir las operaciones básicas de acceso a datos.
* **Dependencias:** Clases Modelo.
* **Flujo:** Controller → Interfaz DAO → Implementación DAO.

## 10. Clase principal

* **Nombre:** `Main.java`
* **Capa:** Aplicación
* **Responsabilidad:** Iniciar el programa.
* **Dependencias:** JavaFX.
* **Flujo:** Main → JavaFX → Vista → Controller.

---

# Flujo general del sistema

```text
       USUARIO
          ↓
        VISTA
       (FXML)
          ↓
     CONTROLLER
          ↓
        DAO
          ↓
        JDBC
          ↓
   BASE DE DATOS
```

### Resumen arquitectónico

**MVC** separa la aplicación en Modelo, Vista y Controller.
**DAO** separa las operaciones de la base de datos del resto del programa.

Esto permite que cada componente tenga una responsabilidad específica y facilita el mantenimiento del proyecto.

