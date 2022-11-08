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
    
    public void agregarIngredientes(String a, int x){
        for(Inventario i:listaIngredientes){
            if(i.AGUACATE.CARNE.AGUA.CEBOLLA.FRIJOLES.GASEOSA.HUEVO.JALAPENO.JAMON.LECHUGA.MAIZ.MARISCOS.PAN.PAPAS.PEPPERONI.POLLO.QUESO.TOMATE.TOFU.SALSA_TOMATE.SALSA_TERIYAKI.SALSA_MOSTAZA.SALSA_BBQ.SALSA_AJO.RAICES_CHINAS.getNombre().equals(a)){
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
