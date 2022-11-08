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
public enum Inventario{
    LECHUGA(100, "lechuga"),
    TOMATE(100, "tomate"),
    PAN(100,"pan"),
    CEBOLLA(100,"cebolla"),
    QUESO(100,"queso"),
    JALAPENO(100,"jalapeño"),
    SALSA_TOMATE(50,"salsa de tomate"),
    SALSA_MOSTAZA(50, "mostaza"),
    SALSA_AJO(50, "salsa de ajo"),
    SALSA_BBQ(50, "salsa bbq"),
    PEPPERONI(100,"perpperoni"),
    JAMON(100, "jamon"),
    MARISCOS(100, "mariscos"),
    HUEVO(100, "huevo"),
    POLLO(100, "pollo"),
    MAIZ(200,"maiz"),
    FRIJOLES(200, "frijoles"),
    CARNE(100, "carne"),
    TOFU(100, "tofu"),
    RAICES_CHINAS(100, "raices chinas"),
    AGUACATE(100, "aguacate"),
    PAPAS(100, "papas"),
    GASEOSA(100, "gaseosa"),
    AGUA(100, "agua"),
    SALSA_TERIYAKI(100,"salsa teriyaki");
    
    private int cantidad;
    private String nombre;
    
    private Inventario(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Inventario{" + "cantidad=" + cantidad + ", nombre=" + nombre + '}';
    }
    
}
