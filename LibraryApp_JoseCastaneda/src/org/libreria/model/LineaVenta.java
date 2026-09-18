
package org.libreria.model;

//Línea de venta: un libro con su cantidad, usada como fila temporal en la pantalla de venta
//antes de guardar los DetalleVenta en la base de datos.

/**
 *
 * @author informatica
 */
public class LineaVenta {
    private Libro libro;
    private int cantidad;

    /**
     *
     */
    public LineaVenta() {
    }

    /**
     *
     * @param libro
     * @param cantidad
     */
    public LineaVenta(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     *
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
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
    public String getIsbn() {
        return libro.getIsbn();
    }

    /**
     *
     * @return
     */
    public String getTitulo() {
        return libro.getTitulo();
    }

    /**
     *
     * @return
     */
    public double getPrecio() {
        return libro.getPrecio();
    }

    /**
     *
     * @return
     */
    public double getSubtotal() {
        return libro.getPrecio() * cantidad;
    }
}