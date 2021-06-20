package com.example.login;

public class contactos {
    public int imagen;
    public  String nombre;
    public  String correo;

    public contactos(int imagen, String nombre, String correo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
