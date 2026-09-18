package org.libreria.model;

import java.sql.Timestamp;

//POJO: Nombre, atributos de clase, constructores, metodos(get y set) otros...
//encapssulación, herencia, polimorfismo, abstractión

/**
 *
 * @author informatica
 */
public class Usuario {
    //id, username, email, first_name, last_name, password_hash, rol, activo, fecha_creacion
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
     *
     */
    public Usuario() {
    }

    /**
     *
     * @param id
     * @param username
     * @param rol
     */
    public Usuario(int id, String username, String rol) {
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    /**
     *
     * @param username
     * @param email
     * @param firstName
     * @param lastName
     * @param passwordHash
     * @param rol
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
     *
     * @return
     */
    public String getRol() {
        return rol;
    }

    /**
     *
     * @param rol
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     *
     * @param passwordHash
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     *
     * @return
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     *
     * @param activo
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     *
     * @return
     */
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     *
     * @param fechaCreacion
     */
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return username;
    }
}
