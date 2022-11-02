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
public class Inventario {
    
    private ArrayList<Object> listaIngredientes;

    public Inventario(ArrayList<Object> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    
    public void mostrarInventario(){
        JOptionPane.showMessageDialog(null, this.listaIngredientes);
    }

    public ArrayList<Object> getListaIngredientes() {
        return listaIngredientes;
    }
    
    
    
}
