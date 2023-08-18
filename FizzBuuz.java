/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class FizzBuuz {

    public static void main(String[] args) {
        fizzbuzz();
    }

    public static void fizzbuzz() {
        int numero;
        for (numero = 1; numero < 101; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0){
                System.out.println("fizzbuzz");
            }
            else if (numero % 3 == 0) {
                System.out.println("fizz");
            }
            else if(numero % 5 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println(numero);
            }
        }
    }
}
