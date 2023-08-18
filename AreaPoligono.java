import java.awt.*;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class AreaPoligono {
    public static void main(String[] args) {
        double areaTriangulo = calcularAreaPoligono("triangulo", 5, 7);
        double areaCuadrado = calcularAreaPoligono("cuadrado", 4);
        double areaRectanculo = calcularAreaPoligono("rectangulo", 6, 8);
        System.out.println("Area de triangulo: " + areaTriangulo);
        System.out.println("Area de cuadrado: " + areaCuadrado);
        System.out.println("Area de rectangulo: " + areaRectanculo);

    }

    private static double calcularAreaPoligono(String tipoPoligono, double... lados){
        double area = 0.0;

        switch (tipoPoligono){
            case "triangulo":
                if (lados.length == 2){
                    double base = lados[0];
                    double altura = lados[1];
                    area = 0.5 * base * altura;
                }
                break;
            case "cuadrado":
                if(lados.length==1){
                    double lado = lados[0];
                    area = lado * lado;
                }
                break;
            case "rectangulo":
                if(lados.length == 2){
                    double longitud = lados[0];
                    double ancho = lados[1];
                    area = longitud * ancho;
                }
                break;
            default:
                System.out.println("Poligono no soportado");

                }
                return area;
        }
    }
