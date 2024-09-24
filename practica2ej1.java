/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class practica2ej1 {
    
    public static void main(String[] args) {
        
       GeneradorAleatorio.iniciar();
        
       String nom=(""); int unDNI, unaEdad;
       System.out.println("ingrese un nombre");
       nom=Lector.leerString();
       unDNI=GeneradorAleatorio.generarInt(100);
       unaEdad=GeneradorAleatorio.generarInt(90);
       
        Persona P = new Persona(nom, unDNI, unaEdad);
        
        System.out.println(P.toString());
    }
    
}
