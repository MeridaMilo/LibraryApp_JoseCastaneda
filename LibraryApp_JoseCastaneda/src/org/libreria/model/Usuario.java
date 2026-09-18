package org.libreria.model;

import java.sql.Timestamp;

/**
 * Representa a un usuario dentro del sistema de la librería.
 * Funciona como un objeto POJO (Plain Old Java Object) que encapsula 
 * la información de autenticación, perfil, rol y estado del usuario.
 * 
 * @author informatica
 */
public class Usuario {
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String rol;
    private boolean activo;
    private Timestamp fechaCreacion;

    /**
     * Constructor por defecto. Crea una nueva instancia de Usuario vacía.
     */
    public Usuario() {
    }

    /**
     * Constructor parametrizado básico. Crea una nueva instancia de Usuario 
     * con los datos de identificación y rol principales.
     * 
     * @param id identificador único del usuario
     * @param username nombre de usuario único en el sistema
     * @param rol rol o perfil de acceso asignado al usuario
     */
    public Usuario(int id, String username, String rol) {
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    /**
     * Constructor parametrizado completo para la creación o registro de un nuevo usuario, 
     * omitiendo el ID y la fecha de creación (que generalmente se autogeneran en la base de datos).
     * 
     * @param username nombre de usuario único
     * @param email correo electrónico de contacto
     * @param firstName nombre(s) del usuario
     * @param lastName apellido(s) del usuario
     * @param passwordHash contraseña cifrada del usuario
     * @param rol rol o perfil de acceso asignado al usuario
     */
    public Usuario(String username, String email, String firstName, String lastName,
            String passwordHash, String rol) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    /**
     * Obtiene el rol o perfil de acceso asignado al usuario.
     * 
     * @return el rol del usuario como cadena de texto
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece o modifica el rol o perfil de acceso del usuario.
     * 
     * @param rol el nuevo rol a asignar
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene el identificador único del usuario.
     * 
     * @return el ID del usuario en formato entero
     */
    public int getId() {
        return id;
    }

    /**
     * Establece o modifica el identificador único del usuario.
     * 
     * @param id el nuevo ID a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de usuario utilizado para el acceso al sistema.
     * 
     * @return el nombre de usuario como cadena de texto
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece o modifica el nombre de usuario.
     * 
     * @param username el nuevo nombre de usuario a asignar
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el correo electrónico registrado del usuario.
     * 
     * @return el correo electrónico como cadena de texto
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece o modifica el correo electrónico del usuario.
     * 
     * @param email el nuevo correo electrónico a asignar
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el nombre (primer nombre) del usuario.
     * 
     * @return el nombre del usuario como cadena de texto
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece o modifica el nombre del usuario.
     * 
     * @param firstName el nuevo nombre a asignar
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene el apellido del usuario.
     * 
     * @return el apellido del usuario como cadena de texto
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece o modifica el apellido del usuario.
     * 
     * @param lastName el nuevo apellido a asignar
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene el hash de la contraseña del usuario.
     * 
     * @return la contraseña cifrada como cadena de texto
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Establece o modifica el hash de la contraseña del usuario.
     * 
     * @param passwordHash la nueva contraseña cifrada a asignar
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Indica si el usuario se encuentra activo en el sistema.
     * 
     * @return {@code true} si el usuario está activo, {@code false} en caso contrario
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Establece o modifica el estado de actividad del usuario.
     * 
     * @param activo el nuevo estado de actividad a asignar
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Obtiene la fecha y hora exacta en la que se creó o registró el usuario.
     * 
     * @return un objeto {@link Timestamp} con la fecha de creación
     */
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece o modifica la fecha de creación del usuario.
     * 
     * @param fechaCreacion el nuevo {@link Timestamp} de creación a asignar
     */
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Usuario,
     * la cual corresponde estrictamente a su nombre de usuario ({@code username}).
     * Es útil para componentes de interfaz gráfica como JComboBox o listas.
     * 
     * @return el nombre de usuario en formato String
     */
    @Override
    public String toString() {
        return username;
    }
}