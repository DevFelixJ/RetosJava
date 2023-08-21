/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

import java.util.Scanner;

public class InvertirCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadenaTexto = scanner.nextLine();

        String cadenaInvertida = invertirCadena(cadenaTexto);
        System.out.println("Cadena invertida: " + cadenaInvertida);

    }

    private static String invertirCadena(String cadenaTexto){

        //Obtener la cadena de texto y meterlo en un array.

        char[] cadenaTextoArray = cadenaTexto.toCharArray();
        int longitud = cadenaTextoArray.length;

        //Invertir el array.
        for (int i = 0; i < longitud / 2; i++){
            char temp = cadenaTextoArray[i];
            cadenaTextoArray[i] = cadenaTextoArray[longitud - i - 1];
            cadenaTextoArray[longitud - i - 1] = temp;
        }
        return new String(cadenaTextoArray);
    }
}


/* Forma de hacerlo usando funciones propias del lenguaje
import java.util.Scanner;


public class InvertirCadenas {
    public static void main(String[] args) {
        invertirPalabra();
    }

    private static void invertirPalabra(){

        //Obtener la cadena de texto y meterlo en un array.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadenaTexto = myObj.nextLine();
        char[] cadenaTextoArray = cadenaTexto.toCharArray();

        //Invertir el array.

        for(int i = cadenaTexto.length() - 1; i >= 0; i--)
            System.out.print(cadenaTextoArray[i]);

    }
}

 */
