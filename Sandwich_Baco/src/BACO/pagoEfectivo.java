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
public class pagoEfectivo extends Pago {
    
    private double montoBillete;
    private double vueltas;

    public pagoEfectivo(double montoBillete, double vueltas, cliente titular, double monto) {
        super(titular, monto);
        this.montoBillete = montoBillete;
        this.vueltas = vueltas;
    }
    
    public void generarPago(Sandwich a){
        JOptionPane.showMessageDialog(null, "Debes pagar: "+a.getPrecio());
        montoBillete=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la denominación del billete: "));
        monto=a.getPrecio();
        
        if(montoBillete>monto){            
            vueltas=montoBillete-monto;
            JOptionPane.showMessageDialog(null, "Tus vueltas son de: "+vueltas+"\n Gracias por elegir nuestro servicio");
        }
        else if(montoBillete==monto){
            JOptionPane.showMessageDialog(null, "Pago exitoso\nGracias por seleccioanrnos :D");
        }
        else{
            JOptionPane.showMessageDialog(null, "El pago no se pudo relaizar intente de nuevo ");
        }
    }
    
    
    
}
