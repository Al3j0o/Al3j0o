/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

import GUI.SeleccionSesión;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Al3jo
 */
public class main {
    public static void main(String[] args) {
        
        ArrayList<Sandwich> listaSandwich=new ArrayList<>();
        ArrayList<cliente> historialCliente=new ArrayList<>();
        ArrayList<Inventario> listaIngredientes=new ArrayList<>();
        
        admin alejo=new admin("112233aa","Alejandro","Al3jo","1027400115","3192109389");
        proveedores proveedor=new proveedores("PR12345", "Productos SA", "Produ", "1122334455","3120009992");
        carta carta=new carta(listaSandwich);
        HistorialClientes HC=new HistorialClientes(historialCliente);
        
        
        SeleccionSesión.main(args);
                 
    }
    
}   