package org.libreria.model;

/**
 * Representa una línea de venta en la aplicación, la cual asocia un libro
 * con su respectiva cantidad. 
 * Funciona como una fila temporal en la interfaz de pantalla de venta 
 * antes de persistir los datos como {@code DetalleVenta} en la base de datos.
 * 
 * @author informatica
 */
public class LineaVenta {
    private Libro libro;
    private int cantidad;

    /**
     * Constructor por defecto. Crea una nueva instancia de LineaVenta vacía.
     */
    public LineaVenta() {
    }

    /**
     * Constructor parametrizado. Crea una nueva línea de venta con el libro 
     * y la cantidad especificados.
     * 
     * @param libro el libro que se añade a la venta
     * @param cantidad la cantidad de ejemplares de dicho libro
     */
    public LineaVenta(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el libro asociado a esta línea de venta.
     * 
     * @return el objeto {@link Libro} actual
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Establece o modifica el libro asociado a esta línea de venta.
     * 
     * @param libro el nuevo {@link Libro} a asignar
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la cantidad de ejemplares del libro en esta línea de venta.
     * 
     * @return la cantidad en formato entero
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece o modifica la cantidad de ejemplares para esta línea de venta.
     * 
     * @param cantidad la nueva cantidad a asignar
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el código ISBN del libro asociado de forma directa.
     * 
     * @return el ISBN del libro como cadena de texto
     */
    public String getIsbn() {
        return libro.getIsbn();
    }

    /**
     * Obtiene el título del libro asociado de forma directa.
     * 
     * @return el título del libro como cadena de texto
     */
    public String getTitulo() {
        return libro.getTitulo();
    }

    /**
     * Obtiene el precio unitario del libro asociado de forma directa.
     * 
     * @return el precio del libro en formato double
     */
    public double getPrecio() {
        return libro.getPrecio();
    }

    /**
     * Calcula y obtiene el subtotal de la línea de venta 
     * multiplicando el precio unitario del libro por la cantidad de ejemplares.
     * 
     * @return el subtotal calculado en formato double
     */
    public double getSubtotal() {
        return libro.getPrecio() * cantidad;
    }
}