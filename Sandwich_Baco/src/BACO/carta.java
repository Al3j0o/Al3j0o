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
    
    private ArrayList<Sandwich> listaSandwich;
    
    public carta(ArrayList<Sandwich> listaSandwich) {
        this.listaSandwich = listaSandwich;
    }
    
    
    public void mostrarCarta(){
        JOptionPane.showMessageDialog(null, listaSandwich);
    }
    
    public ArrayList<Sandwich> agregarSandwich(String a){
        if(listaSandwich.isEmpty()){
            this.listaSandwich.add(Sandwich.PERSONALIZADO);
        }
        
        for(Sandwich i:listaSandwich){
            
            if(i.getNombre().equals(a)){
                JOptionPane.showMessageDialog(null, "El sandwich ya existe");
            }
            else if(!i.getNombre().equals(a)){
                listaSandwich.add(i);
            }
        }
        return listaSandwich;
    }
    
    public ArrayList<Sandwich> eliminarSandwich(String a){
        for(Sandwich i:listaSandwich){
            if(i.getNombre().equals(a)){
                listaSandwich.remove(i);
            }
            else{
                JOptionPane.showMessageDialog(null, "El sandwich no esta en la lista");
            }
        }
        return listaSandwich;
    }
        
}
