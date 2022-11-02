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
public class proveedores extends Persona{
    
    private String claveProv;
    private ArrayList<Object> listaIngredientes=new ArrayList<>();

    public proveedores(String claveProv, String nombre, String Usuario, String id, String telefono) {
        super(nombre, Usuario, id, telefono);
        this.claveProv = claveProv;
    }
    
    public ArrayList<Object> agregarIngredientes(String a, int x){
        
        listaIngredientes.add(a);
        listaIngredientes.add(x);
        JOptionPane.showMessageDialog(null, listaIngredientes);
        
        return listaIngredientes;
 
    }
        public ArrayList<Object> eliminarIngredientes(String a, int x){
            
            listaIngredientes.remove(x);
            
            return listaIngredientes;
        }
    
            public void iniciarSesion(){
        int cont=0;
        int x=0;
        String usuario=JOptionPane.showInputDialog("Ingrese su usuario: ");
        String contra=JOptionPane.showInputDialog("Ingrese su contraseña: ");
        while(x==0){
            cont+=1;
            if(!usuario.equals(this.Usuario)||!contra.equals(this.claveProv)){ 
                JOptionPane.showMessageDialog(null, "Intente de nuevo");
                usuario=JOptionPane.showInputDialog("Ingrese su usuario: ");
                contra=JOptionPane.showInputDialog("Ingrese su contraseña: ");
                if(cont==2){
                JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos, regrese mas tarde");
                x=1;
            }
        }
            
            else if(usuario.equals(this.Usuario)&&contra.equals(this.claveProv)){
                x=1;
            }
        
        }
        
    
    }
       
    
}
