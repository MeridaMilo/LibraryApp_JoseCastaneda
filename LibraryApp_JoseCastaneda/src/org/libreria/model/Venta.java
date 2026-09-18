
package org.libreria.model;

/**
 * Representa una transacción de venta realizada en el sistema de la librería.
 * Actúa como un objeto POJO que encapsula la información general de la venta,
 * como el número identificador, fecha, monto total, así como las referencias
 * al cliente (a través de su CUI) y al usuario que realizó la operación.
 * 
 * @author informatica
 */
public class Venta {
    private int noVenta;
    private String fechaVenta;
    private double totalVenta;
    private long cuiCliente;
    private int idUsuario;

    /**
     * Constructor por defecto. Crea una nueva instancia de Venta vacía.
     */
    public Venta() {
    }

    /**
     * Constructor parametrizado. Crea una nueva instancia de Venta 
     * con todos sus atributos definidos.
     * 
     * @param noVenta número identificador único de la venta
     * @param fechaVenta fecha y hora en que se efectuó la transacción
     * @param totalVenta monto total acumulado de la venta
     * @param cuiCliente CUI (Código Único de Identificación) del cliente asociado
     * @param idUsuario identificador del usuario que procesó y registró la venta
     */
    public Venta(int noVenta, String fechaVenta, double totalVenta, long cuiCliente, int idUsuario) {
        this.noVenta = noVenta;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
        this.cuiCliente = cuiCliente;
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el número identificador de la venta.
     * 
     * @return el número de venta en formato entero
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     * Establece o modifica el número identificador de la venta.
     * 
     * @param noVenta el nuevo número de venta a asignar
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     * Obtiene la fecha en la que se realizó la venta.
     * 
     * @return la fecha de venta como cadena de texto
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Establece o modifica la fecha de la venta.
     * 
     * @param fechaVenta la nueva fecha de venta a asignar
     */
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * Obtiene el monto total monetario de la venta.
     * 
     * @return el total de la venta en formato double
     */
    public double getTotalVenta() {
        return totalVenta;
    }

    /**
     * Establece o modifica el monto total monetario de la venta.
     * 
     * @param totalVenta el nuevo total de venta a asignar
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     * Obtiene el CUI (Código Único de Identificación) del cliente que realizó la compra.
     * 
     * @return el CUI del cliente en formato long
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     * Establece o modifica el CUI del cliente asociado a la venta.
     * 
     * @param cuiCliente el nuevo CUI de cliente a asignar
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     * Obtiene el identificador del usuario que atendió y registró la venta.
     * 
     * @return el ID de usuario en formato entero
     */
    public int getIdUsuario() {
        return idUsuario;
    }
 
    /**
     * Establece o modifica el identificador del usuario responsable de la venta.
     * 
     * @param idUsuario el nuevo ID de usuario a asignar
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}