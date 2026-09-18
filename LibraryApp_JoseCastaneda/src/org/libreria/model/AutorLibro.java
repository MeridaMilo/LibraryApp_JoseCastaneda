package org.libreria.model;

/**
 * Representa la relación intermedia (tabla puente) entre un autor y un libro 
 * dentro del sistema de la librería, permitiendo gestionar asociaciones de 
 * muchos a muchos.
 * 
 * @author informatica
 */
public class AutorLibro {
    private int idAutorLibro;
    private int idAutor;
    private String isbn;

    /**
     * Constructor por defecto de la clase AutorLibro.
     * Permite crear una instancia vacía de la relación.
     */
    public AutorLibro() {
    }

    /**
     * Constructor con todos los parámetros para inicializar la relación entre autor y libro.
     * 
     * @param idAutorLibro Identificador único del registro de la relación.
     * @param idAutor Identificador único del autor asociado.
     * @param isbn Código ISBN del libro asociado.
     */
    public AutorLibro(int idAutorLibro, int idAutor, String isbn) {
        this.idAutorLibro = idAutorLibro;
        this.idAutor = idAutor;
        this.isbn = isbn;
    }

    /**
     * Obtiene el identificador único de la relación autor-libro.
     * 
     * @return El ID del registro AutorLibro.
     */
    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    /**
     * Establece o modifica el identificador del registro de la relación.
     * 
     * @param idAutorLibro El nuevo ID de la relación a asignar.
     */
    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }

    /**
     * Obtiene el identificador del autor asociado.
     * 
     * @return El ID del autor.
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * Establece o modifica el identificador del autor asociado.
     * 
     * @param idAutor El nuevo ID de autor a asignar.
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    /**
     * Obtiene el código ISBN del libro asociado.
     * 
     * @return El ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece o modifica el código ISBN del libro asociado.
     * 
     * @param isbn El nuevo ISBN a asignar.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}