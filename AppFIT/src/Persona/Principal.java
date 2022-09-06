/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;
import javax.swing.JOptionPane;
import Ejercitar.Ejercitar;
/**
 *
 * @author SALA
 */
public class Principal {
    
    
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
        float estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la estatura: "));
        float peso=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso: "));
        Persona persona1=new Persona(nombre,edad,estatura,peso);
        int salir=0;
        Ejercitar AppFIT=new Ejercitar(persona1);
        while(salir==0){
            
        }
    }
    
}
