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
public class admin extends Persona{
    
    private String claveAdmin;

    public admin(String claveAdmin, String nombre, String Usuario, String id, String telefono) {
        super(nombre, Usuario, id, telefono);
        this.claveAdmin = claveAdmin;
    }


    public String getClave() {
        return claveAdmin;
    }
    
    public void modificarCarta(){
        
        JOptionPane.showInputDialog("¿Que sandwich desea?");
    }
    
    public void iniciarSesion(){
        int cont=0;
        int x=0;
        String usuario=JOptionPane.showInputDialog("Ingrese su usuario: ");
        String contra=JOptionPane.showInputDialog("Ingrese su contraseña: ");
        while(x==0){
            cont+=1;
            if(!usuario.equals(this.Usuario)||!contra.equals(this.claveAdmin)){ 
                JOptionPane.showMessageDialog(null, "Intente de nuevo");
                usuario=JOptionPane.showInputDialog("Ingrese su usuario: ");
                contra=JOptionPane.showInputDialog("Ingrese su contraseña: ");
                if(cont==2){
                JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos, regrese mas tarde");
                x=1;
            }
        }
            
            else if(usuario.equals(this.Usuario)&&contra.equals(this.claveAdmin)){
                x=1;
            }
        
        }
        
    
    }
    
    
    
    
}
