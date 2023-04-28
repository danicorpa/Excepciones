package Ejercicio01_DanielMartincorpa; /**
 * @author Daniel Martin Corpa
 * 28/4/23
 * 11:20
 * @version version of class
 * @since since version 1.0
 */

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);
    static int sumando1  = 0;
    static int sumando2  = 0;
    static char elecc;

    public static void main(String[] args) {
    iniciaPrograma();

    }
    public static void iniciaPrograma(){

        System.out.println("Elige tipo de suma : \n " + "1) Decimal\n 2) Entera");
        try{
            int eleccion = sc.nextInt();
            if(eleccion==1 || eleccion==2){
                System.out.println("Introduce sumando 1: ");
                sumando1 = sc.nextInt();
                System.out.println("Introduce sumando 2: ");
                sumando2 = sc.nextInt();
                System.out.println("El resultado la suma " + sumando1 +" y "+sumando2 +" es: "+sumaEnteros(sumando1, sumando2));
            }else {
                System.out.println("Debes introducir un número (1/2).");
            }
        }catch(InputMismatchException e){
            System.out.println("Ha ocurrido un error.");

        }finally{
            System.out.println("El programa ha terminado.\nQuieres volver a probar?? S/N");
            elecc = sc.next().charAt(0);
            if(elecc == 'S' || elecc == 's'){
                reiniciaPrograma();
            }else{
                System.out.println("Hasta pronto!!");
            }

        }

    }
    public static int sumaEnteros(int a, int b) {
        System.out.println("Suma de " + a + " + " + b + " = ");
        return a + b;
    }
    public static void reiniciaPrograma(){
        iniciaPrograma();
    }
}
