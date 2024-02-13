/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

//Importar Clases
import java.util.Scanner;   //Escanea datos de entrada por cmd (Genera el objeto)

/**
 *
 * @author _Windows_
 */
public class TextCotizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Terreno terreno = new Terreno();
        terreno.setAncho(35.5f);
        terreno.setLargo(100.0f);
        terreno.imprimirTerreno();
        
        Terreno ter = new Terreno(10.0f,90.0f);
        ter.imprimirTerreno();
        
        
        Terreno ter2 = new Terreno(terreno);
        ter2.imprimirTerreno();  */
        
        Terreno terreno = new Terreno();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        float perimetro = 0.0f, area = 0.0f, ancho = 0.0f, largo=0.0f;
        
        do{
                //Pintar el menu
                System.out.println("1-Iniciar el Objeto");
                System.out.println("2-Cambiar Ancho");
                System.out.println("3-Cambiar Largo");
                System.out.println("4-Mostrar Imformacion");
                System.out.println("Salir");
                System.out.println("Dame la opcion: ");
                opcion = sc.nextInt();
                
                switch(opcion){
                    case 1: 
                            System.out.println("Dame lo ancho del terreno");
                            ancho = sc.nextFloat();
                            System.out.println("Dame lo largo del terreno");
                            largo = sc.nextFloat();
                            terreno.setAncho(ancho);
                            terreno.setLargo(largo);
                            break;
                    case 2:
                           System.out.println("Dame lo ancho del terreno");
                           ancho = sc.nextFloat();
                           terreno.setAncho(ancho);
                           break;
                    case 3:
                           System.out.println("Dame lo largo del terreno");
                           largo = sc.nextFloat();
                           terreno.setLargo(largo);
                           break;
                    case 4:
                           terreno.imprimirTerreno();
                           break;
                    case 5:
                            System.out.println("Hasta la vista baby...!!");
                            
                    default:
                            System.out.println("No es una opcion valida...!!!");
                }



        }while(opcion!=5);
        
                
        
    }
    
}
