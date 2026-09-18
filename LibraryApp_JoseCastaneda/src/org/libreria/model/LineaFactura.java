package org.libreria.model;

/**
 * Proyección de solo lectura para la factura: una fila del resultado del procedimiento almacenado
 * sp_buscar_factura (involucra datos de venta, cliente, libro y usuario). No es una entidad de base de datos editable.
 * 
 * @author informatica
 */
public class LineaFactura {
    private int numeroFactura;
    private String fechaEmision;
    private long cuiCliente;
    private String nombreCliente;
    private String correoCliente;
    private String isbnLibro;
    private String tituloLibro;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String usuarioAtendio;
    private double granTotal;

    /**
     * Constructor por defecto de la clase LineaFactura.
     * Permite crear una instancia vacía de la proyección.
     */
    public LineaFactura() {
    }

    /**
     * Obtiene el número de factura.
     * 
     * @return El número de la factura.
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Establece o modifica el número de factura.
     * 
     * @param numeroFactura El nuevo número de factura a asignar.
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * Obtiene la fecha de emisión de la factura.
     * 
     * @return La fecha de emisión.
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece o modifica la fecha de emisión de la factura.
     * 
     * @param fechaEmision La nueva fecha de emisión a asignar.
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Obtiene el CUI del cliente asociado a la factura.
     * 
     * @return El CUI del cliente.
     */
    public long getCuiCliente() {
        return cuiCliente;
    }

    /**
     * Establece o modifica el CUI del cliente asociado a la factura.
     * 
     * @param cuiCliente El nuevo CUI del cliente a asignar.
     */
    public void setCuiCliente(long cuiCliente) {
        this.cuiCliente = cuiCliente;
    }

    /**
     * Obtiene el nombre del cliente asociado a la factura.
     * 
     * @return El nombre del cliente.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Establece o modifica el nombre del cliente asociado a la factura.
     * 
     * @param nombreCliente El nuevo nombre del cliente a asignar.
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Obtiene el correo electrónico del cliente asociado a la factura.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     * Establece o modifica el correo electrónico del cliente asociado a la factura.
     * 
     * @param correoCliente El nuevo correo del cliente a asignar.
     */
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    /**
     * Obtiene el código ISBN del libro de esta línea de factura.
     * 
     * @return El ISBN del libro.
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     * Establece o modifica el código ISBN del libro de esta línea de factura.
     * 
     * @param isbnLibro El nuevo ISBN del libro a asignar.
     */
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    /**
     * Obtiene el título del libro de esta línea de factura.
     * 
     * @return El título del libro.
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * Establece o modifica el título del libro de esta línea de factura.
     * 
     * @param tituloLibro El nuevo título del libro a asignar.
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     * Obtiene la cantidad de ejemplares comprados del libro en esta línea.
     * 
     * @return La cantidad de libros.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece o modifica la cantidad de ejemplares comprados del libro en esta línea.
     * 
     * @param cantidad La nueva cantidad a asignar.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio unitario del libro al momento de la venta.
     * 
     * @return El precio unitario.
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Establece o modifica el precio unitario del libro al momento de la venta.
     * 
     * @param precioUnitario El nuevo precio unitario a asignar.
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Obtiene el subtotal calculado para esta línea de factura (cantidad por precio unitario).
     * 
     * @return El subtotal de la línea.
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Establece o modifica el subtotal calculado para esta línea de factura.
     * 
     * @param subtotal El nuevo subtotal a asignar.
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Obtiene el nombre o identificador del usuario que atendió la venta.
     * 
     * @return El usuario que atendió.
     */
    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    /**
     * Establece o modifica el nombre o identificador del usuario que atendió la venta.
     * 
     * @param usuarioAtendio El nuevo usuario a asignar.
     */
    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio;
    }

    /**
     * Obtiene el gran total acumulado de la factura.
     * 
     * @return El gran total de la factura.
     */
    public double getGranTotal() {
        return granTotal;
    }

    /**
     * Establece o modifica el gran total acumulado de la factura.
     * 
     * @param granTotal El nuevo gran total a asignar.
     */
    public void setGranTotal(double granTotal) {
        this.granTotal = granTotal;
    }
}