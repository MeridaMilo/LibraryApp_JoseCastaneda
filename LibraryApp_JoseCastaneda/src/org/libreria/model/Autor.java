
package org.libreria.model;

/**
 * Representa un autor dentro del sistema de la librería.
 * Contiene información personal y biográfica del escritor.
 * 
 * @author informatica
 */
public class Autor {
    private int idAutor;
    private String nombreAutor;
    private String apellidoAutor;
    private String nacionalidad;
    private String biografia;

    /**
     * Constructor por defecto de la clase Autor.
     * Permite crear una instancia vacía del autor.
     */
    public Autor() {
    }

    /**
     * Constructor con todos los parámetros para inicializar un autor.
     * 
     * @param idAutor Identificador único del autor.
     * @param nombreAutor Nombre o nombres del autor.
     * @param apellidoAutor Apellido o apellidos del autor.
     * @param nacionalidad Nacionalidad de origen del autor.
     * @param biografia Breve reseña biográfica o historia del autor.
     */
    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String nacionalidad, String biografia) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    /**
     * Obtiene el identificador único del autor.
     * 
     * @return El ID del autor.
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * Establece o modifica el identificador del autor.
     * 
     * @param idAutor El nuevo ID a asignar.
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    /**
     * Obtiene el nombre del autor.
     * 
     * @return El nombre del autor.
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Establece o modifica el nombre del autor.
     * 
     * @param nombreAutor El nuevo nombre a asignar.
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     * Obtiene el apellido del autor.
     * 
     * @return El apellido del autor.
     */
    public String getApellidoAutor() {
        return apellidoAutor;
    }

    /**
     * Establece o modifica el apellido del autor.
     * 
     * @param apellidoAutor El nuevo apellido a asignar.
     */
    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    /**
     * Obtiene la nacionalidad del autor.
     * 
     * @return La nacionalidad del autor.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Establece o modifica la nacionalidad del autor.
     * 
     * @param nacionalidad La nueva nacionalidad a asignar.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene la biografía del autor.
     * 
     * @return La biografía del autor.
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * Establece o modifica la biografía del autor.
     * 
     * @param biografia La nueva biografía a asignar.
     */
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    /**
     * Devuelve una representación en cadena del objeto Autor.
     * Concatena el nombre y el apellido separados por un espacio, lo cual es útil 
     * para mostrar el nombre completo en interfaces de usuario como ComboBoxes o listas.
     * 
     * @return El nombre completo del autor (Nombre y Apellido).
     */
    @Override
    public String toString() {
        return nombreAutor + " " + apellidoAutor;
    }
}