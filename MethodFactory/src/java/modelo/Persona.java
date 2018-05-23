/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Persona implements InterfacePersona{
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getCiudad() {
        return ciudad;
    }


    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad=ciudad;
    }
    
}
