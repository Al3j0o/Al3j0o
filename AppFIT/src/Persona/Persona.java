/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Persona {
    
    private final String Nombre;
    private int Edad;
    private float Estatura;
    private float Peso;

    public Persona(String Nombre, float Estatura) {
        this.Nombre = Nombre;
        this.Estatura=Estatura;    
    }
    
    public Persona(String Nombre,int Edad,float Estatura, float Peso){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Estatura=Estatura;
        this.Peso=Peso;
    
    }

    public String getNombre(String Nombre) {
        
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        
        if(Edad>10 && Edad<90){
            
            this.Edad=Edad;
        }
        else{
            JOptionPane.showMessageDialog(null, "Edad incorrecta");
        }
    }

    public float getEstatura() {
        return Estatura;
    }

    public void setEstatura(float estatura) {
        if(estatura>=1.30 && estatura<=2.10){
        this.Estatura = estatura;
        }
        else{
        JOptionPane.showMessageDialog(null, "Estatura invalida");
        }
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        this.Peso = peso;
    }
    
    public void mostrar(){
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+Nombre+"\nSu edad es: "+Edad+"\nSu estatura es de: "+Estatura+"\nSu pesop es de: "+Peso);
    }
}
