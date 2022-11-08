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
public class carta {
    
    private ArrayList<Sandwich> listaSandwich;
    
    public carta(ArrayList<Sandwich> listaSandwich) {
        this.listaSandwich = listaSandwich;
    }
    
    
    public void mostrarCarta(){
        JOptionPane.showMessageDialog(null, listaSandwich);
    }
    
    public ArrayList<Sandwich> agregarSandwich(Sandwich a){
        int cont=0;
        if(listaSandwich.isEmpty()){
            listaSandwich.add(a);
        }
        
        else{
            for(Sandwich i:listaSandwich){
                if(a.equals(i)){
                    cont+=1;
                }
            }
        if(cont==0){
            listaSandwich.add(a);
        }
        else if(cont>=1){
            JOptionPane.showMessageDialog(null, "El sandwich ya existe");
        }
        }
        return listaSandwich;
    }
    
    public ArrayList<Sandwich> eliminarSandwich(Sandwich a){
        int cont=0;
        if(listaSandwich.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay sandwiches para borrar");
        }
        
        else{
            for(Sandwich i:listaSandwich){
                if(a.equals(i)){
                    cont+=1;
                }
            }
        if(cont==1){
            listaSandwich.remove(a);
        }
        else if(cont>=0){
            JOptionPane.showMessageDialog(null, "El sandwich no existe");
        }
        }
        return listaSandwich;
    }
}
