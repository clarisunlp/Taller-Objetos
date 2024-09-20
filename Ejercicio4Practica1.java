import PaqueteLectura.Lector;
public class Ejercicio4Practica1 {
    public static void main(String[] args) {
        int[][] edificio;
        edificio = new int[8][4];
        int i,j;
        
        for (i=0; i<8; i++) 
            for (j=0; j<4; j++)
                edificio[i][j]=0;
    
        int piso, oficina, cortePiso=9; 
        System.out.println("ingrese el numero de piso");
        piso=Lector.leerInt();
        while (piso!=cortePiso)
        {
            System.out.println("ingrese el numero de oficina");
            oficina=Lector.leerInt(); 
            edificio[piso][oficina]++;
            System.out.println("ingrese el numero de piso");
            piso=Lector.leerInt();      
        }
        System.out.println("   0 1 2 3");
        for (i=0; i<8; i++) {
            System.out.print(i+"|");
            for (j=0; j<4; j++)
                System.out.print(" "+edificio[i][j]);
        System.out.print("|");
        System.out.println();
        }
    }
    }
    
