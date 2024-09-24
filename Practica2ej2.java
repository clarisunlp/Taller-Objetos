/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
public class Practica2ej2 {
    public static void main(String[] args) {
        int dimF=15, corteEdad=0;
        String unNombre=(""); int unDNI, unaEdad; 
        int i,dimL=0;
        
        Persona[] vector;
        vector=new Persona[dimF];
       
        System.out.println("ingrese un nombre");
        unNombre=Lector.leerString();
        unDNI=GeneradorAleatorio.generarInt(100);
        System.out.println("ingrese la edad");
        unaEdad=Lector.leerInt();
        while((dimL<dimF)&&(unaEdad!=corteEdad)) {
            vector[dimL]=new Persona(unNombre, unDNI, unaEdad);
            System.out.println(vector[dimL].toString());
            System.out.println("ingrese un nombre");
            unNombre=Lector.leerString();
            unDNI=GeneradorAleatorio.generarInt(100);
            System.out.println("ingrese la edad");
            unaEdad=Lector.leerInt();
            dimL++;
        }
        
        int cant=0;
        for(i=0; i<dimL; i++)
            if(vector[i].getEdad()>65) cant++;
        System.out.println("La cantidad de personas mayores de 65 años es "+ cant); 
        
    }
    
}
