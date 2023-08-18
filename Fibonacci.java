/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci();
    }

    private static void fibonacci(){
       int numero = 50;
       long[] numerosFibonacci = new long[numero];
       numerosFibonacci[0] = 0;
       numerosFibonacci[1] = 1;

       for (int i = 2; i < numero; i++){
           numerosFibonacci[i] = numerosFibonacci[i - 1] + numerosFibonacci [i - 2];
       }

       for (int i = 0; i < numero; i++){
           System.out.println(numerosFibonacci[i] + " ");
       }
    }
}
