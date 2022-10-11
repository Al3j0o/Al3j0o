/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anfibios;

/**
 *
 * @author SALA
 */
public class Rana extends Anfibio {
    
    private String Familia;
    private String Especie;

    public Rana(String colorPiel, String tamaño, String sexo, String habitad, String Familia, String Especie ) {
        super(colorPiel, tamaño, sexo, habitad);
        this.Familia = Familia;
        this.Especie = Especie;
    }

    public String getFamilia() {
        return Familia;
    }

    public String getEspecie() {
        return Especie;
    }
    
    
    
    public void Comer(){
        System.out.println("Comiendo..."); 
    }
    
    public void Dormir(){
        System.out.println("Duermiendo...");
    }
    
    public void Caminar(){
        System.out.println("Caminando...");
    }

    @Override
    public String toString() {
        return "Rana{"+"Color de piel: "+this.getColorPiel()+", tamaño: "+this.getTamaño()+", sexo: "+this.getSexo()+", habitad: "+this.getHabitad() + ", Familia=" + Familia + ", Especie=" + Especie + '}';
    }
    
    
    
    
    
}
