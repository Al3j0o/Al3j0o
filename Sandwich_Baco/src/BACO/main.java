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
public class main {
    public static void main(String[] args) {
        
        ArrayList<Sandwich>  listaSandwich=new ArrayList<>();
        admin alejo=new admin("112233aa","Alejandro","Al3jo","1027400115","3192109389");
        proveedores proveedor=new proveedores("PR12345", "Productos SA", "Produ", "1122334455","3120009992");
      
        int input=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a sandwiches BACO: ¿Cuál es tu rol?\n"+
                "1. Administrador\n"
                + "2. proveedor \n"+
                "3. Cliente \n"
                + "4. Salir"));
        
        if(input==1){
            alejo.iniciarSesion();
            JOptionPane.showMessageDialog(null, "Hola "+alejo.getNombre()+"¿Qué deseas hacer? \n"
                    + "1. Ver el inventario \n"
                    + "2. Modificar la carta \n");
            
        }
        
        else if(input==2){
            proveedor.iniciarSesion();
            JOptionPane.showInputDialog("Hola "+proveedor.getNombre()+"¿Qué deseas hacer? \n"
                    + "1. Ver el inventario \n"
                    + "2. Modificar la carta \n");
            
        }
        
        else if(input==3){}
        
        else{JOptionPane.showMessageDialog(null, "Opción no válida, hagalo de nuevo");}
        
        listaSandwich.add(Sandwich.ASIATICO);
        listaSandwich.add(Sandwich.CRIOLLO);
        listaSandwich.add(Sandwich.INFANTIL);
        listaSandwich.add(Sandwich.ITALIANO);
        listaSandwich.add(Sandwich.JAMON);
        listaSandwich.add(Sandwich.MARES);
        listaSandwich.add(Sandwich.MEXICANO);
        listaSandwich.add(Sandwich.PERSONALIZADO);
        listaSandwich.add(Sandwich.POLLO);
        listaSandwich.add(Sandwich.VEGGIE);
        
//        Inventario inventario=new Inventario(new ArrayList<Object>());
//        carta carta=new carta();
//        
//        proveedor.agregarIngredientes("Tomates", 34);
//        
//        alejo.modificarCarta();   
        JOptionPane.showMessageDialog(null, listaSandwich);
       
    }
    
}