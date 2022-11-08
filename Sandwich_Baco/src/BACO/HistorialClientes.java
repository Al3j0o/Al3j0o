/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

import java.util.ArrayList;

/**
 *
 * @author Al3jo
 */
public class HistorialClientes {
    
    private ArrayList<cliente> historialClientes;

    public HistorialClientes(ArrayList<cliente> historialClientes) {
        this.historialClientes = historialClientes;
    }

    public ArrayList<cliente> getHistorialClientes() {
        return historialClientes;
    }
    
    public void agregarCliente(cliente a){
        historialClientes.add(a);
    }
}
