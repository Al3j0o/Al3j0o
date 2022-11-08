/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Al3jo
 */
public class admin extends Persona{
    
    private String claveAdmin;

    public admin(String claveAdmin, String nombre, String Usuario, String id, String telefono) {
        super(nombre, Usuario, id, telefono);
        this.claveAdmin = claveAdmin;
    }

    public String getClaveAdmin() {
        return claveAdmin;
    }
 
    public void verInventario(ArrayList<Inventario> a){
        JOptionPane.showMessageDialog(null, "El estado del inventario es: "+a);
    }
    
    public void verHistorialClientes(ArrayList<cliente> a){
        JOptionPane.showMessageDialog(null, "El historial de clientes actual es: ");
    }
    
    
}
