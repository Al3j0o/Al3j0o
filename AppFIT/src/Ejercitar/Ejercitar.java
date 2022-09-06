/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercitar;
import Persona.Persona;
import javax.swing.JOptionPane;
/**
 *
 * @author SALA
 */
public class Ejercitar {
    
    private float Ttotal;
    private float Tcalorias;
    Persona personax;

    public Ejercitar(Persona personax) {
        this.personax = personax;
    }
    
    /*
    metodos
    actualizr peso
    IMC
    */
    
    public void actualizarPeso(){
        
        if(this.Tcalorias>=3500){
            personax.setPeso(personax.getPeso()-1);
            this.Tcalorias=0;
        }
    }
    
    public float imc(float Peso, float Estatura){
        float IMC = (Peso)/((Estatura)*(Estatura));
        if(IMC<18.5f){
            JOptionPane.showMessageDialog(null, "Bajo Peso");
        }
        else if(IMC>=18.5f && IMC<24.9f){
            JOptionPane.showMessageDialog(null, "Peso normal");
        }
        else if(IMC>=24.9f && IMC<29.9f){
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        }
        else if(IMC>29.9f){
            JOptionPane.showMessageDialog(null, "Obesidad");
        }
    return IMC;
    }
    
    public void correr(float Peso, float T, float Vel){
        float dist=Vel*T*(1/60);
        float Cal=1.03f*Peso*dist;
        this.Tcalorias+=Cal;
        this.Ttotal+=T;
    }
    
    public void historico(){
        JOptionPane.showMessageDialog(null, "Usted ha ejercitado un total de: "+this.Ttotal+" Minutos\n Usted ha quemado un total de: "+this.Tcalorias+" Calorias");
    }
}
