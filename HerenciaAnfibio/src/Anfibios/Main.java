/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anfibios;

/**
 *
 * @author SALA
 */
public class Main {
    public static void main(String[] args) {
        Rana Rene=new Rana("Cafe", "Mediano", "Macho", "Pantano", "Amolops","Akhaorum");
        System.out.println(Rene);
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Que desea hacer?");
        String accion=input.nextLine();
        
        while (!accion.equals("")){
            if(accion.equals("Caminar") || accion.equals("caminar")){
                Rene.Caminar();
            }
            
            else if(accion.equals("Dormir") || accion.equals("dormir")){
                Rene.Dormir();
            }
            else if(accion.equals("Comer") || accion.equals("comer")){
                Rene.Comer();
            }
            System.out.println("¿Que desea hacer?");
            accion=input.nextLine();
        }
        
        
    }
