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
public enum Sandwich{
        
    PERSONALIZADO("Sandwich Personalizado","Un sandwich que puedes armar como quieras",15_000.0), 
    ITALIANO("Sandwich Italiano","Lo mejor de la gastronomia italiana entre dos panes",18_000.0), 
    MEXICANO("Sandwich Mexicano","",18_000.0), 
    ASIATICO("Sandwich Asiático","",18_000.0), 
    VEGGIE("Sandwich Vegetariano","",16_000),     
    INFANTIL("Sandwich Infantil","",15_000), 
    CRIOLLO("Sandwich Criollo","",18_000), 
    MARES("Sandwich del Mar","",20_000), 
    POLLO("Sandwich de Pollo","",15_000), 
    JAMON("Sandwich de Jamon","",13_000);
        
    private String nombre;
    private String descripcion;
    private double precio;
    
    private Sandwich(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;    
    }

    public String getNombre() {
        return nombre;  
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void crearSandwichPollo(String a){
        if(a.equals(this.POLLO.getNombre())){
            Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
            Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
            Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
            Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
            Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-1);
            Inventario.SALSA_TOMATE.setCantidad(Inventario.SALSA_TOMATE.getCantidad()-1);
            Inventario.SALSA_BBQ.setCantidad(Inventario.SALSA_BBQ.getCantidad()-1);
            Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
            Inventario.POLLO.setCantidad(Inventario.POLLO.getCantidad()-2);
        }
    }
        
    public void crearSandwichJamon(String a){
        if(a.equals(this.JAMON.getNombre())){
            Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
            Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
            Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
            Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
            Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-1);
            Inventario.SALSA_TOMATE.setCantidad(Inventario.SALSA_TOMATE.getCantidad()-1);
            Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
            Inventario.JAMON.setCantidad(Inventario.JAMON.getCantidad()-2);
        }
    }
    
    public void crearSandwichMexicano(String a){
        if(a.equals(this.MEXICANO.getNombre())){
            Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
            Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
            Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
            Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
            Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-1);
            Inventario.AGUACATE.setCantidad(Inventario.AGUACATE.getCantidad()-1);
            Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
            Inventario.CARNE.setCantidad(Inventario.CARNE.getCantidad()-2);
            Inventario.FRIJOLES.setCantidad(Inventario.FRIJOLES.getCantidad()-1);
            Inventario.MAIZ.setCantidad(Inventario.MAIZ.getCantidad()-1);
            Inventario.TOMATE.setCantidad(Inventario.SALSA_BBQ.getCantidad()-1);
            Inventario.JALAPENO.setCantidad(Inventario.JALAPENO.getCantidad()-1);
        }
    }
    
        public void crearSandwichItaliano(String a){
        if(a.equals(this.ITALIANO.getNombre())){
            Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
            Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
            Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
            Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
            Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-3);
            Inventario.PEPPERONI.setCantidad(Inventario.PEPPERONI.getCantidad()-1);
            Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
            Inventario.POLLO.setCantidad(Inventario.POLLO.getCantidad()-1);
            Inventario.JAMON.setCantidad(Inventario.JAMON.getCantidad()-1);
        }
    }
        public void crearSandwichVeggie(String a){
        if(a.equals(this.VEGGIE.getNombre())){
            Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-2);
            Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-2);
            Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
            Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-2);
            Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-2);
            Inventario.SALSA_TOMATE.setCantidad(Inventario.SALSA_TOMATE.getCantidad()-1);
            Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
            Inventario.TOFU.setCantidad(Inventario.TOFU.getCantidad()-2);
            Inventario.HUEVO.setCantidad(Inventario.HUEVO.getCantidad()-2);
        }
    }
        
        public void crearSandwichInfantil(String a){
            if(a.equals(this.INFANTIL.getNombre())){
                Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
                Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
                Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
                Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
                Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-1);
                Inventario.SALSA_TOMATE.setCantidad(Inventario.SALSA_TOMATE.getCantidad()-1);
                Inventario.SALSA_MOSTAZA.setCantidad(Inventario.SALSA_MOSTAZA.getCantidad()-1);
                Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
                Inventario.POLLO.setCantidad(Inventario.POLLO.getCantidad()-2);
                Inventario.CARNE.setCantidad(Inventario.CARNE.getCantidad()-1);
        }
    }    
        
        public void crearSandwichAsiatico(String a){
            if(a.equals(this.ASIATICO.getNombre())){
                Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
                Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
                Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
                Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
                Inventario.RAICES_CHINAS.setCantidad(Inventario.RAICES_CHINAS.getCantidad()-1);
                Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
                Inventario.POLLO.setCantidad(Inventario.POLLO.getCantidad()-2);
                Inventario.SALSA_TERIYAKI.setCantidad(Inventario.SALSA_TERIYAKI.getCantidad()-3);
            }
        }
        public void crearSandwichCriollo(String a){
            if(a.equals(this.CRIOLLO.getNombre())){
                Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
                Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
                Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
                Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
                Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-1);
                Inventario.SALSA_TOMATE.setCantidad(Inventario.SALSA_TOMATE.getCantidad()-1);
                Inventario.SALSA_MOSTAZA.setCantidad(Inventario.SALSA_MOSTAZA.getCantidad()-1);
                Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
                Inventario.CARNE.setCantidad(Inventario.CARNE.getCantidad()-2);
                Inventario.MAIZ.setCantidad(Inventario.MAIZ.getCantidad()-1);
            }
        }
        public void crearSandwichMares(String a){
            if(a.equals(this.MARES.getNombre())){
                Inventario.CEBOLLA.setCantidad(Inventario.CEBOLLA.getCantidad()-1);
                Inventario.LECHUGA.setCantidad(Inventario.LECHUGA.getCantidad()-1);
                Inventario.PAN.setCantidad(Inventario.PAN.getCantidad()-2);
                Inventario.TOMATE.setCantidad(Inventario.TOMATE.getCantidad()-1);
                Inventario.SALSA_AJO.setCantidad(Inventario.SALSA_AJO.getCantidad()-1);
                Inventario.QUESO.setCantidad(Inventario.QUESO.getCantidad()-2);
                Inventario.MARISCOS.setCantidad(Inventario.MARISCOS.getCantidad()-2);
            }
    }

    @Override
    public String toString() {
        return "Sandwich{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}'+"\n   ";
        
                                                                                                                                                                                                                                                                                                    }
    
    
    
}
