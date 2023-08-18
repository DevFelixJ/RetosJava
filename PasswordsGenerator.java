
/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16 = int length = generateRandomNumber(8, 16);
 * - Con o sin letras mayúsculas = boolean useUppercase = generateRandomBoolean();
 * - Con o sin números = boolean useNumbers = generateRandomBoolean();
 * - Con o sin símbolos = boolean useSymbols = generateRandomBoolean();
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */
import java.util.Random;

 public class PasswordsGenerator {

  public static void main(String[] args) {

    int length = generateRandomNumber(8, 16); //Esto genera una longitud aleatoria entre 8 y 16.
    boolean useUppercase = generateRandomBoolean(); //Booleano
    boolean useNumbers = generateRandomBoolean(); //Booleano
    boolean useSymbols = generateRandomBoolean(); //Booleano

    String password = generatePassword(length, useUppercase, useNumbers, useSymbols);
    System.out.println("Password generado: " + password); // Imprime la contraseña generada.
  }

  public static int generateRandomNumber(int min, int max){
        Random random = new Random(); // Crea una instancia de Random para generar números aleatorios.
        return random.nextInt(max - min + 1) + min; // Genera y devuelve un número aleatorio dentro del rango [min, max].
    }

    public static boolean generateRandomBoolean(){
        Random random = new Random(); // Crea una instancia de Random para generar valores booleanos aleatorios.
        return random.nextBoolean(); // Genera y devuelve un valor booleano aleatorio (verdadero o falso).
    }

    public static String generatePassword(int length, boolean useUppercase, boolean useNumbers, boolean useSymbols){

        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberChars = "0123456789";
        String symbolChars = "!@#$%^&*()_-+=<>?";

        StringBuilder validChars = new StringBuilder(lowercaseChars); // Inicializa un StringBuilder con caracteres en minúscula.
        if(useUppercase) {
            validChars.append(uppercaseChars); // Agrega caracteres en mayúscula al StringBuilder si se elige usar mayúsculas.
        }
        if(useNumbers){
            validChars.append(numberChars); // Agrega caracteres numéricos al StringBuilder si se eligen números.
        }
        if(useSymbols){
            validChars.append(symbolChars); // Agrega caracteres numéricos al StringBuilder si se eligen simbolos.
        }

        StringBuilder password = new StringBuilder(); // Crea un nuevo StringBuilder para construir la contraseña.
        Random random = new Random();// Crea una instancia de Random para generar índices aleatorios.

        for (int i = 0; i < length; i++){
            int randomIndex = random.nextInt(validChars.length()); // Genera un índice aleatorio dentro del tamaño de validChars.
            char randomChar = validChars.charAt(randomIndex); // Obtiene el carácter correspondiente al índice aleatorio.
            password.append(randomChar); // Agrega el carácter aleatorio a la contraseña en construcción.
        }

        return password.toString(); // Devuelve la contraseña generada como una cadena.

    }

    
 }

 //STRINGBUILDER//
//StringBuilder es una clase que forma parte de las bibliotecas estándar de Java. 
//es una característica incorporada en el lenguaje Java. L
//a clase StringBuilder se utiliza para construir y manipular cadenas de caracteres de manera más eficiente 
//que simplemente concatenar cadenas con el operador +.

//Al usar StringBuilder, puedes evitar problemas de rendimiento asociados con la concatenación repetida de cadenas, ya que StringBuilder realiza cambios en el lugar sin crear cadenas temporales adicionales en cada operación de concatenación.
 // la línea StringBuilder validChars = new StringBuilder(lowercaseChars); 
 //crea una instancia de StringBuilder y la inicializa con los caracteres en minúscula contenidos en lowercaseChars, 
 //que es una cadena definida previamente en el código. Luego, se pueden agregar más caracteres a esta instancia de StringBuilder 
 //según las opciones seleccionadas para generar la contraseña.