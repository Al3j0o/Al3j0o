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
            int op=Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Bienvenido"+persona1.getNombre()+"\n"+
                    "IMC Actual: "+AppFIT.imc(persona1.getPeso(), persona1.getEstatura())+"\n"+
                    "Que quiere hacer hoy:\n "
                    +"1. Correr"
                    +" 2. salir"));
            switch (op){
                case 1:
                    float V=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad promedio: "));
                    float T=Float.parseFloat(JOptionPane.showInputDialog("Ingrese tiempo de ejercicio: "));
                    AppFIT.correr(persona1.getPeso(), T, V);
                    
                    AppFIT.historico();
                    break;
                case 2:
                    salir=1;
            }    
        }
        JOptionPane.showMessageDialog(null, "Gracias "+persona1.getNombre()+" por usar AppFIT :3");
    }
    
}
