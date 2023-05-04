package com.moraduartelf.nowillc;

public class ListContact {
    private String nombre,posicion,telefono,email;
    private int imagen;

    public ListContact() {
    }

    public ListContact(String nombre, String posicion, String telefono, String email, int imagen) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.telefono = telefono;
        this.email = email;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
