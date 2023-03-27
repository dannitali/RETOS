import java.util.Scanner;
public class retoArre2 {

    public static void main(String [] args){

    int cantidadpart ;

    Scanner captura=new Scanner(System.in);

    System.out.println("Ingrese la cantidad de participantes");
    cantidadpart= captura.nextInt();

    String [] nombres =new String [cantidadpart];
    int [] tiempos =new int [cantidadpart];  


    for (int i=0; i<cantidadpart;i++){
    

        System.out.println("Participante # "+ i);
        
            System.out.println("ingrese el nombre del Participante "+ i);
            nombres[i]=captura.next();   


            System.out.println("ingrese el tiempo del Participante " + i);
            tiempos[i] =captura.nextInt();
            

        }


        for (int i=0; i<cantidadpart;i++){
                System.out.println("El Competidor " +nombres[i] +" tuvo un tiempo de " + tiempos[i]);
                
            }

    captura.close();


}
}


