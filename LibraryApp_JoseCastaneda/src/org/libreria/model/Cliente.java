
package org.libreria.model;

/**
 * Representa a un cliente dentro del sistema de la librería.
 * Contiene información de identificación personal y de contacto.
 * 
 * @author informatica
 */
public class Cliente {
    private long cui;
    private String nombreCliente;
    private String apellidoCliente;
    private String correoElectronico;

    /**
     * Constructor por defecto de la clase Cliente.
     * Permite crear una instancia vacía del cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor con todos los parámetros para inicializar un cliente.
     * 
     * @param cui Número de CUI (Código Único de Identificación) del cliente.
     * @param nombreCliente Nombre o nombres del cliente.
     * @param apellidoCliente Apellido o apellidos del cliente.
     * @param correoElectronico Dirección de correo electrónico de contacto del cliente.
     */
    public Cliente(long cui, String nombreCliente, String apellidoCliente, String correoElectronico) {
        this.cui = cui;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el CUI del cliente.
     * 
     * @return El CUI del cliente.
     */
    public long getCui() {
        return cui;
    }

    /**
     * Establece o modifica el CUI del cliente.
     * 
     * @param cui El nuevo CUI a asignar.
     */
    public void setCui(long cui) {
        this.cui = cui;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece o modifica el nombre del cliente.
     * 
     * @param nombreCliente El nuevo nombre a asignar.
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el apellido del cliente.
     * 
     * @return El apellido del cliente.
     */
    public String getApellidoCliente() {
        return apellidoCliente;
    }

    /**
     * Establece o modifica el apellido del cliente.
     * 
     * @param apellidoCliente El nuevo apellido a asignar.
     */
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece o modifica el correo electrónico del cliente.
     * 
     * @param correoElectronico El nuevo correo electrónico a asignar.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Devuelve una representación en cadena del objeto Cliente.
     * Concatena el nombre y el apellido separados por un espacio, lo cual es útil 
     * para mostrar el nombre completo en interfaces de usuario como ComboBoxes o tablas.
     * 
     * @return El nombre completo del cliente (Nombre y Apellido).
     */
    @Override
    public String toString() {
        return nombreCliente + " " + apellidoCliente;
    }
}
