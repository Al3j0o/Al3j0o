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
    private ArrayList<Inventario> listaIngredientes=new ArrayList<>();

    public proveedores(String claveProv, String nombre, String Usuario, String id, String telefono) {
        super(nombre, Usuario, id, telefono);
        this.claveProv = claveProv;
    }

    public String getClaveProv() {
        return claveProv;
    }

    public ArrayList<Inventario> getListaIngredientes() {
        return listaIngredientes;
    }
    
    public void mostrarInventario(ArrayList<Inventario> a){
        JOptionPane.showMessageDialog(null, "Los ingredientes disponibles son: \n"
                + listaIngredientes);
        
    }
    
    public ArrayList<Inventario> ingredientesPrede(){
        listaIngredientes.add(Inventario.AGUACATE);
        listaIngredientes.add(Inventario.CARNE);
        listaIngredientes.add(Inventario.CEBOLLA);
        listaIngredientes.add(Inventario.FRIJOLES);
        listaIngredientes.add(Inventario.GASEOSA);
        listaIngredientes.add(Inventario.AGUA);
        listaIngredientes.add(Inventario.GASEOSA);
        listaIngredientes.add(Inventario.HUEVO);
        listaIngredientes.add(Inventario.JALAPENO);
        listaIngredientes.add(Inventario.JAMON);
        listaIngredientes.add(Inventario.LECHUGA);
        listaIngredientes.add(Inventario.MAIZ);
        listaIngredientes.add(Inventario.MARISCOS);
        listaIngredientes.add(Inventario.PAN);
        listaIngredientes.add(Inventario.PAPAS);
        listaIngredientes.add(Inventario.PEPPERONI);
        listaIngredientes.add(Inventario.POLLO);
        listaIngredientes.add(Inventario.QUESO);
        listaIngredientes.add(Inventario.RAICES_CHINAS);
        listaIngredientes.add(Inventario.SALSA_AJO);
        listaIngredientes.add(Inventario.SALSA_BBQ);
        listaIngredientes.add(Inventario.SALSA_MOSTAZA);
        listaIngredientes.add(Inventario.SALSA_TERIYAKI);
        listaIngredientes.add(Inventario.SALSA_TOMATE);
        listaIngredientes.add(Inventario.TOFU);
        listaIngredientes.add(Inventario.TOMATE);
        
        return listaIngredientes;
    }
    
    public void agregarIngredientes(String a, int x){
        if(listaIngredientes.isEmpty()){
            
        }
        for(Inventario i:listaIngredientes){
            if(i.TOMATE.getNombre().equals(a)){
                i.setCantidad(i.getCantidad()+x);
            }
        }
    }
    public void eliminarIngredientes(String a, int x){
        for(Inventario i:listaIngredientes){
            if(i.AGUACATE.CARNE.AGUA.CEBOLLA.FRIJOLES.GASEOSA.HUEVO.JALAPENO.JAMON.LECHUGA.MAIZ.MARISCOS.PAN.PAPAS.PEPPERONI.POLLO.QUESO.TOMATE.TOFU.SALSA_TOMATE.SALSA_TERIYAKI.SALSA_MOSTAZA.SALSA_BBQ.SALSA_AJO.RAICES_CHINAS.getNombre().equals(a)){
                i.setCantidad(i.getCantidad()-x);
            }
        }
    }
}
