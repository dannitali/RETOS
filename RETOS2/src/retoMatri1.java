import java.util.Scanner;

public class retoMatri1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaramos matrices
        String [][] palabras = new String[3][3];

        System.out.println("------------------------------------------------------------");
        System.out.println("Ingresa palabras cortas");

        //Llenamos la matriz
        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 3; c++){
                System.out.println("Ingrese la palabra en la fila " + (f + 1) + " y la columna " + (c + 1) + ": ");
                palabras[f][c] = sc.next();
            }
            System.out.println("");
        }

        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 3; c++){
                System.out.print(palabras[f][c] + "\t");
            }System.out.println("");
        }
           

           sc.close(); 

        }
    }
