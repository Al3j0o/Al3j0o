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
public class pagoTarjeta extends Pago{
    
    private final String EntidadBancaria;
    private final int contra;
    private final long numTarjeta;
    private double saldo;

    public pagoTarjeta(String EntidadBancaria, int contra, long numTarjeta, double saldo, cliente titular, double monto) {
        super(titular, monto);
        this.EntidadBancaria = EntidadBancaria;
        this.contra = contra;
        this.numTarjeta = numTarjeta;
        this.saldo = saldo;
    }

    public int getContra() {
        return contra;
    }

    public long getNumTarjeta() {
        return numTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void generarPago(Sandwich a) throws Exception{
        int x=0;
        int cont=0;
        while(x==0){
            long c=Long.parseLong(JOptionPane.showInputDialog("Ingrese los numeros de su tarjeta: "));
            int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la contraseña de su tarjeta: "));
            if(c!=this.numTarjeta || b!=this.contra){
                JOptionPane.showMessageDialog(null, "Ingreso fallido intente de nuevo");
                c+=1;
                if(c==3){
                    x=1;
                }
            }
            else if(c==this.numTarjeta && b==this.contra){
                monto=a.getPrecio();
                if(this.saldo<monto){
                    JOptionPane.showMessageDialog(null, "transacción fallida");                              
                }
                else if(this.saldo>=monto){
                    JOptionPane.showMessageDialog(null, "Transacción exitosa");
                    this.saldo=this.saldo-monto;
                }
            }
            
        }
        
    }
    
}
    
