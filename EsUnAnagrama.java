import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class EsUnAnagrama {
    public static void main(String[] args) {
        System.out.println(isAnagram("Amor", "Roma"));
    }

    private static boolean isAnagram(String primeraPalabra, String segundaPalabra){
        if(primeraPalabra.toLowerCase() ==  segundaPalabra.toLowerCase()){
            return false;
        }
        char[] primeraPalabraArray = primeraPalabra.toLowerCase().toCharArray();
        char[] segundaPalabraArray = segundaPalabra.toLowerCase().toCharArray();
        Arrays.sort(primeraPalabraArray);
        Arrays.sort(segundaPalabraArray);
        return Arrays.equals(primeraPalabraArray, segundaPalabraArray);
    }

}