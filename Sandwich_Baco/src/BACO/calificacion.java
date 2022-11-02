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
public class calificacion {
    
    private float calificacion;
    private String comentario;

    public calificacion(float calificacion, String comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
    }
    
    public void realizarComentario(){
        JOptionPane.showInputDialog("Ingrese un comentario: ");
    }
    
    public void realizarCalificacion(){
    
        JOptionPane.showInputDialog("Califique el servicio de 1 a 5");
    }
    
}
