import java.util.Scanner; 
public class retoMatri2 { 

    public static void main(String[] args) { 

        Scanner lectura=new Scanner(System.in); 

        // Creamos la matriz  

        String [][] producto = new String [4][4]; 

        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 

                System.out.println("Digite el nombre y  precio del producto" + "  Su Posicion es "+i+","+j); 
                producto[i][j] = lectura.next();  
                            
            } 

            System.out.println("");
        } 

        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.print(producto[i][j] +"\t");                  

            } 

            System.out.println(); 

        } 
        lectura.close();

    } 

}





