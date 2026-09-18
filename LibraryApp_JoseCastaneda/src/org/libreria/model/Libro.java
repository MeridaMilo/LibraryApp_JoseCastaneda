package org.libreria.model;

/**
 * Representa un libro dentro del sistema de la librería.
 * Contiene información detallada sobre sus características, categoría y stock disponible.
 * 
 * @author informatica
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String fechaPublicacion;
    private double precio;
    private int idCategoria;
    private String nitEditorial;
    private int stock;

    /**
     * Constructor por defecto de la clase Libro.
     * Permite crear una instancia vacía del libro.
     */
    public Libro() {
    }

    /**
     * Constructor con todos los parámetros para inicializar un libro.
     * 
     * @param isbn Identificador único internacional del libro (ISBN).
     * @param titulo Título del libro.
     * @param fechaPublicacion Fecha en la que fue publicado el libro.
     * @param precio Precio de venta del libro.
     * @param idCategoria Identificador de la categoría a la que pertenece el libro.
     * @param nitEditorial NIT de la editorial que publica el libro.
     * @param stock Cantidad de ejemplares disponibles en inventario.
     */
    public Libro(String isbn, String titulo, String fechaPublicacion, double precio, int idCategoria, String nitEditorial, int stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.nitEditorial = nitEditorial;
        this.stock = stock;
    }

    /**
     * Obtiene el código ISBN del libro.
     * 
     * @return El ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece o modifica el código ISBN del libro.
     * 
     * @param isbn El nuevo ISBN a asignar.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece o modifica el título del libro.
     * 
     * @param titulo El nuevo título a asignar.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la fecha de publicación del libro.
     * 
     * @return La fecha de publicación.
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Establece o modifica la fecha de publicación del libro.
     * 
     * @param fechaPublicacion La nueva fecha de publicación a asignar.
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Obtiene el precio del libro.
     * 
     * @return El precio del libro.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece o modifica el precio del libro.
     * 
     * @param precio El nuevo precio a asignar.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el identificador de la categoría del libro.
     * 
     * @return El ID de la categoría.
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Establece o modifica el identificador de la categoría del libro.
     * 
     * @param idCategoria El nuevo ID de categoría a asignar.
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * Obtiene el NIT de la editorial del libro.
     * 
     * @return El NIT de la editorial.
     */
    public String getNitEditorial() {
        return nitEditorial;
    }

    /**
     * Establece o modifica el NIT de la editorial del libro.
     * 
     * @param nitEditorial El nuevo NIT de la editorial a asignar.
     */
    public void setNitEditorial(String nitEditorial) {
        this.nitEditorial = nitEditorial;
    }

    /**
     * Obtiene la cantidad de stock disponible del libro.
     * 
     * @return El stock actual.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece o modifica la cantidad de stock disponible del libro.
     * 
     * @param stock La nueva cantidad de stock a asignar.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Devuelve una representación en cadena del objeto Libro.
     * En este caso, retorna únicamente el título del libro, útil para componentes visuales como ComboBoxes o listas.
     * 
     * @return El título del libro.
     */
    @Override
    public String toString() {
        return titulo;
    }
}