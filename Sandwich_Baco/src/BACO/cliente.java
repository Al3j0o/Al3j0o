/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

import javax.swing.JOptionPane;

/**
 *
 * @author Al3jo
 */
public class cliente extends Persona {

    public cliente(String nombre, String Usuario, String id, String telefono) {
        super(nombre, Usuario, id, telefono);
    }
    
    public boolean iniciarSesion(String a, String b){
        
        boolean pass=false;
        String x=JOptionPane.showInputDialog("Hola "+ a + "¿Deseas realizar tu pedido?");
        if(x.toLowerCase().equals("si")){
            pass=true;
        }
        return pass;
    }
    
    
    
}
