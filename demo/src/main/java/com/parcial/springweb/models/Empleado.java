package com.parcial.springweb.models;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Empleado {
    @NotEmpty(message ="El id no puede estar vacio")
    @Size(min = 1, max = 3)  
    private String id;
    @NotEmpty(message ="El nombre no puede estar vacio")
    private String nombre;
    @NotEmpty(message ="El apellido no puede estar vacio")
    private String apellido;
    @NotEmpty(message ="El correo no puede estar vacio")
    private String correo;
    @NotEmpty(message ="La direccion no puede estar vacia")
    private String direccion;
    @NotEmpty(message ="El telefono no puede estar vacio")
    private String telefono;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String correo, String direccion, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

}
