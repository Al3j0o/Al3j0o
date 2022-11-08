/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

/**
 *
 * @author Al3jo
 */
public abstract class Persona {
    
    private String nombre;
    private String Usuario;
    private String id;
    private String telefono;

    public Persona(String nombre, String Usuario, String id, String telefono) {
        this.nombre = nombre;
        this.Usuario = Usuario;
        this.id = id;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
}
