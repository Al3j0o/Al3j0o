/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

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
    POLLO("Sandwich de Pollo","",13_000), 
    JAMON("Sandwich de Jamon","",13_000);
        
    private String nombre;
    private String descripcion;
    private double precio;
    
    private Sandwich(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;    
    }

    @Override
    public String toString() {
        return "Sandwich{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}'+"\n   ";
        
                                                                                                                                                                                                                                                                                                    }
    
    
    
}
