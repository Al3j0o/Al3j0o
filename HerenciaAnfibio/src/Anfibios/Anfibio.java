/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anfibios;

/**
 *
 * @author SALA
 */
public class Anfibio {
    private String colorPiel;
    private String tamaño;
    private String sexo;
    private String habitad;

    public Anfibio(String colorPiel, String tamaño, String sexo, String habitad) {
        this.colorPiel = colorPiel;
        this.tamaño = tamaño;
        this.sexo = sexo;
        this.habitad = habitad;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getSexo() {
        return sexo;
    }

    public String getHabitad() {
        return habitad;
    }
    
    
    

    @Override
    public String toString() {
        return "Anfibio{" + "colorPiel=" + colorPiel + ", tamaño=" + tamaño + ", sexo=" + sexo + ", habitad=" + habitad + '}';
    }
    
    
    
    
}
