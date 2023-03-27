import java.util.Scanner;
public class retoArre1 {

    public static void main(String [] args){

        int n;

        Scanner captura=new Scanner(System.in);


        System.out.println("Ingrese la cantidad de numeros que desea ingresar");
        n = captura.nextInt();

        int [] num =new int [n]; //n tamaño

        for (int i=0; i<num.length;i++){//nombre de la clase
            System.out.println("Digite los numeros" + i);
            num [i]=captura.nextInt(); //posicion
            
        }

        for (int i=0; i<num.length;i++){
            if (num[i] % 2 == 0){
                System.out.println("los numeros pares ingresado son " + num [i]);
                
            }
            
            else {
                System.out.println("No hay numeros pares dentro de los numeros digitados");
            }
        }
    captura.close();
    
}

}
