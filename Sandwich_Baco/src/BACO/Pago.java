/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACO;

/**
 *
 * @author Al3jo
 */
public abstract class Pago {
    
    protected final cliente titular;
    protected double monto;

    public Pago(cliente titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }

    public cliente getTitular() {
        return titular;
    }

    public double getMonto() {
        return monto;
    }
}
