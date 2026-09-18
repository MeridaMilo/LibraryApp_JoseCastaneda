package org.libreria.model;

/**
 * Representa una editorial dentro del sistema de la librería.
 * Contiene información de identificación fiscal (NIT), nombre, teléfono y dirección de contacto.
 * 
 * @author informatica
 */
public class Editorial {
    private String nit;
    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditoria;

    /**
     * Constructor por defecto de la clase Editorial.
     * Permite crear una instancia vacía de la editorial.
     */
    public Editorial() {
    }

    /**
     * Constructor con todos los parámetros para inicializar una editorial.
     * 
     * @param nit NIT (Número de Identificación Tributaria) de la editorial.
     * @param nombreEditorial Nombre oficial de la editorial.
     * @param telefonoEditorial Número telefónico de contacto de la editorial.
     * @param direccionEditoria Dirección física de las instalaciones de la editorial.
     */
    public Editorial(String nit, String nombreEditorial, String telefonoEditorial, String direccionEditoria) {
        this.nit = nit;
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditoria = direccionEditoria;
    }

    /**
     * Obtiene el NIT de la editorial.
     * 
     * @return El NIT de la editorial.
     */
    public String getNit() {
        return nit;
    }

    /**
     * Establece o modifica el NIT de la editorial.
     * 
     * @param nit El nuevo NIT a asignar.
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Obtiene el nombre de la editorial.
     * 
     * @return El nombre de la editorial.
     */
    public String getNombreEditorial() {
        return nombreEditorial;
    }

    /**
     * Establece o modifica el nombre de la editorial.
     * 
     * @param nombreEditorial El nuevo nombre a asignar.
     */
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    /**
     * Obtiene el teléfono de la editorial.
     * 
     * @return El teléfono de contacto.
     */
    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }

    /**
     * Establece o modifica el teléfono de la editorial.
     * 
     * @param telefonoEditorial El nuevo teléfono a asignar.
     */
    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }

    /**
     * Obtiene la dirección de la editorial.
     * 
     * @return La dirección de la editorial.
     */
    public String getDireccionEditoria() {
        return direccionEditoria;
    }

    /**
     * Establece o modifica la dirección de la editorial.
     * 
     * @param direccionEditoria La nueva dirección a asignar.
     */
    public void setDireccionEditoria(String direccionEditoria) {
        this.direccionEditoria = direccionEditoria;
    }

    /**
     * Devuelve una representación en cadena del objeto Editorial.
     * En este caso, retorna únicamente el nombre de la editorial, lo cual es útil 
     * para mostrarlo de forma legible en interfaces gráficas como ComboBoxes o listas.
     * 
     * @return El nombre de la editorial.
     */
    @Override
    public String toString() {
        return nombreEditorial;
    }
}
