
package org.libreria.model;

/**
 *
 * @author informatica
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int noVenta;
    private String isbn;
    private int cantidad;
    private double precio;

    /**
     *
     */
    public DetalleVenta() {
    }

    /**
     *
     * @param idDetalleVenta
     * @param noVenta
     * @param isbn
     * @param cantidad
     * @param precio
     */
    public DetalleVenta(int idDetalleVenta, int noVenta, String isbn, int cantidad, double precio) {
        this.idDetalleVenta = idDetalleVenta;
        this.noVenta = noVenta;
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     *
     * @param idDetalleVenta
     */
    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    /**
     *
     * @return
     */
    public int getNoVenta() {
        return noVenta;
    }

    /**
     *
     * @param noVenta
     */
    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    /**
     *
     * @return
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
