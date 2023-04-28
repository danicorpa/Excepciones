package Ejercicio01_DanielMartincorpa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Daniel Martin Corpa
 * 28/4/23
 * 12:57
 * @version 1.0
 * @throws ArrayIndexOutOfBoundsException,InputMismatchException

 */



public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = {1.3,4.5,6.7,7.8,7.9};
        System.out.println("Tenemos este array de tipo double: ");
        for (double numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("Vamos a intentar añadir otro número: ");
        System.out.println("Inserta la posición: ");
        int pos = sc.nextInt();
        System.out.println("Ahora introduce un numero: ");
        try{
            double valor = sc.nextDouble();
            numeros[pos] = valor;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n\nTe has pasado de posición!!. Melón!!");
        }catch(InputMismatchException e1){
            System.out.println("Por favor, introduce un número.");
        }
        System.out.println("Las execpciones que salen son: \nArrayIndexOutOfBoundsException cuando me paso de posición, \nInputMismatchException cuando meto un tipo que no sea un entero o un double.");
        for (double numero : numeros) {
            System.out.println(numero);
        }


    }
}
