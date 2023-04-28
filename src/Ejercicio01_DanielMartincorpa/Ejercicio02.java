package Ejercicio01_DanielMartincorpa;
/**
 * @author Daniel Martin Corpa
 * 28/4/23
 * 12:19
 * @version version 1.0
 * @throws NumberFormatException,ArithmeticException
 */



public class Ejercicio02 {

    public static void main(String[] args) {
        System.out.println("Primer caso ArithmeticException : Se intenta hacer una operación que, aritméticamente hablando no es posible. ");

        int x = 5;
        int y = 0;
        System.out.println("Operando 1: " +x + "  + Operando 2: ");
        try {
            int z = x / y; // Esto arrojará una excepción ArithmeticException porque y es cero
        }catch(ArithmeticException e1){
            System.out.println("La division por 0 no es posible.");
        }
        System.out.println("\nSegundo caso NumberFormatException : Se intenta operar con datos que no son numeros enteros, por ejemplo String");
        String str = "abc";
        try{
            int num = Integer.parseInt(str); // Esto arrojará una excepción NumberFormatException porque "abc" no es un número válido
        }catch(NumberFormatException e2){
            System.out.println("No se puede operar con datos de tipo String.");
        }
        System.out.println("\nTercer caso OverflowException : Se da cuando se intenta operar con números más altos que los que el tipo puede manejar.");
        x = Integer.MAX_VALUE;
        y = x + 1; // Esto arrojará una excepción OverflowException porque y excede el valor máximo permitido para un int
        System.out.println("Este caso no me da error, lo que hace es dar la vuelta al resultado mostrando los números negativos.");
        System.out.println("Operando 1 -> "+x+" + Operando2 -> 1 = "+y);
        System.out.println("De hecho el chatGPT me dice que esa excepción no existe!!");
    }
}
