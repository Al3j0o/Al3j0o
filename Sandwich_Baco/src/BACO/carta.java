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
public class carta {
    
    private String nomSandwich;
    private int precio;

    public carta(String nomSandwich, int precio) {
        this.nomSandwich = nomSandwich;
        this.precio = precio;
    }
    
    public carta(){
    }

    public String getNomSandwich() {
        return nomSandwich;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void mostrarCarta(){
        JOptionPane.showInputDialog("¿Que sandwich desea?"+"\n"+this.nomSandwich+"      "+this.precio);
    }
        
}
